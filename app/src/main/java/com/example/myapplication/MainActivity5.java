package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity5 extends AppCompatActivity {
    EditText number1;
    EditText number2;
    EditText number3;
    EditText number4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main5);
        number1=findViewById(R.id.editTextNumber);
        number2=findViewById(R.id.editTextNumber5);
        number3=findViewById(R.id.editTextNumber6);
        number4=findViewById(R.id.editTextNumber7);
        number1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String s = number1.getText().toString();
                if (s.length()==1){
                    number2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        number2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String s = number2.getText().toString();
                if (s.length()==0){
                    number1.requestFocus();
                }
                if (s.length()==1){
                    number3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        number3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String s = number3.getText().toString();
                if (s.length()==0){
                    number2.requestFocus();
                }
                if (s.length()==1){
                    number4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        number4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String s = number4.getText().toString();
                if (s.length()==0){
                    number3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                codeRetrie();
            }
        });

        new CountDownTimer(59000,1000) {
            @Override
            public void onTick(long l) {
                String text = "Отправить код повторно можно будет через "+ l/1000 +" секунд";
                TextView edit1=findViewById(R.id.textView5);
                edit1.setText(text);

            }
            @Override
            public void onFinish() {
                String text= "Отправить код повторно";
                TextView edit1=findViewById(R.id.textView5);
                edit1.setTextColor(getResources().getColor(R.color.knopka2));
                edit1.setText(text);
                edit1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        code();
                        edit1.setText("           ");
                        edit1.setEnabled(false);
                             }
                });

            }
        }.start();

    }
    public void code()
    {
        SessionManager sessionManager = new SessionManager(this);
        String email = sessionManager.getEmail();
        ApiClient apiClient = new ApiClient();
        apiClient.getApiService(this).sendCode(email)
                .enqueue(new Callback<SendCodeResponse>() {
                    @Override
                    public void onResponse(Call<SendCodeResponse> call, Response<SendCodeResponse> response) {
                        if(!response.isSuccessful())
                        {

                            return;
                        }

                        return;
                    }

                    @Override
                    public void onFailure(Call<SendCodeResponse> call, Throwable t) {

                    }
                });
    }
    public void codeRetrie()
    {
        SessionManager sessionManager = new SessionManager(this);
        String email = sessionManager.getEmail();
        String code = number1.getText().toString() + number2.getText().toString() + number3.getText().toString()+number4.getText().toString();
        sessionManager.saveCode("online", code);
        ApiClient apiClient  = new ApiClient();
        apiClient.getApiService(this).signin(email, code)
                .enqueue(new Callback<SendCodeResponse>() {
                    @Override
                    public void onResponse(Call<SendCodeResponse> call, Response<SendCodeResponse> response) {
                        if(!response.isSuccessful())
                        {

                            return;
                        }
                        String str = response.message();
                        sessionManager.saveToken(SendCodeResponse.getMessage());
                        Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                        startActivity(intent);
                        return;
                    }

                    @Override
                    public void onFailure(Call<SendCodeResponse> call, Throwable t) {
                        if(code.equals(sessionManager.getOflineCode())){
                            Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                            startActivity(intent);
                        }

                    }
                });
    }
}
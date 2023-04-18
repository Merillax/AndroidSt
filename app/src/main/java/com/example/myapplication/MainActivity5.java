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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main5);
        EditText number1=findViewById(R.id.editTextNumber);
        EditText number2=findViewById(R.id.editTextNumber5);
        EditText number3=findViewById(R.id.editTextNumber6);
        EditText number4=findViewById(R.id.editTextNumber7);
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
                        ApiClient apiClient = new ApiClient();

                        apiClient.getApiService(this).sendCode()
                                .enqueue(new Callback<SendCodeResponse>() {
                                    @Override
                                    public void onResponse(Call<SendCodeResponse> call, Response<SendCodeResponse> response) {
                                        if(!response.isSuccessful())
                                        {

                                            return;
                                        }
                                        Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                                        startActivity(intent);
                                        return;
                                    }

                                    @Override
                                    public void onFailure(Call<SendCodeResponse> call, Throwable t) {
                                        Toast toast=Toast.makeText(MainActivity4.this, "Ошибка", Toast.LENGTH_LONG);
                                        toast.show();;
                                    }
                                });
                    }
                });

            }
        }.start();

    }
}
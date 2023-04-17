package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button but1 = findViewById(R.id.button2);
        EditText edit = findViewById(R.id.editTextTextEmailAddress2);
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String email=edit.getText().toString();
                if (email.contains("@") & email.contains(".")){
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka2));
                    but1.setEnabled(true);
                }else{
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka));
                    but1.setEnabled(false);
                }
            }
        });
    }



}
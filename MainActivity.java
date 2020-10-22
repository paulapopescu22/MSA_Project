package com.example.helios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.helios.data.LoginDataSource;
import com.example.helios.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edit=(EditText)findViewById(R.id.editTextTextPersonName5);
        edit.setKeyListener(null);
        button=(Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });
    }
    public void openLogin(){
        Intent intent1=new Intent(this, LoginActivity.class);
        startActivity(intent1);
    }
}
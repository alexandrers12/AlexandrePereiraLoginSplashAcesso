package com.marvelbankdigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Acesso extends AppCompatActivity {

    EditText Tlogin,Tsplash;
    Button btn1,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acesso);



    }
    public void BotaoLogin (View view){

            startActivity(new Intent(Acesso.this,MainActivity.class));

    }
    public void BotaoSplash (View view){

        startActivity(new Intent(Acesso.this,SplashScreen.class));

    }
}


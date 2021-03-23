package com.marvelbankdigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario,senha;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);



        }
        public void clicarBotao (View view){

if(usuario.getText().toString().equals("admin") && senha.getText().toString().equals("1234"))
    startActivity(new Intent(MainActivity.this,Acesso.class));
else
    Toast.makeText(this,"Usuario ou senha invalidos",Toast.LENGTH_SHORT).show();


        }
    }

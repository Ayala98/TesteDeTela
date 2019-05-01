package com.gabriel.telalogin01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText senha;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);
        botao = findViewById(R.id.baixar);
        botao.setOnClickListener(OnClickListener);
    }
        View.OnClickListener OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String salvarUsuario = login.getText().toString();
                final String salvarSenha = senha.getText().toString();

                if(salvarUsuario.equals("Ayala") && salvarSenha.equals("28111998")){

                    Intent intent = new Intent(MainActivity.this, DownloadImg.class);

                    startActivity(intent);

                }else{
                    Toast.makeText(MainActivity.this, "Erro, login ou senha errados", Toast.LENGTH_SHORT).show();
                }
            }
        };
}

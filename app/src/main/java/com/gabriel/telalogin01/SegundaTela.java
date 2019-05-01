package com.gabriel.telalogin01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SegundaTela extends AppCompatActivity {

    private EditText addProd;
    private Button button;
    private ListView lista;
    private ArrayList<String> produtos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        addProd = findViewById(R.id.addProd);
        button = findViewById(R.id.button);
        lista = findViewById(R.id.lista);
        produtos = new ArrayList<>();

        View.OnClickListener OnclickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                produtos.add(addProd.getText().toString());

                ArrayAdapter adapter = new ArrayAdapter(SegundaTela.this, android.R.layout.simple_list_item_1, produtos);

                lista.setAdapter(adapter);
            }
        };

        button.setOnClickListener(OnclickListener);

    }
}

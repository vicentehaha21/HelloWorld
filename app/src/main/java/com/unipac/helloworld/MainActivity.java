package com.unipac.helloworld;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nomeEdt;
    Button salvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nomeEdt = (EditText) findViewById(R.id.nomeEdt);

        Button salvar = (Button)   findViewById(R.id.salvarBtn);

        salvar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String nome = nomeEdt.getText().toString();
                Toast.makeText(MainActivity.this, "nome é " + nome, Toast.LENGTH_LONG);
            }
        });
    }

}
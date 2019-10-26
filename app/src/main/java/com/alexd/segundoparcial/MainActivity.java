package com.alexd.segundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button agre, lista, orden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.agre=findViewById(R.id.btnAgregar);
        this.lista=findViewById(R.id.btnLista);
        this.orden=findViewById(R.id.btnOrden);

        this.agre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent agg = new Intent(MainActivity.this, agregarContactos.class);
                startActivity(agg);
            }
        });

        this.lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent lista = new Intent(MainActivity.this, listacontactos.class);
                startActivity(lista);
            }
        });
    }

}

package com.alexd.segundoparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Adaptadores.Contactos;
import Adaptadores.adaptadorContactos;

public class listacontactos extends AppCompatActivity {
    private List<Contactos> dataSources;
    private RecyclerView rContactos;
    private LinearLayoutManager lManager;
    private adaptadorContactos adaptador;
    public static List<Contactos>lstContacto=new ArrayList<>();
    private Contactos con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listacontactos);

        this.rContactos = findViewById(R.id.rvContactos);
        this.CargarDatos();
        this.lManager = new LinearLayoutManager(this);
        this.adaptador = new adaptadorContactos(this.dataSources);

        this.rContactos.setHasFixedSize(true);
        this.rContactos.setLayoutManager(this.lManager);
        this.rContactos.setAdapter(this.adaptador);



    }

    private void CargarDatos(){
        this.dataSources = lstContacto;
    }
}

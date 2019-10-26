package com.alexd.segundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Adaptadores.Contactos;

import static com.alexd.segundoparcial.listacontactos.lstContacto;

public class agregarContactos extends AppCompatActivity {
    private EditText nombre,apellido,tel1,tel2;
    private Button agrdo;
    public static String nom,ape,t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregarcontactos);
        this.agrdo=findViewById(R.id.btnagregado);
        this.nombre=findViewById(R.id.edtNom);
        this.apellido=findViewById(R.id.edtApe);
        this.tel1=findViewById(R.id.edtT1);
        this.tel2=findViewById(R.id.edtT2);

    }

    public void Datos(View v){
        if(nombre.getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
        }else{
            if(apellido.getText().toString().isEmpty()){
                Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
                }else{
                    if(tel1.getText().toString().isEmpty()) {
                        Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
                    }else{
                        if(tel2.getText().toString().isEmpty()){
                            Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
                        }else{
                            nom=nombre.getText().toString();
                            ape=apellido.getText().toString();
                            t1=tel1.getText().toString();
                            t2=tel2.getText().toString();
                            Contactos nuevoContacto = new Contactos();
                            nuevoContacto.setNombre(nom);
                            nuevoContacto.setApellido(ape);
                            nuevoContacto.setTel1(t1);
                            nuevoContacto.setTel2(t2);
                            lstContacto.add(nuevoContacto);
                            Intent listo = new Intent(this, MainActivity.class);
                            startActivity(listo);
                        }

                    }
                }
        }
    }
}

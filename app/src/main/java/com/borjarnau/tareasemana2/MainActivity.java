package com.borjarnau.tareasemana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Datos DatosPersona ;

    EditText etNombreCompleto;
    EditText etTelefono;
    EditText  etEmail;
    EditText etDia;
    EditText etMes;
    EditText etAño;
    EditText etDescripcion;
    String name;
    String phone;
    String email;
    String dia;
    String mes;
    String año;
    String descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btButtonSig = (Button)findViewById(R.id.btButtonSig);



        btButtonSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etNombreCompleto = (EditText)findViewById(R.id.etNombreCompleto);
                name = etNombreCompleto.getText().toString();

                etTelefono = (EditText)findViewById(R.id.etTelefono);
                phone = etTelefono.getText().toString();

                etEmail = (EditText)findViewById(R.id. etEmail);
                email =  etEmail.getText().toString();

                etDia = (EditText)findViewById(R.id. etDia);
                dia = etDia.getText().toString();

                etMes = (EditText)findViewById(R.id. etMes);
                mes = etMes.getText().toString();

                etAño = (EditText)findViewById(R.id. etAño);
                año = etAño.getText().toString();

                etDescripcion = (EditText)findViewById(R.id. etDescripcion);
                descripcion = etDescripcion.getText().toString();


                DatosPersona = new Datos(name , phone, email, dia, mes, año, descripcion);


                Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);


                intent.putExtra(getResources().getString(R.string.pnombre), DatosPersona.getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono), DatosPersona.getPhone());
                intent.putExtra(getResources().getString(R.string.pemail), DatosPersona.getEmail());
                intent.putExtra(getResources().getString(R.string.pdia), DatosPersona.getDia());
                intent.putExtra(getResources().getString(R.string.pmes), DatosPersona.getMes());
                intent.putExtra(getResources().getString(R.string.paño), DatosPersona.getAño());
                intent.putExtra(getResources().getString(R.string.pdescripcion), DatosPersona.getDescripcion());


                startActivity(intent);




            }
        });
    }
}

package com.borjarnau.tareasemana2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class ConfirmarDatos extends AppCompatActivity {


    private TextView tvNombre;
    private TextView tvTelefono;
    private TextView tvEmail2;
    private TextView tvDia;
    private TextView tvMes;
    private TextView tvAño;
    private TextView tvDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmar_datos);



        Bundle parametros = getIntent().getExtras();

        String nuevoPnombre = parametros.getString(getResources().getString(R.string.pnombre));
        String nuevoPtelefono = parametros.getString(getResources().getString(R.string.ptelefono));
        String nuevoPemail = parametros.getString(getResources().getString(R.string.pemail));
        String nuevoPdia = parametros.getString(getResources().getString(R.string.pdia));
        String nuevoPmes = parametros.getString(getResources().getString(R.string.pmes));
        String nuevoPaño = parametros.getString(getResources().getString(R.string.paño));
        String nuevoPdescripcion = parametros.getString(getResources().getString(R.string.pdescripcion));

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvEmail2 = (TextView) findViewById(R.id.tvEmail2);
        tvDia = (TextView) findViewById(R.id.tvDia);
        tvMes = (TextView) findViewById(R.id.tvMes);
        tvAño = (TextView) findViewById(R.id.tvAño);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);



        tvNombre.setText(nuevoPnombre);
        tvTelefono.setText(nuevoPtelefono);
        tvEmail2.setText(nuevoPemail);
        tvDia.setText(nuevoPdia);
        tvMes.setText(nuevoPmes);
        tvAño.setText(nuevoPaño);
        tvDescripcion.setText(nuevoPdescripcion);


        Button btButtonEdit = (Button)findViewById(R.id.btButtonEdit);
        btButtonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                onBackPressed();


            }
        });


    }
}

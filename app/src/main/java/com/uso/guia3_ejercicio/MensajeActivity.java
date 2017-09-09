package com.uso.guia3_ejercicio;

/**
 * Created by Carlos on 08/09/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MensajeActivity extends AppCompatActivity {


    //declaracion de variables

    private EditText txtMensaje;
    private TextView txtFecha;
    private String Fecha;
    private Button btnEnviar;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        //inicializando variables
        txtMensaje   = (EditText) findViewById(R.id.txtMensaje);
        btnEnviar  = (Button) findViewById(R.id.btnEnviarMSJ);
        txtFecha = (TextView) findViewById(R.id.txtFecha);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //si alguno de los dos campos estan vacios
                if(txtMensaje.getText().toString().isEmpty() || txtFecha.getText().toString().isEmpty() ){
                    Toast.makeText(MensajeActivity.this,"Inserta los datos del contacto",Toast.LENGTH_SHORT).show();
                }else{//de lo contrario los campos estan llenos
                    //envio los datos al MainActivity
                    Intent resultIntent = new Intent();
                    // TODO envio los datos mediante el intent
                    resultIntent.putExtra("NOMBRE",txtFecha.getText().toString());
                    resultIntent.putExtra("FECHA",txtFecha.getText().toString());
                    setResult(Principal.GUARDADO, resultIntent);
                    finish();
                }
            }
        });
    }
}

package com.example.luciano.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button boton;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.button7); //colocamos el id del boton
        boton.setOnClickListener(this); //con esto habilito el boton

        Intent intent2 = getIntent(); //recibimos el intent es para cachar lo que viene
        Bundle bundle = intent2.getExtras(); //para obtener los extras del intent
        Bundle mibundle = this.getIntent().getExtras();
       if (bundle!=null) {
          contador = mibundle.getInt("oh");
       }
        switch (contador) {
            case 0:
                textView = (TextView)findViewById(R.id.textView11); //enlazamos el text view con su id
                break;
            case 1:
                textView = (TextView)findViewById(R.id.textView); //enlazamos el text view con su id
                break;
            default:
                break;
        }
        if (bundle!=null){
            String cadena = (String) bundle.get("dato"); //nos aseguramos que no venga nulo para no haber error

            textView.setText(cadena); //lo transformo en cadena

        }
    }

    @Override
    public void onClick(View v) {//aqui se creo el medodo onclick porque estoy implementando on clicklistener
        switch (v.getId()) { // aqui obtengo lo que viene del metodo on click
            case R.id.button7:
                Intent intent = new Intent(this,Main2Activity.class); //inten que llama a Main2Activity
                startActivity(intent); //con esta sentencia incio el intent de arriba
                break;
            default:
                break;

        }
    }
}

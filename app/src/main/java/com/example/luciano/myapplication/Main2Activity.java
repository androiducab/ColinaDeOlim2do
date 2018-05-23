package com.example.luciano.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    int contador2;
    int contador3
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main2);
        Button btn1 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(this); // Habilito los botones
        Button btn2 = (Button) findViewById(R.id.button3);
        btn2.setOnClickListener(this); // Habilito los botones
        Button btn3 = (Button) findViewById(R.id.button4);
        btn3.setOnClickListener(this); // Habilito los botones
        Button btn4 = (Button) findViewById(R.id.button5);
        btn4.setOnClickListener(this); // Habilito los botones
        Button btn5 = (Button) findViewById(R.id.button6);
        btn5.setOnClickListener(this); // Habilito los botones
        Button btn6 = (Button) findViewById(R.id.button9);
        btn6.setOnClickListener(this); // Habilito los botones
        Button btn7 = (Button) findViewById(R.id.button10);
        btn7.setOnClickListener(this); // Habilito los botones
        Button btn8 = (Button) findViewById(R.id.button12);
        btn8.setOnClickListener(this); // Habilito los botones
        Button btn9 = (Button) findViewById(R.id.button13);
        btn9.setOnClickListener(this); // Habilito los botones
        Button btn10 = (Button) findViewById(R.id.button14);
        btn10.setOnClickListener(this); // Habilito los botones
        Button btn11 = (Button) findViewById(R.id.button15);
        btn11.setOnClickListener(this); // Habilito los botones
        Button btn12 = (Button) findViewById(R.id.button16);
        btn12.setOnClickListener(this); // Habilito los botones
        Button btn13 = (Button) findViewById(R.id.button17);
        btn13.setOnClickListener(this); // Habilito los botones
        Button btn14 = (Button) findViewById(R.id.button18);
        btn14.setOnClickListener(this); // Habilito los botones
        Button btn15 = (Button) findViewById(R.id.button19);
        btn15.setOnClickListener(this); // Habilito los botones
        Button btn16 = (Button) findViewById(R.id.button20);
        btn16.setOnClickListener(this); // Habilito los botones
        Button btn17 = (Button) findViewById(R.id.button21);
        btn17.setOnClickListener(this); // Habilito los botones
        Button btn18 = (Button) findViewById(R.id.button22);
        btn18.setOnClickListener(this); // Habilito los botones
        Button btn19 = (Button) findViewById(R.id.button23);
        btn19.setOnClickListener(this); // Habilito los botones
        Button btn20 = (Button) findViewById(R.id.button24);
        btn20.setOnClickListener(this); // Habilito los botones
    }

    @Override
    public void onClick(View v) {
        Intent intent2 = new Intent(this, MainActivity.class);
        Bundle mibundle = new Bundle();
        contador2 = contador2 + 1;
        mibundle.putInt("count",contador2);
        intent2.putExtra("oh",mibundle);

        switch (v.getId()) {

            case R.id.button2:
                String producto = "arroz";

                intent2.putExtra("dato", producto); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button3:
                String producto1 = "mantequilla";

                intent2.putExtra("dato", producto1); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button4:
                String producto2 = "pan";

                intent2.putExtra("dato", producto2); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button5:
                String producto3 = "papas";

                intent2.putExtra("dato", producto3); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button6:
                String producto4 = "queso";
                intent2.putExtra("dato", producto4); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button9:
                String producto5 = "maiz";
                intent2.putExtra("dato", producto5); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button10:
                String producto6 = "huevos";
                intent2.putExtra("dato", producto6); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button21:
                String producto7 = "flips";
                intent2.putExtra("dato", producto7); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button12:
                String producto8 = "leche";
                intent2.putExtra("dato", producto8); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button13:
                String producto9 = "salsa";
                intent2.putExtra("count", contador2);
                intent2.putExtra("dato", producto9); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button14:
                String producto10 = "mayonesa";
                intent2.putExtra("dato", producto10); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button15:
                String producto11 = "harinatrigo";
                intent2.putExtra("count", contador2);
                intent2.putExtra("dato", producto11); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button16:
                String producto12 = "cocacola";
                intent2.putExtra("dato", producto12); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button17:
                String producto17 = "cebolla";
                intent2.putExtra("dato", producto17); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button18:
                String producto18 = "pimenton";
                intent2.putExtra("dato", producto18); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button19:
                String producto19 = "salchicha";
                intent2.putExtra("dato", producto19); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button20:
                String producto20 = "tocineta";
                intent2.putExtra("dato", producto20); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button22:
                String producto21 = "jamon";
                intent2.putExtra("dato", producto21); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button23:
                String producto22 = "tequeños";
                intent2.putExtra("dato", producto22); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
            case R.id.button24:
                String producto23 = "cambur";
                intent2.putExtra("dato", producto23); //envio los datos, del otro lado buscare dato no producto
                startActivity(intent2);
                break;
        }

    }
}

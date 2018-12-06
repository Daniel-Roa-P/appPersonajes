package com.example.danbr.personajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button boton;
    private CheckBox arma,escudo,montura;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] letra = {"Elija Personaje","Elfo","Humano","Orco"};
        spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, letra));
        boton = (Button)findViewById(R.id.button);
        arma = (CheckBox)findViewById(R.id.checkBox);
        montura = (CheckBox)findViewById(R.id.checkBox2);
        escudo = (CheckBox)findViewById(R.id.checkBox3);
        imagen = (ImageView)findViewById(R.id.imageView);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(spinner.getSelectedItem().equals("Elfo")){

                    imagen.setImageResource(R.mipmap.elfo2);

                }   else if(spinner.getSelectedItem().equals("Humano")){

                    imagen.setImageResource(R.mipmap.hombre2);

                }   else if(spinner.getSelectedItem().equals("Orco")){

                    imagen.setImageResource(R.mipmap.cosaverde2);

                }

                if(arma.isChecked()==true){

                    System.out.println("Arma confirmada");

                }

                if(montura.isChecked()==true){

                    System.out.println("montura confirmado");

                }

                if(escudo.isChecked()==true){

                    System.out.println("escudo confirmado");

                }



            }
        });


    }
}

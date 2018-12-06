package com.example.danbr.personajes.Main;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.danbr.personajes.Builder.ConstructorElfo;
import com.example.danbr.personajes.Builder.ConstructorHumano;
import com.example.danbr.personajes.Builder.ConstructorOrco;
import com.example.danbr.personajes.R;
import com.example.danbr.personajes.Builder.Director;
import com.example.danbr.personajes.Builder.Personaje;


public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button boton;
    private CheckBox arma,escudo,montura;
    private ImageView imagen;
    private Director director = new Director();
    private Personaje personaje =new Personaje();

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

             if(spinner.getSelectedItem().equals("Elfo") || spinner.getSelectedItem().equals("Humano") || spinner.getSelectedItem().equals("Orco")) {

                 if (spinner.getSelectedItem().equals("Elfo")) {

                     director.setConstructor(new ConstructorElfo());

                 } else if (spinner.getSelectedItem().equals("Humano")) {

                     director.setConstructor(new ConstructorHumano());

                 } else if (spinner.getSelectedItem().equals("Orco")) {

                     director.setConstructor(new ConstructorOrco());
                     ;

                 }

                 director.construirPersonaje();
                 personaje = director.getPersonaje();

                 if (arma.isChecked() == true) {

                     director.añadirArma();

                 }

                 if (montura.isChecked() == true) {

                     director.añadirMontura();

                 }

                 if (escudo.isChecked() == true) {

                     director.añadirEscudo();

                 }

                 int idImagen = getResources().getIdentifier("com.example.danbr.personajes:mipmap/" + personaje.getConjunto(), null, null);

                 imagen.setImageResource(idImagen);

             }
            }
        });


    }
}

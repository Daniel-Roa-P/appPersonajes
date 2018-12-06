
package com.example.danbr.personajes.Builder;

import com.example.danbr.personajes.AbstractFactory.Arco;
import com.example.danbr.personajes.AbstractFactory.Reno;
import com.example.danbr.personajes.AbstractFactory.EscudoElfo;
import com.example.danbr.personajes.AbstractFactory.Elfo;

public class ConstructorElfo extends Constructor {
    
    @Override
    public void construirPersonaje() {
       
        arma=new Arco();
        montura=new Reno();
        escudo=new EscudoElfo();
        apariencia=new Elfo();  
        
    }

    @Override
    public void construirArma() {
        
        personaje.setArma(arma.mostrar());
        personaje.setConjunto();
    }

    @Override
    public void construirEscudo() {
        
        personaje.setEscudo(escudo.mostrarEscudo());
        personaje.setConjunto();        
    }

    @Override
    public void construirMontura() {
        
        personaje.setMontura(montura.mostrarMontura());
        personaje.setConjunto();
    }

    @Override
    public void construirApariencia() {
        
        personaje.setAspecto(apariencia.mostrarApariencia());
        personaje.setConjunto();
    }

}

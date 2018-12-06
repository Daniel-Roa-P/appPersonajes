/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.danbr.personajes.Builder;

import com.example.danbr.personajes.AbstractFactory.Espada;
import com.example.danbr.personajes.AbstractFactory.Caballo;
import com.example.danbr.personajes.AbstractFactory.EscudoHumano;
import com.example.danbr.personajes.AbstractFactory.Humano;
/**
 *
 * @author danbr
 */
public class ConstructorHumano extends Constructor{
    
    
    
    @Override
    public void construirPersonaje() {
        
        arma=new Espada();
        montura=new Caballo();
        escudo=new EscudoHumano();
        apariencia=new Humano(); 
        
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

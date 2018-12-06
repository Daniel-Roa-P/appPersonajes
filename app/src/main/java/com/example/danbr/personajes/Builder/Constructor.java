
package com.example.danbr.personajes.Builder;

import com.example.danbr.personajes.AbstractFactory.ArmaAbstracta;
import com.example.danbr.personajes.AbstractFactory.AparienciaAbstracta;
import com.example.danbr.personajes.AbstractFactory.EscudoAbstracto;
import com.example.danbr.personajes.AbstractFactory.MonturaAbstracta;

public abstract class Constructor {
 
    protected Personaje personaje=new Personaje();
    protected ArmaAbstracta arma;
    protected EscudoAbstracto escudo;
    protected MonturaAbstracta montura;
    protected AparienciaAbstracta apariencia;
    
    
    public Personaje getPersonaje(){
        return personaje;
    }
    
    public abstract void construirPersonaje();
    public abstract void construirApariencia();
    public abstract void construirArma();
    public abstract void construirEscudo();
    public abstract void construirMontura();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diegomolina_12141157;

import java.util.Random;

/**
 *
 * @author diego
 */
public class SuperGranjero extends Aldeanos {
    Random r = new Random();
    private int puntosAtaque;

    public SuperGranjero() {
        super();
    }

    public SuperGranjero(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, 1000);
        this.puntosAtaque = 1000;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public String toString() {
        return "SuperGranjero: "+super.toString() + "puntosAtaque=" + puntosAtaque;
    }

    @Override
    public int Ataque(Aldeanos atacado) {
        if(atacado instanceof Herrero)return (int)Math.round(puntosAtaque*1.10);
        if(atacado instanceof Explosivo)return (int)Math.round(puntosAtaque*1.15);
        return puntosAtaque;
    }
    
    
}

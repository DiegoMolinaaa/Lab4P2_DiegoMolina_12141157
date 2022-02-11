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
public class Explosivo extends Aldeanos{
    Random r = new Random();
    private int puntosAtaque;

    public Explosivo() {
        super();
    }

    public Explosivo(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        this.puntosAtaque = 250;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public String toString() {
        return "Explosivo: "+super.toString() + "puntosAtaque=" + puntosAtaque + '}';
    }

    @Override
    public int Ataque(Aldeanos atacado) {
        int prob = 1+r.nextInt(99);
        if(prob>=1 && prob <=15){
            System.out.println("Ha Fallado!");
            return 0;
        }
        else{
            if(atacado instanceof Herrero)return (int)Math.round(puntosAtaque*1.05);
            if(atacado instanceof Agronomo)return (int)Math.round(puntosAtaque*1.10);
            return puntosAtaque;
        }
    }
    
    
}

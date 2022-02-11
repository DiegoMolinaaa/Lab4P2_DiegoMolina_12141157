/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diegomolina_12141157;

/**
 *
 * @author diego
 */
public class Herrero extends Aldeanos {
    private int puntosAtaque;

    public Herrero() {
        super();
    }

    public Herrero(int puntosAtaque, String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida+(int)(vida*0.5)) ;
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public String toString() {
        return "Herrero:"+super.toString() + "puntosAtaque=" + puntosAtaque + '}';
    }

    @Override
    public void Ataque(Aldeanos atacado) {
        
    }
    
    
}

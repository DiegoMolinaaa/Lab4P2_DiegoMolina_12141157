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
public class Normal extends Aldeanos{
    private int puntosAtaque;

    public Normal() {
        super();
    }

    public Normal(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        this.puntosAtaque = 50;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public String toString() {
        return "Normal:"+ super.toString() + "puntosAtaque=" + puntosAtaque + '}';
    }
    
}

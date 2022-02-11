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
public class SuperGranjero extends Aldeanos {
    private int puntosAtaque;

    public SuperGranjero() {
        super();
    }

    public SuperGranjero(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, 1000);
        this.puntosAtaque = 1000;
    }
    
}

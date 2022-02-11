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
public class Explosivo extends Aldeanos{
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
    public void Ataque(Aldeanos atacado) {
        
    }
    
    
}

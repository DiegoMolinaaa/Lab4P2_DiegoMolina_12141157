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
public class Pacifista extends Aldeanos{
    private String discurso;

    public Pacifista() {
        super();
    }

    public Pacifista(String discurso, String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        this.discurso = discurso;
    }

    public String getDiscurso() {
        return discurso;
    }

    public void setDiscurso(String discurso) {
        this.discurso = discurso;
    }

    @Override
    public String toString() {
        return "Pacifista:"+super.toString() + "discurso=" + discurso + '}';
    }
    
    
    
}

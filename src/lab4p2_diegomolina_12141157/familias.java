/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diegomolina_12141157;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class familias {
    private String apellido;
    private ArrayList<Aldeanos> aldeanos = new ArrayList();

    public familias() {
    }

    public familias(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Aldeanos> getAldeanos() {
        return aldeanos;
    }

    public void setAldeanos(ArrayList<Aldeanos> aldeanos) {
        this.aldeanos = aldeanos;
    }

    @Override
    public String toString() {
        return "familias{" + "apellido=" + apellido + ", aldeanos=" + aldeanos + '}';
    }
    
}

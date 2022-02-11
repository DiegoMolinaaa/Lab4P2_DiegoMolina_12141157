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
public class Herrero extends Aldeanos {
    Random r = new Random();
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
    public int Ataque(Aldeanos atacado) {
        int prob = 1+r.nextInt(99);
        if(prob>=1 && prob <=10){
            System.out.println("Ha Fallado!");
            return 0;
        }
        else{
            if(atacado instanceof Agronomo)return (int)Math.round(puntosAtaque*1.10);
            if(atacado instanceof Pacifista)return (int)Math.round(puntosAtaque*1.05);
            return puntosAtaque;
        }
        
    }
    
    
}

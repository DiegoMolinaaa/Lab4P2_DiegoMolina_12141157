/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diegomolina_12141157;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Lab4P2_DiegoMolina_12141157 {
    static Scanner lea = new Scanner(System.in);
    static ArrayList<familias> familias = new ArrayList();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        familias.add(new familias("Capuleto"));
        familias.add(new familias("Montesco"));
        familias.add(new familias("Pietro"));
        familias.get(0).getAldeanos().add(new Herrero(350, "Roberto", "Capuleto", 30, 200));
        familias.get(0).getAldeanos().add(new Agronomo("Marco", "Capuleto", 27, 200));
        familias.get(0).getAldeanos().add(new Normal("Julieta", "Capuleto", 20, 2000));
        familias.get(1).getAldeanos().add(new Herrero(400, "Juan", "Montesco", 26, 300));
        familias.get(1).getAldeanos().add(new Agronomo("Daniel", "Montesco", 24, 200));
        familias.get(1).getAldeanos().add(new SuperGranjero("Romeo", "Montesco", 21, 1000));
        familias.get(2).getAldeanos().add(new Normal("Carlos", "Pietro", 30, 150));
        familias.get(2).getAldeanos().add(new Agronomo("Fernando", "Pietro", 29, 200));
        char cent='s';
        while(cent=='s' || cent=='S'){
            System.out.println("1) Ingresar Familia");
            System.out.println("2) Ingresar Aldeano");
            System.out.println("3) Imprimir Familias");
            System.out.println("4) Pelear");
            System.out.println("5) Salir");
            System.out.print("Ingrese una opcion: ");
            int op = lea.nextInt();
            switch(op){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    cent='n';
                    break;
                }
                default:{
                    System.out.println("Ingrese una opcion valida");
                    break;
                }
            }//fin switch
        }// fin while
    }// fin main
    
}

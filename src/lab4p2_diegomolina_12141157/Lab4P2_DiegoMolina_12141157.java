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
                    crearFamilia();
                    break;
                }
                case 2:{
                    crearAldeano();
                    break;
                }
                case 3:{
                    imprimirFamilias();
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
    public static void crearFamilia(){
        System.out.print("Ingrese el nombre de la nueva familia: ");
        lea.nextLine();
        String apellido = lea.nextLine();
        boolean sePuede=true;
        for (familias ob : familias) {
            if(apellido.equalsIgnoreCase(ob.getApellido())){
                System.out.println("Debe de ingresar un nombre diferente a las familias existentes");
                sePuede=false;
                System.out.println("");
                break;
            }
        }
        if(sePuede==true){
            familias.add(new familias(apellido));
            System.out.println("Se ingreso la nueva familia");
            System.out.println("");
        }
    }
    public static void crearAldeano(){
        System.out.print("Ingrese el nombre del aldeano: ");
        lea.nextLine();
        String nombre = lea.nextLine();
        System.out.print("Ingrese el apellido del aldeano: ");
        String apellido = lea.nextLine();
        boolean sePudo=false;
        for (familias ob : familias) {
            if(apellido.equalsIgnoreCase(ob.getApellido())){
                int pos = familias.indexOf(ob);
                System.out.print("Ingrese la edad del aldeano: ");
                int edad = lea.nextInt();
                System.out.print("Ingrese la vida del aldeano: ");
                int vida = lea.nextInt();
                System.out.println("");
                System.out.println("1) Normal");
                System.out.println("2) Pacifista");
                System.out.println("3) Herrero");
                System.out.println("4) Agronomo");
                System.out.println("5) Explosivo");
                System.out.print("Ingrese una opcion: ");
                int op = lea.nextInt();
                while(op<1 || op>5){
                    System.out.println("Ingrese una opcion valida");
                    System.out.print("Ingrese una opcion: ");
                    op = lea.nextInt();
                }
                if(op==1){
                    familias.get(pos).getAldeanos().add(new Normal(nombre, apellido, edad, vida));
                }
                else if(op==2){
                    System.out.print("Ingrese un discurso de paz: ");
                    lea.nextLine();
                    String discurso = lea.nextLine();
                    familias.get(pos).getAldeanos().add(new Pacifista(discurso, nombre, apellido, edad, vida));
                }
                else if(op==3){
                    System.out.print("Ingrese los puntos de ataque del herrero [200-500]: ");
                    int puntosAtaque = lea.nextInt();
                    while(puntosAtaque<200 || puntosAtaque>500){
                        System.out.println("Debe de ingresar un numero entre 200 a 500");
                        System.out.print("Ingrese los puntos de ataque del herrero [200-500]: ");
                        puntosAtaque = lea.nextInt();
                    }
                    familias.get(pos).getAldeanos().add(new Herrero(puntosAtaque, nombre, apellido, edad, vida));
                }
                else if(op==4){
                    familias.get(pos).getAldeanos().add(new Agronomo(nombre, apellido, edad, vida));

                }
                else if(op==5){
                    familias.get(pos).getAldeanos().add(new Explosivo(nombre, apellido, edad, vida));

                }
                sePudo=true;
                break;
            }
        }
        if(sePudo==false){
            System.out.println("Debe de Ingresar un nombre de familia existente");
        }
        System.out.println("");
    }
    public static void imprimirFamilias(){
        for (familias ob : familias) {
            System.out.println(familias.indexOf(ob)+" -->"+ob.toString());
        }
        System.out.println("");
    }
}

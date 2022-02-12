/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_diegomolina_12141157;

import java.util.ArrayList;
import java.util.Collections;
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
            System.out.println("------------------------------------");
            System.out.println("1) Ingresar Familia");
            System.out.println("2) Ingresar Aldeano");
            System.out.println("3) Imprimir Familias");
            System.out.println("4) Pelear");
            System.out.println("5) Salir");
            System.out.print("Ingrese una opcion: ");
            int op = lea.nextInt();
            System.out.println("------------------------------------");
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
                    pelear();
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
    public static void pelear(){
        ArrayList<Aldeanos> familia1 = new ArrayList();
        ArrayList<Aldeanos> familia2 = new ArrayList();
        int posfam1 = 0;
        int posfam2=0;
        boolean entrafam1 = false;
        for (familias object : familias) {
            if(object.getApellido().equalsIgnoreCase("Montesco")){
                familia1 = object.getAldeanos();
                posfam1 = familias.indexOf(object);
                entrafam1 = true;
                break;
            }
        }
        if(entrafam1 == true){
            if((familias.size()-1)>1){
                System.out.print("Ingrese la familia que peleara: ");
                lea.nextLine();
                String apellido = lea.nextLine();
                while(apellido.equalsIgnoreCase("Capuleto")){
                    System.out.println("No puede Ingresar ese apellido");
                    System.out.print("Ingrese la familia que peleara: ");
                    apellido = lea.nextLine();
                }
                boolean entra = false;
                for (familias object : familias) {
                    String apellidoOb = object.getApellido();
                    if(apellidoOb.equalsIgnoreCase(apellido)){
                        familia2 = object.getAldeanos();
                        posfam2 = familias.indexOf(object);
                        entra=true;
                        break;
                    }    
                }
                while(entra==false){
                    System.out.println("Debe de Ingresar el nombre de una familia existente");
                    System.out.print("Ingrese la familia que peleara: ");
                    apellido = lea.nextLine();
                    for (familias object : familias) {
                        String apellidoOb = object.getApellido();
                        if(apellidoOb.equalsIgnoreCase(apellido)){
                            familia2 = object.getAldeanos();
                            posfam2 = familias.indexOf(object);
                            entra=true;
                            break;
                        }    
                    }
                }
                Collections.shuffle(familia1);
                Collections.shuffle(familia2);
                while(!(familia1.isEmpty()) || !(familia2.isEmpty())){
                    boolean vivo = false;
                    for (Aldeanos aldeanos : familia1) {
                        if(aldeanos.getNombre().equalsIgnoreCase("Romeo")){
                            vivo=true;
                        }
                        
                    }
                    if(vivo==false){
                        System.out.println("Romeo a Muerto");
                        System.out.println("Fin del Juego");
                        break;
                    }
                    int ataquefamiliar1 = 0; 
                    int ataquefamiliar2 = 0; 
                    while(familia1.get(0).getVida() > 0 && familia2.get(0).getVida() > 0){
                        int vida1Og = familia1.get(0).getVida();
                        int vida2Og = familia2.get(0).getVida();
                        ataquefamiliar1 = familia1.get(0).Ataque(familia2.get(0));
                        familia2.get(0).setVida( familia2.get(0).getVida() - ataquefamiliar1 );
                        System.out.println(familia1.get(0).getNombre() + " ha atacado a " + familia2.get(0).getNombre() + " haciendole " + ataquefamiliar1 + " dejandolo con " + familia2.get(0).getVida() + " de vida "  ); 
                        if(familia2.get(0).getVida() <= 0){
                            System.out.println("HA GANADO " + familia1.get(0).getNombre());
                            familia1.get(0).setVida(vida1Og);
                            familia2.remove(0);
                            break;
                        }else{
                            ataquefamiliar2 = familia2.get(0).Ataque(familia1.get(0));
                            familia1.get(0).setVida( familia1.get(0).getVida() - ataquefamiliar2);
                            System.out.println(familia2.get(0).getNombre() + " ha atacado a " + familia1.get(0).getNombre() + " haciendole " + ataquefamiliar2 + " dejandolo con " + familia1.get(0).getVida() + " de vida "  );        
                            if(familia1.get(0).getVida() <= 0){
                                System.out.println("HA GANADO " + familia2.get(0).getNombre());
                                familia2.get(0).setVida(vida2Og);
                                familia1.remove(0);
                                break;
                            }
                        }
                    }
                    if(familia2.isEmpty()){
                        System.out.println("Ha Ganado la familia "+familia1.get(0).getApellido());
                        familias.remove(posfam2);
                        break;
                    }
                    if(familia1.isEmpty()){
                        System.out.println("Ha Ganado la familia "+familia2.get(0).getApellido());
                        familias.remove(posfam1);
                        System.out.println("Los Capuletos han sido Victoriosos");
                        break;
                    }
                }    
            }
            else {
                if((familias.size()-1)==1){
                    for (familias ob : familias) {
                        if(ob.getApellido().equalsIgnoreCase("Capuleto")){
                            familia2 = ob.getAldeanos();
                            posfam2 = familias.indexOf(ob);
                        }
                    }
                    Collections.shuffle(familia1);
                    Collections.shuffle(familia2);
                    SuperGranjero romeo = new SuperGranjero();
                    Normal julieta = new Normal();
                    for (Aldeanos aldeanos : familia1) {
                        if(aldeanos.getNombre().equalsIgnoreCase("Romeo")){
                            romeo = (SuperGranjero)aldeanos;
                        }
                    }
                    for (Aldeanos aldeanos : familia2) {
                        if(aldeanos.getNombre().equalsIgnoreCase("Julieta")){
                            julieta = (Normal)aldeanos;
                        }
                    }
                    while(!(familia2.isEmpty())){
                        int ataquefamiliar1 = 0; 
                        int ataquefamiliar2 = 0; 
                        while(romeo.getVida() > 0 && familia2.get(0).getVida() > 0){
                            if(familia2.get(0).getNombre()=="Julieta"){
                                familia2.remove(0);
                            }
                            int vida1Og = romeo.getVida();
                            int vida2Og = familia2.get(0).getVida();
                            ataquefamiliar1 = romeo.Ataque(familia2.get(0));
                            familia2.get(0).setVida( familia2.get(0).getVida() - ataquefamiliar1 );
                            System.out.println(romeo.getNombre() + " ha atacado a " + familia2.get(0).getNombre() + " haciendole " + ataquefamiliar1 + " dejandolo con " + familia2.get(0).getVida() + " de vida "  ); 
                            if(familia2.get(0).getVida() <= 0){
                                System.out.println("HA GANADO " + romeo.getNombre());
                                romeo.setVida(vida1Og);
                                familia2.remove(0);
                                break;
                            }else{
                                ataquefamiliar2 = familia2.get(0).Ataque(romeo);
                                romeo.setVida( romeo.getVida() - ataquefamiliar2);
                                System.out.println(familia2.get(0).getNombre() + " ha atacado a " + romeo.getNombre() + " haciendole " + ataquefamiliar2 + " dejandolo con " + romeo.getVida() + " de vida "  );        
                                if(romeo.getVida() <= 0){
                                    System.out.println("HA GANADO " + familia2.get(0).getNombre());
                                    familia2.get(0).setVida(vida2Og);
                                    System.out.println("Los Capuletos Han Vencido a Romeo");
                                    break;
                                }
                            }
                        }
                        if(familia2.isEmpty()){
                            System.out.println("Romeo y Julieta seran Felices para Siempre");
                            familias.remove(posfam2);
                            break;
                        }
                    }
                }
                    
            }
        }
        else{
            System.out.println("Han Ganado los Capuletos");
        }
        
        
    }
}

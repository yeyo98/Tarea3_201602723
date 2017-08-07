/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201602723;

import java.util.Scanner;

/**
 *
 * @author mi pc
 */
public class Tarea3_201602723 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion1 = 0;
        int opcion2 = 0;
        int cont = 0;
        String personalizado;
        String[] usuarios = new String[5];
        String palabra;
        
        
        do{
        System.out.println("     Tarea 3    ");
        System.out.println("    201602723   ");
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Palabras Palindromas");
        System.out.println("3. Salir");
       
        try{
        Scanner op = new Scanner(System.in);
        opcion1 = op.nextInt();
        } catch(Exception e){
          System.out.println("Ingrese un valor correcto");
        }
        
        switch(opcion1){
            
            case 1: {
                
                    do{
                    System.out.println("    Menu de usuarios    ");
                    System.out.println("");
                    System.out.println("1. Ingrese Usuarios");
                    System.out.println("2. Mostrar todos los Usuarios");
                    System.out.println("3. Mostrar un usuario Personalizado");
                    System.out.println("4. Menu Principal");
                    System.out.println("5. Salir");
                    
                    try{
                    Scanner op2 = new Scanner(System.in);
                    opcion2 = op2.nextInt();
                    } catch(Exception e){
                        System.out.println("Ingrese un valor correcto");
                    }
                    
                        switch(opcion2){
                            
                            case 1:{
                                for(int i=0 ;i<5;i++){
                                    
                                    System.out.println("Ingrese usuario " +(i+1) +":");
                                    Scanner sv = new Scanner(System.in);
                                    String user = sv.nextLine();
                                    
                                    usuarios[i] = user;
                                }
                                break;
                            }
                            
                             case 2:{
                                 for(int i =0; i<5 ;i++){
                                     
                                     System.out.println("");
                                     System.out.println((i+1) +". " +usuarios[i]);
                                 }
                                
                                break;
                            }
                             
                             case 3:{ 
                                 
                                 System.out.println("Mostrar un usario Personalizado");
                                 System.out.println("      Ingrese Usuario      ");
                                 
                                 Scanner pe = new Scanner(System.in);
                                 personalizado = pe.nextLine();
                                 
                                 //for(int i=0; i<5 ;i++){
                                     if(usuarios[0] == personalizado){
                                     cont = cont+1;
                                     }
                             //}//fin de for
                                 System.out.println(cont);
                                 
                                break;
                            }
                             
                             case 5:{
                                 opcion1 = 3;
                                break;
                            }
                        }
                }while(opcion2!=4 && opcion2!=5);
                    break;
            }//fin del caso 1
            
            //inicio caso2
            case 2: {
                System.out.println("    Palabras Palindromas   ");
                System.out.println("    Ingresar palabras      ");
                
                Scanner pa = new Scanner(System.in);
                palabra = pa.nextLine();
                
                
                break;
            } // fin caso 2
            
        }
        }while(opcion1!=3);
    }
    
    /*public String palabra(String palabra){
        String aux = "";
        
        for(int i = 0; i<palabra.length() ;i++){
            
            if(!(palabra.substring(i, i+1).equals(" ")
                    || palabra.substring(i, i+1).equals(",")
                    || palabra.substring(i, i+1).equals("¿")
                    || palabra.substring(i, i+1).equals("?")
                    || palabra.substring(i, i+1).equals(".")
                    || palabra.substring(i, i+1).equals("¡")
                    || palabra.substring(i, i+1).equals("!"))){
            
                aux = aux + palabra.substring(i, i+1);
            }
        }
        
        for(int i=0; i<aux.length() ;i++){
            if(!aux.substring(i, i+1).equals(aux.substring(aux.length()-i-1, i)))
                return System.out.println("");
        }
        
    }*/
    
}

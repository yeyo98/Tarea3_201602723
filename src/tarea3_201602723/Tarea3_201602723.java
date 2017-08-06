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
        String[] usuarios = new String[5];
        
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
                    System.out.println("2. Mostrar todod los Usuarios");
                    System.out.println("3. Mostrar un usuario Personalizado");
                    System.out.println("4. Menu Principal");
                    System.out.println("5. Salir");
                    
                    Scanner op2 = new Scanner(System.in);
                    opcion2 = op2.nextInt();
                    
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
                                 
                                 }
                                
                                break;
                            }
                             
                             case 3:{
                                
                                break;
                            }
                             
                             case 4:{
                                
                                break;
                            }
                        
                        }
                
                }while(opcion2!=5);
            }
            
            case 2: {
            
                break;
            }
            
            case 3: {
            
                break;
            }
            
            
        }
        
    }
    
    //metodos
    /*public void Usuarios(String pri, String seg, String ter, String cuart, String quin){
        String[] users = new String[5];
        
        users[0] = pri;
        users[1] = seg;
        users[2] = ter;
        users[3] = cuart;
        users[4] = quin;
        
    }*/
    
}

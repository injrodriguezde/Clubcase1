/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubcase1;

import java.util.Scanner;


public class Clubcase1 {

    
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero del 1 al 7:");
       int dia = entrada.nextInt() ;
       
       switch (dia) {
           case 1:
               System.out.println("Es lunes");
               break;
               
           case 2:
               System.out.println("Es martes");
               break;
               
            case 3:
               System.out.println("Es miercoles");
               break;
            case 4:
               System.out.println("Es jueves");
               break;
            case 5:
               System.out.println("Es viernes");
               break;
            case 6:
               System.out.println("Es sabado");
               break;
            case 7:
               System.out.println("Es domingo");
               break;
               
            default:
                System.out.println("numero invalido, debio ingresar del 1 al 7");
                break;   
               
                 
               
               
           
       }
       
       
     
     
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mmendezn.a05;
import java.util.Scanner;
/**
 *
 * @author migue
 */
//miguel mendez nevarez
//Imt
public class SPPMMendezNA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        solicitaPalabra("Una palabra");
    solicitaNumero("Un numero entero");
    solicitarLong("Un numero grande");
    solicitarCaracter("Un caracter");
    }
    static String solicitaPalabra(String palabra){
     Scanner kb= new Scanner(System.in);
        String a = "";
        boolean flag;
        
        do{
            System.out.println("Introduce "+palabra);
            try{
               a=kb.nextLine();
               flag=true;
            } catch (Exception ex) {
               flag=false;
               System.out.println("Esto no es una cadena " +ex);
            kb.nextLine();
            }
       }while(flag==false);
        return a;
    }
    static double solicitaNumero(String mensaje){
     Scanner kb= new Scanner(System.in);
        double numero = 0;
        boolean flag;
        do{
            
            System.out.println("Introduce "+mensaje);
            try{
               numero=kb.nextDouble();
               flag=true;
            } catch (Exception ex) {
               flag=false;
               System.out.println("El numero insertado no es un entero " +ex);
            kb.nextLine();
            }
       }while(flag==false);
        return numero;
    }
    static long solicitarLong(String palabra){
        Scanner kb= new Scanner(System.in);
        long numerito = 0;
        boolean flag;
        do{
            
            System.out.println("Introduce "+palabra);
            try{
               numerito=kb.nextLong();
               flag=true;
            } catch (Exception ex) {
               flag=false;
               System.out.println("El numero obtenido no es un long " +ex);
               kb.nextLine();
            }
       }while(flag==false);
        return numerito;
    }
    static char solicitarCaracter(String palabra){
        Scanner kb= new Scanner(System.in);
        char i = 0;
        boolean flag;
        do{
            
            System.out.println("Introduce " +palabra);
            try{
               i=kb.next().charAt(0);
               flag=true;
            } catch (Exception ex) {
               flag=false;
               System.out.println("Esto no es caracter " +ex);
               kb.nextLine();
            }
       }while(flag==false);
        
        return i;
    }
    
}

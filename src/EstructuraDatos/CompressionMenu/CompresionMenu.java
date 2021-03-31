/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresionmenu;

import java.util.Scanner;

/**
 *
 * @author 57322
 */
public class CompresionMenu {  
    //Código copiado del enunciado
 CompressionAlgorithm algorithm;
 private void menu(Scanner sc){
     System.out.println("Seleccione una opción");
     System.out.println("1) para comprimir el archivo en zip");
     System.out.println("2) para comprimir el archivo en rar");
     System.out.println("3) para comprimir el archivo en 7z");
     int opc=Integer.parseInt(sc.nextLine());
     System.out.println("Digite el nombre del archivo");
     String filename=sc.nextLine();
     switch(opc){
         case 1:
             algorithm=new Zip();
             break;
             case 2:
             algorithm=new Rar();
             break;
             case 3:
             algorithm=new Sietezip();
             break;
     }
     algorithm.compress(filename);
 }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        CompresionMenu cm=new CompresionMenu();
        cm.menu(sc);
    }
    
}

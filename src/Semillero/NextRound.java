package Estructuras;

import java.util.Scanner;

public class NextRound {

    static Scanner sc = new Scanner(System.in);;

    public static void main(String[] args)  {
        int cont = 0;

        String texto =  sc.nextLine();
        String[] dato = texto.split(" ");
        int n = Integer.parseInt(dato[0]);
        int k = Integer.parseInt(dato[1]);

        int[] arreglito = new int[n];

        for (int i = 0; i < arreglito.length; i++) {
            arreglito[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arreglito.length; i++) {
            if (arreglito[i] > 0 && arreglito[i] >= arreglito[k-1]) {
                cont++;
            }
        }
        System.out.println(cont);
        sc.close();
    }
}
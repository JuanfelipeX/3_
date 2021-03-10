package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Modified_GCD {  // https://codeforces.com/problemset/problem/75/C  

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static ArrayList<Integer> a = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        
        String textos = br.readLine();
        String[] parts = textos.split(" ");
        int p = Integer.parseInt(parts[0]);
        int q = Integer.parseInt(parts[1]);

        int mcm = mcdRecursivo(p, q);

        listaDivisibles(mcm);

    }

    public static int mcdRecursivo(int p, int q) {

        if (p < q) {
            return mcdRecursivo(q, p);

        } else if (q == 0) {
            return p;

        }
        return mcdRecursivo(q, p % q);
    }
    
    public static void listaDivisibles(int mcm) throws NumberFormatException, IOException {

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) { //aqui se ingresan los datos 
            //String[] text = br.readLine().split("");
            String textos = br.readLine();
            String[] parts = textos.split(" ");
            int w = Integer.parseInt(parts[0]);
            int e = Integer.parseInt(parts[1]);


           
        }
        
        for (int i = 1; i < mcm; i++) {
            if (mcm % i == 0) { //aqui mira cuales son los divisibles
                // int vector[] = new int[i]; //aqui supuestamente llena los datos
                a.add(i);

                //añadir los numeros divisibles en vectores luego decir el numero entre el rango pedido este en esa lista si no dar -1
            }
        }
        
    }
    
}

package Estructuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Theatre_Square {
    
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        String texto = br.readLine();
        String[] dato = texto.split(" ");
        long n = Integer.parseInt(dato[0]);
        long m = Integer.parseInt(dato[1]);
        long a = Integer.parseInt(dato[2]);
        long result = ((m+a-1)/a)*((n+a-1)/a);
        System.out.println(result);
    }
    
}

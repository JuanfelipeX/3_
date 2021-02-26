package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaDosEnteros {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numero1 = Integer.parseInt(br.readLine());

        int numero2 = Integer.parseInt(br.readLine());

        int sumaTotal = numero1 + numero2;

        System.out.println(sumaTotal);


    }
}

package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciRecur {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la serie hasta donde quiere acabar: ");
        int serie = Integer.parseInt(br.readLine());
        System.out.println("La serie es: ");
        for (int i = 0; i < serie; i++) {
            System.out.println(SerieFibo(i));
        }
    }

    public static int SerieFibo(int serie) {

        if (serie == 0) {
            return 0;
        }
        if (serie == 1) {
            return 1;
        }
        return SerieFibo(serie - 1) + SerieFibo(serie - 2);
        
    }
    
}

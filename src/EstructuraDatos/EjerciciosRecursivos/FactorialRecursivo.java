package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialRecursivo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el factorial que quiera");
        int cantidadCartas = Integer.parseInt(br.readLine());
        //System.out.println("El factorial es:" + factorial(cantidadCartas));
        FactorialRecursivo factorial = new FactorialRecursivo();
        System.out.println("factorial:" + factorial.factorial(cantidadCartas));

    }
    
    public int factorial(int cantidadCartas) {
        if (cantidadCartas == 0) {
            return 1;
        }
        return cantidadCartas * factorial(cantidadCartas - 1);
    }
    
}

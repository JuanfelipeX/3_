package TecnicasProgramacion.Ejercicios.Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Par {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero:");
        int number = Integer.parseInt(br.readLine());
        if (number%2==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}

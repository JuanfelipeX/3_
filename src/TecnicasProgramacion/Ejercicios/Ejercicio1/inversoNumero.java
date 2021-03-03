package TecnicasProgramacion.Ejercicios.Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inversoNumero {

    public static void main(String[] args) throws IOException {
        int invertido=0, resto;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero:");
        int number = Integer.parseInt(br.readLine());
        while (number > 0) {
            resto = number % 10;
            invertido = (invertido * 10) + resto;
            number /= 10;
        }
        System.out.println("Numero invertido es: " + invertido);
    }
}

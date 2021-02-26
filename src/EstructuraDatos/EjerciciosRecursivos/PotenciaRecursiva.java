package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PotenciaRecursiva {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la base ");
        double base = Double.parseDouble(br.readLine());;
        System.out.println("Ingrese exponente ");
        int expo = Integer.parseInt(br.readLine());
        System.out.println("potencia(base, exponente)= " + potencia(base, expo));
    }

    public static double potencia(double base, int expo) {
        if (expo == 0) {
            return 1;
        }
        return potencia(base, expo - 1) * base;
    }
}
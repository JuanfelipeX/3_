package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaCubos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int [] datos = new int[a];
        for (int i = 0; i <= a; i++) {
            datos[i] = Integer.parseInt(br.readLine());
        }
    }
}

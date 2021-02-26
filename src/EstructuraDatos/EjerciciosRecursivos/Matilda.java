package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matilda {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println(orden(number));
    }

    public static int orden(int number) {
        if (number == 0) {
            return 1;
        }
        return orden(number - 1) * number;
    }
}

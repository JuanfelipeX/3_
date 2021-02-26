package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimoComunMultiplo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(br.readLine());
        int number2 = Integer.parseInt(br.readLine());
        int i = 2; 
        int mcm = 1;
        while (i <= number1 || i <= number2) {
            if (number1 % i == 0 || number2 % i==0) {
                mcm = mcm * i;

                if (number1 % i == 0)
                    number1 = number1 / i;

                if (number2 % i == 0)
                    number2 = number2 / i;

            } else {
                i = i + 1;
            }
        }
        System.out.println(mcm);
    }

}
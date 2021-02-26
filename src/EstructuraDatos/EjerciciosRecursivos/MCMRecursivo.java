package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MCMRecursivo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(br.readLine());
        int number2 = Integer.parseInt(br.readLine());
        System.out.println(miniMinimoComunMultiplo(number1, number2));

    }
    
    public static int mcdRecursivo(int p, int q) {

        if (p < q) {
            return mcdRecursivo(q, p);

        } else if (q == 0) {
            return p;

        }
        return mcdRecursivo(q, p % q);
    }

    public static int miniMinimoComunMultiplo(int number1, int number2) {
        return (number1 * number2)/ mcdRecursivo(number1, number2);
    }
}

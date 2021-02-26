package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MayorMenorRecursivo {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        System.out.println(MayorMenor(n1, n2));

    }
    
    public static int MayorMenor(int n1, int n2) {
        if (n2==n2) {
            int ResultadoN2 = ((n1 + n2) + (Math.abs(n2 - n1))) / 2;
            return ResultadoN2;
        }

        return MayorMenor(((n1+n2)+(Math.abs(n2-n1)))/2, n2);
    }
}

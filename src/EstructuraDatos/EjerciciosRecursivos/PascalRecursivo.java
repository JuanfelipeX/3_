package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalRecursivo {

   public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int base = 2;
    int expo = Integer.parseInt(br.readLine());
    System.out.println(potencia(base, expo));

}
        
    public static int potencia(int base, int expo) {
        if (expo == 0) {
            return 0;
        }
        return (potencia(base, expo - 1) * base)-1*-1;
    }
}

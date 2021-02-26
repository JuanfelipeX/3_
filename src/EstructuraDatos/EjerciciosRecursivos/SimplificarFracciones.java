package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimplificarFracciones {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String textos = br.readLine();
        String[] parts = textos.split("/");
        int numerador = Integer.parseInt(parts[0]);
        int denominador = Integer.parseInt(parts[1]);
        reducirFracciones(numerador, denominador);
    }

    public static void reducirFracciones(int numerador, int denominador) {

        for (int i = 2; i <= numerador; i++) { //puede ser numerador o denominador

            int residuoNumerador = numerador % i;
            int residuoDenominador = denominador % i;
            if (residuoNumerador == 0 && residuoDenominador == 0) {

                numerador = numerador / i;
                denominador = denominador / i;

                System.out.println(numerador + "/" + denominador);
                break;
            }
        }
    }
}



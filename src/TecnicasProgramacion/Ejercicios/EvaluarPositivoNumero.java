package TecnicasProgramacion.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvaluarPositivoNumero {
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero:");
        int number = Integer.parseInt(br.readLine());
        if (number==0) {
            System.out.println("El numero es nulo");
        } if (number > 0) {
            System.out.println("El numero es positivo");
        } if (number<0) {
            System.out.println("El numero es negativo");
        }
    }
}

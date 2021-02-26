package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContarNumero {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = Double.parseDouble(br.readLine());
        System.out.println(contarNumeros(numero));
    }

    public static int contarNumeros(double numero) {
        if (numero<10) {  //el numero tiene una cifra
            return 1;
        }
        return contarNumeros(numero/10)+1;  //se divide hasta que sea el numero sea menor de 10, luego se cuenta cuantas veces se dividio y hay da el numero de digitos
    }
}

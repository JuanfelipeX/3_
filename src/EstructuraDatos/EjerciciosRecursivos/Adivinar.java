package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adivinar {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        randomNumber(0, 100, 50);
    }

    public static void randomNumber(int limiteInferior, int limiteSuperior, int numeroPregunta) throws IOException {

        System.out.println("es " + numeroPregunta + "?");
        String signo = br.readLine();   
     
        if (signo.equalsIgnoreCase("+")) {
            limiteInferior = numeroPregunta;
            numeroPregunta = (limiteInferior + limiteSuperior) / 2;

            randomNumber(limiteInferior, limiteSuperior, numeroPregunta);

        } else if (signo.equalsIgnoreCase("-")) {
            limiteSuperior = numeroPregunta;
            numeroPregunta = (limiteInferior + limiteSuperior) / 2;

            randomNumber(limiteInferior, limiteSuperior, numeroPregunta);

        }else if(limiteInferior==limiteSuperior){

            System.out.println("Tramposo porque es:" + numeroPregunta);

        } else if (signo.equalsIgnoreCase("=")) {

            System.out.println("yuju!" + numeroPregunta);
        }
    }
}
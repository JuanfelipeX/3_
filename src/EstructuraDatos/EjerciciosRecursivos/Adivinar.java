package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adivinar {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        randomNumber(0, 100);
    }

    public static void randomNumber(int limiteInferior, int limiteSuperior) throws IOException {

        int mid = (limiteInferior + limiteSuperior) / 2;

        System.out.println("es " + mid + "?");
        String signo = br.readLine();   
     
        if (signo.equalsIgnoreCase("+")) {
            limiteInferior = mid;
            mid = (limiteInferior + limiteSuperior) / 2;
            if ((limiteInferior == limiteSuperior )) {
                System.out.println("Tramposo porque es: " + (mid-1));
            } else {
                  randomNumber(limiteInferior+1, limiteSuperior);   
            }

          

        } else if (signo.equalsIgnoreCase("-")) {
            limiteSuperior = mid;
            mid = (limiteInferior + limiteSuperior) / 2;

            if ((limiteInferior == limiteSuperior )){
                if (limiteInferior==limiteSuperior && limiteInferior!=0) {
                    System.out.println("Tramposo porque es: " + (mid-1 ));
                } else{
                System.out.println("Tramposo porque es: " + (mid ));
                }
            } else {
                randomNumber(limiteInferior, limiteSuperior - 1);
                
            }

        } else if (signo.equalsIgnoreCase("=")) {

            System.out.println("yuju!" + mid);
        }
    }
}
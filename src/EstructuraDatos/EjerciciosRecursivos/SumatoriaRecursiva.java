package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumatoriaRecursiva {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("n?");
        int sumatoria = Integer.parseInt(br.readLine());
        System.out.println("sum:" + sumatoria(sumatoria));
    }
    
    public static int sumatoria(int sumatoria) {
        if (sumatoria==0) {
            return 0;
        }
        return sumatoria + sumatoria(sumatoria-1);
    }
}

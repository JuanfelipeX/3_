package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Doemeris {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sumatoria = Integer.parseInt(br.readLine());
        int a = sumatoria(sumatoria);
        System.out.println(a+1);
    }

    public static int sumatoria(int sumatoria) {
        if (sumatoria == 0) {
            return 0;
        }
        return sumatoria + sumatoria(sumatoria-1) ;
    }
}
        

          

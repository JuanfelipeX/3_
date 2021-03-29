package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoRabbits {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {
            
            String texto = br.readLine();
            String[] dato = texto.split(" ");
            int x = Integer.parseInt(dato[0]);
            int y = Integer.parseInt(dato[1]);
            int a = Integer.parseInt(dato[2]);
            int b = Integer.parseInt(dato[3]);
            if ((y - x) % (a + b) == 0) {
                int result = ((x - y) / (a + b))*-1;
                System.out.println(result);

            } else {
                System.out.println("-1");
            }
        }

    }
}

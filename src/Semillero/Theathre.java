package Estructuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Theathre {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int number = Integer.parseInt(br.readLine());
        
        if (number%2==0 && number!=2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
        
           


package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class John_Hatman {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int numerador[] = new int[15];
    static int denominador[] = new int[15];
    
    public static void main(String[] args) throws NumberFormatException, IOException {

        test();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i--) {

            int n = Integer.parseInt(br.readLine());

            System.out.println(numerador[n] + "/" + denominador[n]);
        }
    }

    private static void test() {

        numerador[1] = 0;
        numerador[2] = 1;
        denominador[1] = 1;
        denominador[2] = 2;
        for (int i = 3; i < 15; i++) {

            numerador[i] = (i - 1) * (numerador[i - 2] + numerador[i - 1]);
            denominador[i] = denominador[i - 1] * i;
        }
    }
}

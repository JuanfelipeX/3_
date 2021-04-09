package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FidoAndLCM { 

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static long a, b, a1, b1;

    public static void main(String[] args) throws NumberFormatException, IOException {

        long x = Long.parseLong(br.readLine());

        for (int i = 1; (i * i) <= x; i++) {

            if (x % i == 0) {
                a = i;
                b = x / i;
                if (mcd(b, a) == 1) {
                    a1 = b;
                    b1 = x / b;
                    
                }
            }
        }

        System.out.println(b1 + " " + a1);
    }

    public static long mcd(long a, long b) {

        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }
}
package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class John_HatmanOtherMehtod {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws NumberFormatException, IOException {

        operations();

    }
    
    public static void operations() throws NumberFormatException, IOException {

        int num[] = { 1, 2, 9, 44, 265, 1854, 14833, 133496, 1334961, 14684570, 176214841 };
        int den[] = { 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600 };

        int t = Integer.parseInt(br.readLine());
        while (0 < t) {
            
            int n = Integer.parseInt(br.readLine());
            System.out.println(num[n-2] + "/" + den[n-2]);
        }
    }
}

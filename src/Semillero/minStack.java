package Estructuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class minStack {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String textos = br.readLine();
            String[] parts = textos.split(" ");
            String text = parts[0];

            if (text.charAt(1) == 'U') {
                int number = Integer.parseInt(parts[1]);
                stack.push(number);

            } else if (text.charAt(0) == 'M') { //MIN
                if (stack.empty()) {
                    System.out.println("EMPTY ");
                } else {
                    //System.out.println(stack); // falta mostrar el elemento mas pequeño del stack

                }
            } else if (text.charAt(2) == 'P') { //POP

                if (stack.empty()) {
                    System.out.println("EMPTY ");
                } else {
                    Integer objetoBorrado = null;
                    objetoBorrado = stack.pop();

                }
            }
        }
    }
}

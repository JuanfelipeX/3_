//package EstructuraDatos.EjericicosPilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

class Stack1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws NumberFormatException, IOException {

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> pila = new Stack<Integer>();

        boolean error = false;

        for (int i = 0; i < N; i++) {

            String textos = br.readLine();
            String[] parts = textos.split(" ");
            String signo = parts[0];

            if (signo.equals("-")) {
                Integer objetoBorrado = null;
                
                if (!pila.isEmpty()) {
                    
                    objetoBorrado = pila.pop();
                    System.out.println(objetoBorrado);

                } else {
                    System.out.println("empty");
                }
                
                
                
                error = true;
                
            } else {
                int x = Integer.parseInt(parts[1]);
                pila.push(x);
                
            }
            
        }

        while (!error) {
            System.out.println("empty");
        }
    }
}


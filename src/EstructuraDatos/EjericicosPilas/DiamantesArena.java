import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DiamantesArena {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    

    public static void main(String[] args) throws NumberFormatException, IOException {

        Stack<Integer> stack = new Stack<>();
        boolean error = false;
        

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            
            int cont = 0;

            String texto = br.readLine();

            for (int m = 0; m < texto.length(); m++) {

                if (texto.charAt(m) == '<') {
                    stack.push(m);
                }
                if (texto.charAt(m) == '>') {
                    if (!stack.isEmpty()) {
                        //System.out.println(stack.pop() + ", " + i);
                        stack.pop();
                        cont++;
                    } else {
                      //    System.out.println("falta abrir el parentesis que se cierra en " + m);
                        error = true;
                    }
                }
            }

            System.out.println(cont);
            cont = 0;
            stack.clear();      
        }

        while (!stack.isEmpty()) {
            stack.pop();
            error = true;
        }
    }
}

    

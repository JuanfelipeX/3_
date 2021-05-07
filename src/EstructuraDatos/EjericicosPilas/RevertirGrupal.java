import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RevertirGrupal {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        while (true) {
            String cadenaText = br.readLine();
            String[] parts = cadenaText.split(" ");
            int number = Integer.parseInt(parts[0]);
            String texto = parts[1];

            if (number == 0) {
                break;
            }

            proceso(number, texto);
        }
    }

    private static void proceso(int number, String texto) {

        int bloque = texto.length() / number;
        Stack<Character> stack = new Stack<>();
        StringBuilder strb = new StringBuilder();

        for (int i = 0; i < texto.length(); i += bloque) {
            // Creo el subgrupo a invertir de tamaño bloque 
            int left = i;
            int right = Math.min(i + bloque - 1, texto.length() - 1); // Caso en que texto.length % number != 0

            // Añado a la pila el subgrupo de bloque elementos
            while (left <= right) {
                stack.push(texto.charAt(left));
                left++;
            }
            // Desempilo y añado a strb
            while (!stack.empty()) {
                strb.append(stack.pop());
            }
        }
        System.out.println(strb);

        /*
        StringBuilder strb = new StringBuilder(texto);
        texto = strb.reverse().toString();
        System.out.println(texto);  Este metodo es facil para invertir una cadena facilmente
        */

    }
}



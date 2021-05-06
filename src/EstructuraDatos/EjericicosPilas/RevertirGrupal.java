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

        Stack<Character> stack = new Stack<>();
        StringBuilder strb = new StringBuilder();

        int subdivision = texto.length() / number;
        //int cont = 0;


        for (int i = texto.length() - 1; i >= 0; i-=number) {

            int auxcont = i;

            for (int j = auxcont-number+1; j <= auxcont; j++) {
                
                stack.push(texto.charAt(j));
                
            }
            
          //  cont++; //suma el contador despues de cada push

            
            /*
            
            if (subdivision == cont) {   
                strb.append(stack.pop());
                stack.clear();
            cont = 0;
            }    
              */

        }
        while (!stack.empty()) {

            strb.append(stack.pop());

        }

                
           

        System.out.println(strb); //aqui invierte toda la cadena, pero no lo hace por los grupos como mencione

        /*
        StringBuilder strb = new StringBuilder(texto);
        texto = strb.reverse().toString();
        System.out.println(texto);  Este metodo es facil para invertir una cadena facilmente
        */

    }
}



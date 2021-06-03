package Estructuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Josefo {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int tamanaio = Integer.parseInt(br.readLine());

        for (int i = 1; i <= tamanaio; i++) {

            String texto = br.readLine();
            String[] dato = texto.split(" ");
            int tamanio = Integer.parseInt(dato[0]);
            int posicion = Integer.parseInt(dato[1]);
            proceso(tamanio, posicion);
        }
    }

    private static void proceso(int tamanio, int posicion) {

        
    Deque<Integer> queue = new LinkedList<>();

    for (int i = 1; i <= tamanio; i++)
        queue.add(i);

    while (!queue.isEmpty()) {
        for (int i = 1; i <= posicion; i++) {
            int posEliminada = queue.remove();

            if (i != posicion)
                queue.add(posEliminada);
        }
        if (queue.size() == 1)
            System.out.println(queue.getFirst());
    }
}
}
        

      

package Estructuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class TirandoCartas {
    
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        boolean a= true;

        while (a) {

            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                a = false;
                break;
            }

            proceso(number);
        }
    }


    private static void proceso(int number) {

      Deque<Integer> queue = new LinkedList<>();
      Deque<Integer> queue2 = new LinkedList<>();


        for(int i=1; i<=number;i++){

          queue.add(i);
          
        }
            
        for (int i = 1; i < number; i++) {
            
            int lista = queue.getFirst();
            queue.remove();
            queue.add(queue.poll());
            queue2.add(lista);
            
        }
        
        System.out.print("Cartas Descartadas: ");
        while(!queue2.isEmpty()){
            
           if(queue2.size() == 1){
            System.out.print(queue2.remove() );
        } else {
               System.out.print(queue2.remove() + ", ");
           }
           
        }
        
        System.out.println();
        System.out.println("Carta Final: " + queue.getFirst());
    }
}
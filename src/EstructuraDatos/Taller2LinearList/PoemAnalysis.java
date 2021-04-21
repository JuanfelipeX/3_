package EstructuraDatos.Taller2LinearList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class PoemAnalysis {

    private ArrayLinearList poem = new ArrayLinearList();

    public void add(String word) {

    }

    public void loadFile(String filename) {

        try {

            BufferedReader bf = new BufferedReader(new FileReader("text.txt"));
            String line;

            while ((line = bf.readLine()) != null) {
                for (String c : line.split(" ")) {
                    poem.add(c);

                }
            }
            bf.close();
            System.out.println(poem);

        } catch (Exception e) {
            System.out.println("Error leyendo el archivo " + e.getMessage());
        }
    }

    public void Posiciones() { // La complejidad del algoritmo es O(size) y es lineal con respecto al número de palabras de un poema

        int pos = poem.indexOf("táctica");
        int pos2 = poem.indexOf("estrategia");

        System.out.println("Primera posicion de la palabra táctica " + pos);
        System.out.println("Primera posicion de la palabra estrategia " + pos2);

    }

    public int countTimes(String s) {
        int contador = 0;
        for (int i = 0; i < poem.size(); i++) {
            if (poem.get(i).equals(s)) {
                contador++;
            }
        }
        System.out.println("Número de veces que se repite la palabra táctica es: " + contador);
        return contador;
    }

    public void exchange(String o1, String o2) {
    
    
      int permiso[] = new int[poem.size + 1];
        for (int i = 0; i < poem.size; i++) {                       //O(size)
            if (poem.get(i).equals(o1) && permiso[i] == 0) {
                poem.remove(i);
                poem.add(i, o2);
                permiso[i] = 1;
            }
            if (poem.get(i).equals(o2) && permiso[i] == 0) {
                poem.remove(i);
                poem.add(i, o1);
                permiso[i] = 1;
            }
        }
    }
      public void SaveFile(String filename) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            String poema = "";
            for (int i = 0; i < poem.size; i++) {
                if (poem.get(i).toString().endsWith(".")) {
                    poema += (String) poem.get(i) + "\n";
                } else {
                    poema += (String) poem.get(i) + " ";
                }
            }
            bw.write(poema);
            bw.flush();
            bw.close();

            BufferedReader bf = new BufferedReader(new FileReader(filename));
            String line2;

            while ((line2 = bf.readLine()) != null) {
                System.out.println(line2);
            }
            bf.close();
        } catch (IOException ex) {
            System.out.println("Error leyendo el archivo " + ex.getMessage());
        }
}
}

     
        
  

 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class AnimalExtinto implements Comparable<AnimalExtinto>{  //se compara con si mismo osea los mismos datos, se podria comparar con otros objetos

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String name;
    public Integer age;

    public AnimalExtinto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "," + age;
    }

    public static void main(String[] args) throws IOException {

        ArrayList<AnimalExtinto> books = new ArrayList<>();
        
        int tamanio = Integer.parseInt(br.readLine());

        for (int i = 0; i < tamanio; i++) {

            String texto = br.readLine();
            String[] dato = texto.split("&");
            String name = dato[0];
            int age = Integer.parseInt(dato[1]);

            AnimalExtinto animalExtinto = new AnimalExtinto(name, age);
            books.add(animalExtinto);


        }
        
        Collections.sort(books); // aqui ordena la arrayList

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i)); // hago esto para no mostar con los []
        }



    }

    @Override
    public int compareTo(AnimalExtinto libritos) {   //aqui en este metodo esta la magia

        int res = this.age - libritos.age; //aqui compara con una resta cuales son menores a mayores si queremos de mayor a menor es  libritos.age - this.age 
        //example si this.age = libritos.age retorna 0,  si this.age > libritos.age es mayor y asi viceversa TA POTENTE

        // this.name.compareTo(libritos.name); // aqui ordena los nombres

        if (res == 0) { 
            return this.name.compareTo(libritos.name); //aqui ordena de menor a mayor y si hay dos edades iguales ordena por orden alfabetico
        }
        return res;
    }
}

package EstructuraDatos.RedFliz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RedFliz {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

        options();

    }

    private static void options() throws NumberFormatException, IOException {

        int opcion;

        do {
            System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n" + "1. Pelicula. " + "\n"
                    + "2. Serie. " + "\n" + "3. Salir");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
            
                case 1:
                OpcionesPelicula opcionesPelicula = new OpcionesPelicula();
                opcionesPelicula.MostrarOptions();
                break;
            
                case 2:
                OpcionesSerie opcionesSerie = new OpcionesSerie();
                opcionesSerie.MostrarOptions();
                break;

                case 3:
                System.exit(0);
                break;

                default:
                System.out.println("Opcion no seleccionada correctamente...");
                break;
            }
        } while (opcion != 3);
    }
}

   


abstract class Opciones {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    abstract public void MostrarOptions() throws NumberFormatException, IOException;
}

class OpcionesPelicula extends Opciones {

    @Override
    public void MostrarOptions() throws NumberFormatException, IOException {

        int opcion;
        Pelicula pelicula = new Pelicula();

        do {
            System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n" + "1. Agregar Pelicula. " + "\n"
                    + "2. Elimina Pelicula. " + "\n" + "3. Visualizar" + "\n" + "4. Salir.");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
            case 1:

                System.out.println("Agrege los datos separados por (' ')");
                String texto = br.readLine();
                String[] dato = texto.split(" ");
                String tituloPeli = dato[0];
                String resumenPeli = dato[1];
                int anio = Integer.parseInt(dato[2]);

                pelicula.setTitulo(tituloPeli);
                pelicula.setResumen(resumenPeli);
                pelicula.setAño(anio);

                pelicula.addpeli(pelicula);

                break;
            case 2:

            

                break;

            case 3:

                pelicula.visualizar();

                break;

            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no seleccionada correctamente...");
                break;
            }
        } while (opcion != 4);
        
    }

}

class OpcionesSerie extends Opciones {

    @Override
    public void MostrarOptions() throws NumberFormatException, IOException {

        int opcion;

        do {
            System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n" + "1. Agregar Serie. " + "\n"
                    + "2. Elimina Serie. " + "\n" + "3. Visualizar" + "\n" + "4. Salir.");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
            case 1:

                break;
            case 2:

                break;

            case 3:
                

                break;

            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no seleccionada correctamente...");
                break;
            }
        } while (opcion != 3);

    }
}
    



    


abstract class Catalogo {

    String titulo;

    abstract public void visualizar();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}



class Pelicula extends Catalogo {

    ArrayList<Catalogo> catalogoPelis = new ArrayList<>();

    String resumen;
    int año;

    public Pelicula() {
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void visualizar() {
        System.out.println(catalogoPelis);

    }

    public ArrayList<Catalogo> getCatalogoPelis() {
        return catalogoPelis;
    }


    public void addpeli(Catalogo peli) { 
        catalogoPelis.add(peli);
    }


    
}


class Serie extends Catalogo {
    
    int numerosTemporadas;
    int numeroEpisodios;

    public int getNumerosTemporadas() {
        return numerosTemporadas;
    }
    public void setNumerosTemporadas(int numerosTemporadas) {
        this.numerosTemporadas = numerosTemporadas;
    }
    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }


    @Override
    public void visualizar() {

    }
}
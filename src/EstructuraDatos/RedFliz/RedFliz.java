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
        Pelicula pelicula = new Pelicula();  //se instancia para meterse en los metodos

        do {
            System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n" + "1. Agregar Pelicula. " + "\n"
                    + "2. Elimina Pelicula. " + "\n" + "3. Visualizar" + "\n" + "4. Salir.");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                
            case 1:
                System.out.println("Agrege los datos separados por (' '), (Titulo de la pelicula, resumen de la pelicula, anio)");
                String texto = br.readLine();
                String[] dato = texto.split(" ");
                String tituloPeli = dato[0];
                String resumenPeli = dato[1];
                int anio = Integer.parseInt(dato[2]);

                Pelicula pelicula2 = new Pelicula(tituloPeli, resumenPeli, anio);  //se instancia otra porque este va añadiendo las peliculas

                pelicula.addpeli(pelicula2);
                break;

            case 2:

                System.out.println("Ingrese el nombre del titulo de la pelicula");
                String tituloPeliculaBorrar = br.readLine();
                pelicula.borrarPeli(tituloPeliculaBorrar);
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
        Serie serie = new Serie(); // se instancia para meterse en los metodos

        do {
            System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n" + "1. Agregar Serie. " + "\n"
                    + "2. Elimina Serie. " + "\n" + "3. Visualizar" + "\n" + "4. Salir.");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
            case 1:

                System.out.println("Agrege los datos separados por (' '), (Titulo, Numero de Temporadas, Numero de Episodios)");
                String texto = br.readLine();
                String[] dato = texto.split(" ");
                String tituloPeli = dato[0];
                int numerosTemporadas = Integer.parseInt(dato[1]);
                int numeroEpisodios = Integer.parseInt(dato[2]);

                Serie serie2 = new Serie(tituloPeli, numerosTemporadas, numeroEpisodios);  // se instancia otra porque
                                                                                          // este va añadiendo las
                                                                                          // series
                serie.addpeli(serie2);
                break;

            case 2:
                System.out.println("Ingrese el nombre del titulo de la pelicula");
                String tituloPeliculaBorrar = br.readLine();
                serie.borrarSerie(tituloPeliculaBorrar);
                break;

            case 3:
                serie.visualizar();
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
    int anio;

    
    public Pelicula(String titulo, String resumen, int anio) {
        super.titulo = titulo; //no olvidar el super
        this.resumen = resumen;
        this.anio = anio;
    }

    public Pelicula() {
    }


    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public ArrayList<Catalogo> getCatalogoPelis() {
        return catalogoPelis;
    }
    
    public void addpeli(Catalogo peli) { // se apoya del catalago porque tiene titulo y alli luego lo añade con resumen y anio
        catalogoPelis.add(peli);
    }
    
    public void borrarPeli(String tituloPeli) {          //borra la pelicula
        for (int i = 0; i < catalogoPelis.size(); i++) {
            if (catalogoPelis.get(i).getTitulo().equalsIgnoreCase(tituloPeli)) {   // obtiene el indice de cada uno y va mirando como el titulo hasta que coincida y lo borra
                catalogoPelis.remove(i);
                System.out.println("Pelicula borrada con exito");
            }
            System.out.println("No se pudo borrar la pelicula, Revisa por favor");
        }
    }

    @Override
    public void visualizar() { //imprime el toString
        System.out.println(catalogoPelis);
    }

    @Override
    public String toString() {
        return "Pelicula [Titulo= " + super.titulo + ", Resumen= " + resumen + ", Anio= " + anio + "]"; 
    }
}

class Serie extends Catalogo {

    ArrayList<Catalogo> catalogoSeries = new ArrayList<>();

    int numerosTemporadas;
    int numeroEpisodios;

    public Serie(String titulo, int numerosTemporadas, int numeroEpisodios) {
        super.titulo = titulo;
        this.numerosTemporadas = numerosTemporadas;
        this.numeroEpisodios = numeroEpisodios;
    }

    public Serie() {
    }

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

    public ArrayList<Catalogo> getCatalogoSeries() {
        return catalogoSeries;
    }

    public void setCatalogoSeries(ArrayList<Catalogo> catalogoSeries) {
        this.catalogoSeries = catalogoSeries;
    }

    public void addpeli(Catalogo serie) {
        catalogoSeries.add(serie);
    }

    public void borrarSerie(String tituloSerie) { 
        for (int i = 0; i < catalogoSeries.size(); i++) {
            if (catalogoSeries.get(i).getTitulo().equalsIgnoreCase(tituloSerie)) { 
                catalogoSeries.remove(i);
                System.out.println("Serie borrada con exito");
            }
            System.out.println("No se pudo borrar la serie, Revisa por favor");
        }
    }

    @Override
    public void visualizar() {
        System.out.println(catalogoSeries);
    }

    @Override
    public String toString() {
        return "Serie [Titulo Serie=" + super.titulo + ", numeroEpisodios=" + numeroEpisodios
                + ", numerosTemporadas=" + numerosTemporadas + "]";
    }
}   
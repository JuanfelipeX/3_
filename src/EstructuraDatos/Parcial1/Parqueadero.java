package EstructuraDatos.Parcial1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Parqueadero {   //aqui estan todas las clases No me alcanzo el tiempo para el 2 :c perdon por el codigo espaguetti

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

        options();
    }

    private static void options() throws NumberFormatException, IOException {

        int opcion;
        Automovil automovil = new Automovil();
        Motos motos = new Motos();
        Bicicletas bicicletas = new Bicicletas();
                


        do {
            System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n" + "1. Agregar. " + "\n"
                    + "2. Consultar. " + "\n" + "3. visualizar. " + "\n" + "4. Salir");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {

            case 1:
            
            System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n" + "1. Carro. " + "\n"
                    + "2. Moto. " + "\n" + "3. Bicicleta. ");
                    int opcion2 = Integer.parseInt(br.readLine()); 

                    if (opcion2 == 1) {

                        automovil.anadirVehiculo();

                    } else if (opcion2 == 2) {
                    
                    motos.anadirMoto();

                } else if (opcion2 == 3) {
                    
                    bicicletas.anadirBici();
                }
                break;

            case 2:

                break;

            case 3:     
                automovil.visualizar();
                motos.visualizar();
                bicicletas.visualizar();
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


abstract class Modelo {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String placa;

    String marca;
    int anioModelo;
    

    abstract public void visualizar();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}


class Automovil extends Modelo {
    
    ArrayList<Modelo> listaCarros = new ArrayList<>();

    int numeroDocumento;

    public Automovil(String placa, String marca,  int anioModelo, int numeroDocumento) {
        this.placa = placa;
        this.marca = marca;
        this.anioModelo = anioModelo;
        this.numeroDocumento = numeroDocumento;
    }

     public Automovil() {
    }

    @Override
    public void visualizar() {
        System.out.println(listaCarros);
    }

    public void anadirVehiculo() throws IOException {

        System.out.println("Agrege los datos separados por (' '), (Placas, Marca, anioModelo, numeroDocumento)");
        String texto = br.readLine();
        String[] dato = texto.split(" ");
        String placa = dato[0];
        String marca = dato[1];
        int anioModelo = Integer.parseInt(dato[2]);
        int numeroDocuemto = Integer.parseInt(dato[3]);

        Automovil automovil = new Automovil(placa, marca, anioModelo, numeroDocuemto);
        listaCarros.add(automovil);

    }

    @Override
    public String toString() {
        return "Automovil [placas= " + placa + ", Marca= " + marca + ", anioModelo" + anioModelo + ", numeroDocumento" + numeroDocumento + "]";
    }
    
    
}


class Motos extends Modelo {

    ArrayList<Modelo> listaMotos = new ArrayList<>();
    
    @Override
    public void visualizar() {
        System.out.println(listaMotos);
    }

    public Motos(String placa, String marca, int anioModelo) {
        this.placa = placa;
        this.marca = marca;
        this.anioModelo = anioModelo;
    }
    
    public Motos() {
        System.out.println(listaMotos);
    }

    public void anadirMoto() throws IOException {

        System.out.println("Agrege los datos separados por (' '), (Placas, Marca, anioModelo)");
        String texto = br.readLine();
        String[] dato = texto.split(" ");
        String placa = dato[0];
        String marca = dato[1];
        int anioModelo = Integer.parseInt(dato[2]);

        Motos Motos = new Motos(placa, marca, anioModelo);
        listaMotos.add(Motos);

    }

    @Override
    public String toString() {
        return "Moto [placas= " + placa + ", Marca= " + marca + ", anioModelo" + anioModelo  + "]";
    }

}


class Bicicletas extends Modelo{

    int numeroSerie;
    String color;

    ArrayList<Modelo> listaBicis = new ArrayList<>();

    public Bicicletas(int numeroSerie, String color, int anioModelo) {
        this.numeroSerie = numeroSerie;
        this.color = color;
        this.anioModelo = anioModelo;
    }

    public Bicicletas() {
        
    }

    public void anadirBici() throws IOException {

        System.out.println("Agrege los datos separados por (' '), (numeroSerie, Color, anioModelo)");
        String texto = br.readLine();
        String[] dato = texto.split(" ");
        int numeroSerie = Integer.parseInt(dato[0]);
        String color = dato[1];
        int anioModelo = Integer.parseInt(dato[2]);

        Bicicletas bicis = new Bicicletas(numeroSerie, color, anioModelo);
        listaBicis.add(bicis);

    }

    @Override
    public void visualizar() {
        System.out.println(listaBicis);
    }

    @Override
    public String toString() {
        return "Bicicletas [numeroSerie= " + numeroSerie + ", Color= " + color + ", anioModelo" + anioModelo + "]";
    }
    
}

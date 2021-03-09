package EstructuraDatos.BronsonAviones;

import java.util.ArrayList;

public class Bronson {

    public static void main(String[] args) {

        Inventario in = new Inventario();

        Pasajero av1 = new Pasajero();
        av1.setMatricula("HK345");
        av1.setVelocidad(300);
        av1.setNumeroPasajeros(299);

        Pasajero av2 = new Pasajero();
        av2.setMatricula("HK346");
        av2.setVelocidad(300);
        av2.setNumeroPasajeros(150);

        Carga c1 = new Carga();
        c1.setMatricula("GOD2412");
        c1.setVelocidad(1000);

        Paquete p = new Paquete();
        p.setNombre("Carta al niño Dios");
        p.setPeso(255000.0);
        c1.addPaquete(p); //check  
        
        Paquete p2 = new Paquete();
        p.setNombre("Regalos");
        p.setPeso(255000.2);
        c1.addPaquete(p2);
        
        Paquete p3 = new Paquete();
        p.setNombre("Mirra");
        p.setPeso(12000.0);
        c1.addPaquete(p3); 

        in.addAvion(av1);
        in.addAvion(av2);
        in.addAvion(c1);
        in.listaAviones();


    }

}

class Inventario {

    ArrayList<Avion> aviones = new ArrayList<>();

    public ArrayList<Avion> getAviones() {
        return aviones;
    }

    public void addAvion(Avion avion) { //falta aqui

    }   

    public void listaAviones() {  // falta

    }
}


abstract class Avion {

    int velocidad;
    String matricula;

    abstract public void visualizar();

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}




class Pasajero extends Avion {

    int numeroPasajeros;

    public void visualizar() {

    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

}



class Carga extends Avion {

    ArrayList<Paquete> paquetes = new ArrayList<>();
    double peso_Maximo;
    double pesoActual;

    public void visualizar() {

    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void addPaquete(Paquete paquete) { //aqui falta 

    }

}



class Paquete {
    
    String nombre;
    double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}


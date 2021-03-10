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
        p2.setNombre("Regalos");
        p2.setPeso(255000.2);
        c1.addPaquete(p2);

        Paquete p3 = new Paquete();
        p3.setNombre("Mirra");
        p3.setPeso(12000.0);
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

    public void addAvion(Avion avion) { 
        aviones.add(avion);
    }   

    public void listaAviones() {  
        for (int i = 0; i < aviones.size(); i++) {
            aviones.get(i).visualizar();
        }
        
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

    @Override
    public void visualizar() {
        System.out.println("Avión de pasajeros matrícula: " + getMatricula() + ", capacidad: " + getNumeroPasajeros()  
                + ", velocidad: " + getVelocidad() + " km/h");
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
    double peso_Maximo = 447700;
    double pesoActual=0;
    
    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void addPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    @Override
    public void visualizar() {   
        System.out.println(
                "Avión de carga matrícula: " + getMatricula() + ". velocidad:" + getVelocidad() + "km/h, contiene: ");
        for (int i = 0; i < paquetes.size(); i++) {

            pesoActual += paquetes.get(i).getPeso();
            if (pesoActual <= peso_Maximo) {
                System.out.println(
                        "Nombre:" + paquetes.get(i).getNombre() + ", peso: " + paquetes.get(i).getPeso() + " kg");
            } else {
                System.out.println("El paquete no puede ser entregado. Carga máxima superada");
            }

        }
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

package EstructuraDatos.ListasEnlazadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

    public static void main(String[] args) {

        Lista list = new Lista();

        try {
            list.opciones();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}




class Nodo {

    public int dato;
    public Nodo siguiente; // puntero

    public Nodo(int dato) { // constructor para insertar al final
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(int dato, Nodo siguiente) { // constructor para insertar el inicio
        this.dato = dato;
        this.siguiente = siguiente;
    }

}






class Lista {

    protected Nodo inicio, fin; // punteros para saber donde esta el incio y fin

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void opciones() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Lista lista = new Lista();
        int opcion;

       do {

            System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n"
                    + "1. Ingresar numeros al inicio. " + "\n"
                    + "2. Buscar si existe un elemento. " + "\n"
                    + "3. Ingresar un numero al final. " + "\n"
                    + "4. Borrar el inicio de la lista. " + "\n"
                    + "5. Borrar el final de la lista. " + "\n"
                    + "6. Borrar un nodo en especifico. " + "\n"
                    + "7. Salir");
            opcion = Integer.parseInt(br.readLine());
          
            switch (opcion) {
                case 1:
                    System.out.println("Cuantos numeros desea ingresar:");
                    int numbers = Integer.parseInt(br.readLine());
                    for (int i = 0; i < numbers; i++) {
                        System.out.println("\n" + "Ingrese un elemento");
                        int elemento1 = Integer.parseInt(br.readLine());
                        lista.agregarAlnicio(elemento1);
                        lista.mostrarLista();
                    }
                    break;

                case 2:
                if (lista.estaVacia()) {
                    System.out.println("No hay elementos");
                    opciones();
                } else {

                    System.out.println("Ingrese el numero a buscar");
                    int elemento2 = Integer.parseInt(br.readLine());
                    lista.buscarLista(elemento2);
                    if (lista.buscarLista(elemento2) == true) {
                        System.out.println("El elemento SI existe");
                    } else {

                        System.out.println("El elemento NO existe");
                    }
                }
                break;

                case 3:
                    System.out.println("Cuantos numeros desea ingresar:");
                    int numbers2 = Integer.parseInt(br.readLine());
                    for (int i = 0; i < numbers2; i++) {
                        System.out.println("\n" + "Ingrese un elemento");
                        int elemento1 = Integer.parseInt(br.readLine());
                        lista.agregarAlFinal(elemento1);
                        lista.mostrarLista();
                    }
                    break;
                case 4:
                if (lista.estaVacia()) {
                    System.out.println("No hay elementos");
                    opciones();

                } else {
                    System.out.println("Desea eliminar el primer elemento (Si O No)");
                    String sure = br.readLine();
                    if (sure.equalsIgnoreCase("SI")) {
                        lista.borrarInicio();
                        lista.mostrarLista();

                    } else {
                        opciones();
                    }
                }
                break;
                
                case 5:
                    if (lista.estaVacia()) {
                        System.out.println("No hay elementos");
                        opciones();

                    } else {
                        System.out.println("Desea eliminar el primer elemento (Si O No)");
                        String sure = br.readLine();
                        if (sure.equalsIgnoreCase("SI")) {
                            lista.borrarFinal();
                            lista.mostrarLista();
                            
                        } else {
                            opciones();
                        }
                    }
                    break;
                case 6:
                if (lista.estaVacia()) {
                    System.out.println("No hay elementos");
                    opciones();

                } else {
                    System.out.println("Que nodo desea borrar");
                    int opcionNodo = Integer.parseInt(br.readLine());
                    if (lista.buscarLista(opcionNodo)) {
                      System.out.println("Esta seguro de eliminarlo (Si O No)");
                    String sure = br.readLine();
                    if (sure.equalsIgnoreCase("SI")) {
                        lista.eliminarNodoEspecial(opcionNodo);
                        lista.mostrarLista();
                    } else {
                        opciones();
                    }  
                    } else {
                        System.out.println("Nodo no encontrado");
                    }
                }
                    break;

                case 7:
                System.exit(0);
                break;
                    
                default:
                    System.out.println("Opcion no seleccionada correctamente...");
                    break;
                    
            }
        } while (opcion != 7);

    }

    public void agregarAlnicio(int elemento) { //metodo para agregar al inicio de la lista 
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }
    
    public void mostrarLista() { //metodo para mostrar los datos
        Nodo recorrer = inicio;

        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]----> ");
            recorrer = recorrer.siguiente;

        }
    }

    public boolean buscarLista(int elemento) { //buscar un elemento

        Nodo temporal = inicio;
        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }

    public boolean estaVacia() { //metodo para saber si esta vacia

        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void agregarAlFinal(int elemento) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(elemento);
        }
    }

    public int borrarInicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            //inicio = null;
            //fin = null;
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return elemento;
    }

    public int borrarFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return elemento;
    }

    public void eliminarNodoEspecial(int elemento) {
        if (!estaVacia()) {
            if (inicio == fin && elemento==inicio.dato) {
                inicio = fin = null;
            } else if(elemento==inicio.dato){
                inicio = inicio.siguiente;
            } else {
                Nodo anterior = inicio;
                Nodo temporal = inicio.siguiente;
                while (temporal != null && temporal.dato != elemento) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }
}


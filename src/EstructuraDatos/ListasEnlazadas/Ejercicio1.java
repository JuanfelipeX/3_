package EstructuraDatos.ListasEnlazadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {     // http://aprenderestructuradedatos.blogspot.com/2015/11/ejercicio-3-listas-doblemente-enlazadas.html

    public static void main(String[] args) {

        Listas lista = new Listas();
        
        try {
            lista.opciones();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}

class Nodos {
    
        public Nodos siguiente; // puntero
        public String nombres;

        public Nodos(String nombres) { // constructor para insertar al final
            this.nombres = nombres;
            this.siguiente = null;
        }

        public Nodos(String nombres, Nodos siguiente) { // constructor para insertar el inicio
            this.nombres = nombres;
            this.siguiente = siguiente;
        }
        
    }
    

    class Listas {
        
        Nodos inicio;
		protected Nodos fin; // punteros para saber donde esta el incio y fin

        public Listas() {
            inicio = null;
            fin = null;
        }

        public void opciones() throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Listas lista = new Listas();
            int opcion;

            do {

                System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n" + "1. Ingresar un nombre. " + "\n"
                        + "2. Imprimir lista. " + "\n" + "3. Eliminar nombres que pasan de ciertos caracteres. " + "\n"
                        + "4. Salir. ");
                opcion = Integer.parseInt(br.readLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese un nombre a la lista");
                        String nombreIngresar = br.readLine();
                        lista.ingresarNombre(nombreIngresar);
                        break;

                    case 2:
                        System.out.println("La lista ingresada es:");
                        lista.mostrarLista();
                        break;

                    case 3:
                        System.out.println("Ingrese el valor del limite de caracteres ");
                        int valorLimite = Integer.parseInt(br.readLine());
                        lista.CantidadCaracteres(valorLimite);

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
        
        public void ingresarNombre(String nombres) {
            inicio = new Nodos(nombres, inicio);
            if (fin == null) {
                fin = inicio;
            }
        }
        
        public void mostrarLista() {
            Nodos recorrer = inicio;
            while (recorrer != null) {
                System.out.println("[" + recorrer.nombres + "]----> ");
                recorrer = recorrer.siguiente;
            }
        }

        
        
        public void CantidadCaracteres(int valorLimite) {

            ///*
           Nodos recorrer = inicio;
           while (recorrer != null) {
               if (recorrer.nombres.length() <= valorLimite) {
                   //recorrer = recorrer.siguiente;

               } else {
                   System.out.println("bad");
               }
           }
            //*/
        }
    }


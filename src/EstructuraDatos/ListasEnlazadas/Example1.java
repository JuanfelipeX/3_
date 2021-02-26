package EstructuraDatos.ListasEnlazadas;

public class Example1 {

    public static void main(String[] args) throws Exception {

        options primero = new options(1);
        options segundo = new options("Second");
        options tercero = new options(3.0);

        primero.EnlazarSiguiente(segundo);
        segundo.EnlazarSiguiente(tercero);
        
        System.out.println(primero.ObtenerValor().toString() +  "  " + segundo.ObtenerValor().toString() + "  " +  tercero.ObtenerValor().toString());


        //aqui pertecen opciones del metodo options 2
        options2 lista = new options2();
        
        System.out.println("\n" + "Esta vacia " + lista.EstaVacia());

        lista.anadirPrimero("Pipe");
        lista.anadirPrimero("Jim Carry");   
        lista.anadirPrimero("Tony Stark");
        lista.anadirPrimero("Jose Jose");
        lista.anadirPrimero("Carlos Vives");    

        //[0]Carlos Vives -> [1]Jose Jose -> [2] Tony Stark -> [3] Jim carry -> [4]Pipe
        
        lista.eliminarPrimerElemento();  //Ellimina a Carlos Vives     [0]Jose Jose -> [1] Tony Stark -> [2] Jim carry -> [3]Pipe
        
        lista.eliminarIndice(0); // elimina en este caso a Jose Jose   [0] Tony Stark -> [1] Jim carry -> [2]Pipe
        
        // lista.cortar(2);  //elimina todos las listas apartir donde se indica el indice   [0] Tony Stark -> [1] Jim carry

        System.out.println("Esta vacia: " + lista.EstaVacia());
        System.out.println("Primer Elemento: " + lista.obtenerPosicion(0)); 
        System.out.println("Ultimo Elemento: " + lista.obtenerPosicion(lista.size-1));
        System.out.println("Tamanio: " + lista.size);
        
        //end   

    }
}


class options {

    Object valor;
    options siguiente; 
    
    public options(Object valor) {  
        this.valor = valor;
        this.siguiente = null;
    }

    public void EnlazarSiguiente(options nodo){
        siguiente = nodo;
    }

    public options ObtenerSiguiente(){
        return siguiente;
    }

    public Object ObtenerValor(){
        return valor;
    }
}




    class options2 {

        options cabeza;
        int size;
    
       public options2() {
            cabeza = null;
            size = 0;
        }

        public Object obtenerPosicion(int index){
            int contador = 0;
            options temporal = cabeza;
            while (contador < index) {
                temporal = temporal.ObtenerSiguiente();
                contador++;
            }
            return temporal.ObtenerValor();
        }
    
        public void anadirPrimero(Object objecto){
            if (cabeza == null) {
                cabeza = new options(objecto);  // esto se hace cuando la lista esta vacia
            } else {
                options temporal = cabeza;  
                options nuevoNodo = new options(objecto);  //aqui esta aislado
                nuevoNodo.EnlazarSiguiente(temporal);
                cabeza = nuevoNodo;
            }
            size++;
        }

        public void eliminarPrimerElemento() {
            cabeza = cabeza.ObtenerSiguiente();
            size--;
        }

        public int size(){
            return size;
        }

        public void eliminarIndice(int index) {
            if (index == 0) {
                cabeza = cabeza.ObtenerSiguiente();
            } else {
                int contador = 0;
                options temporal = cabeza;
                while (contador < index-1) {
                temporal = temporal.ObtenerSiguiente();
                contador++; //se usa para salir de bucle
                }
            temporal.EnlazarSiguiente(temporal.ObtenerSiguiente().ObtenerSiguiente());
            }
        size--;
        }

        public void cortar(int index) {
            int contador = 0;
            options temporal = cabeza;
            while (contador < index-1) {
            temporal = temporal.ObtenerSiguiente();
            contador++;
            }
            temporal.EnlazarSiguiente(null);
            size = index;
        }
    
    
        public boolean EstaVacia(){
            return (cabeza == null)? true:false;
        }
    }





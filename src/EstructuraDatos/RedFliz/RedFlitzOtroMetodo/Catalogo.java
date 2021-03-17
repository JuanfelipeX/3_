package EstructuraDatos.RedFliz.RedFlitzOtroMetodo;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Contenido> contenidos = new ArrayList<>();

    public void addContenido(Contenido c) {
        contenidos.add(c);
    }

    public void eliminar(String nombre) {
        for (int i=0; i < contenidos.size(); i++) {
            if(contenidos.get(i).getTitulo().equalsIgnoreCase(nombre)){
                contenidos.remove(i);
            }
        }        
    }

    public void visualizar() {
        for (Contenido c : contenidos) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Catalogo c = new Catalogo();

        Pelicula peli = new Pelicula("Batman 2020", "Batman aparece de nuevo", "1996");
        Pelicula peli2 = new Pelicula("Inception", "Is about a dream inside a dream", "2010");
        Serie serie1 = new Serie("3", "186", "How I meet your mother");
        Pelicula peli3 = new Pelicula("Batman 2020", "Batman aparece de nuevo", "1996");
        
        c.addContenido(peli);
        c.addContenido(peli2);
        c.addContenido(serie1);
        c.addContenido(peli3);
        
        System.out.println("-----------");        
        c.visualizar();
        
        System.out.println("Eliminar a Batman");
        c.eliminar("Batman 2020");
        c.visualizar();
    }
}

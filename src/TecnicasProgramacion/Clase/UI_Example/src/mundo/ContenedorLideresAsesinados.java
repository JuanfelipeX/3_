/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author 10
 */
public class ContenedorLideresAsesinados {
    
    private ArrayList<LiderAsesinado> lideresAsesinados;
    
    private int indiceActual;
    
    public ContenedorLideresAsesinados() {
        crearLista();
        aleatorizarLista();       
    }

    private void crearLista() {
        lideresAsesinados = new ArrayList();
        agregarYadiraSucerquia();
        agregarVictorMorato();
        agregarLuzMontano();
        agregarJoseOlmedo();
        agregarEdenisBarrera();
        agregarAdrianPerez();
    }

    private void agregarYadiraSucerquia() {
        String nombre = "Yadira Sucerquia Macías";
        Calendar fechaDelAsesinato = new GregorianCalendar(2018, 4, 19);
        String rutaImagen = "./data/Yadira Sucerquia Macias.jpg";
        LiderAsesinado yadiraSucerquiaMacias = new LiderAsesinado(nombre, fechaDelAsesinato, rutaImagen);
        lideresAsesinados.add(yadiraSucerquiaMacias);        
    }

    private void agregarVictorMorato() {
        String nombre = "Victor Morato";
        Calendar fechaDelAsesinato = new GregorianCalendar(2018, 0, 18);
        String rutaImagen = "./data/VICTOR MANUEL MORATO.jpg";
        LiderAsesinado victorMorato = new LiderAsesinado(nombre, fechaDelAsesinato, rutaImagen);
        lideresAsesinados.add(victorMorato);
    }

    private void agregarLuzMontano() {
        String nombre = "Luz Jenny Montaño";
        Calendar fechaDelAsesinato = new GregorianCalendar(2017, 10, 17);
        String rutaImagen = "./data/Luz Jenny Montaño.jpg";
        LiderAsesinado luzJennyMontano = new LiderAsesinado(nombre, fechaDelAsesinato, rutaImagen);
        lideresAsesinados.add(luzJennyMontano);
    }

    private void agregarJoseOlmedo() {
        String nombre = "José Olmedo Obando";
        Calendar fechaDelAsesinato = new GregorianCalendar(2018, 0, 22);
        String rutaImagen = "./data/Jose Olmedo Obando.jpg";
        LiderAsesinado joseOlmedoObando = new LiderAsesinado(nombre, fechaDelAsesinato, rutaImagen);
        lideresAsesinados.add(joseOlmedoObando);
    }

    private void agregarEdenisBarrera() {
        String nombre = "Edenis Barrera Benavides";
        Calendar fechaDelAsesinato = new GregorianCalendar(2017, 2, 19);
        String rutaImagen = "./data/Edenis Barrera Benavides.jpg";
        LiderAsesinado edenisBarreraBenavides = new LiderAsesinado(nombre, fechaDelAsesinato, rutaImagen);
        lideresAsesinados.add(edenisBarreraBenavides);
    }

    private void agregarAdrianPerez() {
        String nombre = "Adrián Pérez";
        Calendar fechaDelAsesinato = new GregorianCalendar(2018, 5, 23);
        String rutaImagen = "./data/Adrian Perez.jpg";
        LiderAsesinado adrianPerez = new LiderAsesinado(nombre, fechaDelAsesinato, rutaImagen);
        lideresAsesinados.add(adrianPerez);
    }
    
    private void aleatorizarLista() {
        ArrayList<LiderAsesinado> listaAleatoria = new ArrayList();
                
        Random r = new Random();
        while (!lideresAsesinados.isEmpty()) {
            int index = r.nextInt(lideresAsesinados.size());
            LiderAsesinado liderAsesinado = lideresAsesinados.remove(index);
            listaAleatoria.add(liderAsesinado);            
        }
        
        lideresAsesinados = listaAleatoria;
    }

    public LiderAsesinado darPrimerLiderAsesinado() {
        indiceActual = 0;
        return lideresAsesinados.get(0);
    }
    
    public LiderAsesinado darSiguienteLiderAsesinado() {
        LiderAsesinado liderAsesinado = lideresAsesinados.get(indiceActual + 1);
        indiceActual++;
        return liderAsesinado;
    }
    
    public LiderAsesinado darAnteriorLiderAsesinado() {
        LiderAsesinado liderAsesinado = lideresAsesinados.get(indiceActual - 1);
        indiceActual--;
        return liderAsesinado;
    }
}
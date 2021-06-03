/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.Calendar;

/**
 *
 * @author 10
 */
public class LiderAsesinado {
    private final String nombre;
    private final Calendar fechaAsesinato;
    private final String rutaImagen;
    
    public LiderAsesinado(String nombre, Calendar fechaAsesinato, String rutaImagen) {
        this.nombre = nombre;
        this.fechaAsesinato = fechaAsesinato;
        this.rutaImagen = rutaImagen;
    }
    
    public String darNombre() {
        return nombre;
    }
    
    public Calendar darFechaAsesinato() {
        return fechaAsesinato;
    }
    
    public String darRutaImagen() {
        return rutaImagen;
    }
}

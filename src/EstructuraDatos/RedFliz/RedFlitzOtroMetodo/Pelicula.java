package EstructuraDatos.RedFliz.RedFlitzOtroMetodo;

public class Pelicula extends Contenido {
    protected String resumen;
    protected String anio;
    
    public Pelicula(String titulo, String resumen, String anio) {
        super(titulo);
        this.resumen = resumen;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Pelicula{" + super.getTitulo() + ", resumen=" + resumen + ", anio=" + anio + '}';
    }        
}

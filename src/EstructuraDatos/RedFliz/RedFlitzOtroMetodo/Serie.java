package EstructuraDatos.RedFliz.RedFlitzOtroMetodo;

public class Serie extends Contenido {
    private String temporadas;
    private String episodios;

    public Serie(String temporadas, String episodios, String titulo) {
        super(titulo);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Serie{" + super.getTitulo() + ", temporadas=" + temporadas + ", episodios=" + episodios + '}';
    }        
}

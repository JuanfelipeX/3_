package TecnicasProgramacion.Clase.TallerPolimorHeren;

public class Persona {

    private int id;
    private String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String DarNombre() {
        return nombre;

    }
    
    public int DarId() {
        return id;
        
    }
    
}

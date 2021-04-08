package TecnicasProgramacion.Clase.TallerPolimorHeren;

public class Menu {

    public static void main(String[] args) {
        
        try {

            Profesor profesor = new Profesor(0, null);
            Estudiante estudiante = new Estudiante(0, null);
        
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        
    
    
    }
    
}

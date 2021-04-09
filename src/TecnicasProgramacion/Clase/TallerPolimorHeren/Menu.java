package TecnicasProgramacion.Clase.TallerPolimorHeren;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        
        try {

            int idEstudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del Estudiante "));
            String nameEstudiante = (JOptionPane.showInputDialog("Ingrese el nombre del estudiante "));
            Estudiante estudiante = new Estudiante(idEstudiante, nameEstudiante);

            int idProfe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del Profesor "));
            String nameProfe = (JOptionPane.showInputDialog("Ingrese el nombre del Profesor "));
            Profesor profesor = new Profesor(idProfe, nameProfe);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        
    
    
    }
    
}

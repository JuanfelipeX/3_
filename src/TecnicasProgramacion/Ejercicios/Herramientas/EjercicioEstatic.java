package TecnicasProgramacion.Ejercicios.Herramientas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EjercicioEstatic {

    static ArrayList<String> listaNombres = new ArrayList<>();
    
    public static void main(String[] args) {

        try {
            
            mensaje();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }
    

    public static void mensaje() {

        int listaNames;

        listaNames = Integer.parseInt(JOptionPane.showInputDialog("Cuantos nombres va a ingresar"));

        for (int i = 0; i < listaNames; i++) {

            listaNombres.add(JOptionPane.showInputDialog("Ingrese los nombres que va a ingresar"));

        }

        JOptionPane.showMessageDialog(null, listaNombres);
        
    }
}


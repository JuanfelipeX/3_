package TecnicasProgramacion.Clase.Exepciones;

import javax.swing.JOptionPane;

public class Ejemplo1 {
    

    public static void main(String[] args) {

        String respuesta;
        
        String str1 = JOptionPane.showInputDialog("Ingrese numerador");
        String str2 = JOptionPane.showInputDialog("Ingrese denominador");
        int numerador, denominador, cociente;

        try {

            numerador = Integer.parseInt(str1);
            denominador = Integer.parseInt(str2);
            cociente = numerador/denominador;
            respuesta = String.valueOf(cociente);

        } catch (NumberFormatException e) {

            respuesta = "Caracter invalido";

        } catch (ArithmeticException e) {

            respuesta = "operacion invalida division entre 0";
        }

        JOptionPane.showMessageDialog(null, respuesta);
    }
}

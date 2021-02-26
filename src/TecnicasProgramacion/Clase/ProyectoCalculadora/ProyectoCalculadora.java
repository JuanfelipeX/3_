package TecnicasProgramacion.Clase.ProyectoCalculadora;

import javax.swing.JOptionPane;

public class ProyectoCalculadora {

    public static void main(String[] args) {

        try {
            Calculadora objetoCalculadora = new Calculadora();
            Calculadora objetoCalculadora2 = new Calculadora();
            objetoCalculadora.setNumero(1);
            objetoCalculadora2.setNumero(2);

            //  System.out.println(objetoCalculadora.suma(objetoCalculadora2.getNumero()));
            objetoCalculadora.setNumero(Float.parseFloat(JOptionPane.showInputDialog("Ingrese un dato ")));
            objetoCalculadora2.setNumero(Float.parseFloat(JOptionPane.showInputDialog("Ingrese un dato ")));
            
            JOptionPane.showMessageDialog(null,
                    "La suma es: " + objetoCalculadora.suma(objetoCalculadora2.getNumero()));
            JOptionPane.showMessageDialog(null,
                    "La resta es: " + objetoCalculadora.resta(objetoCalculadora2.getNumero()));
            JOptionPane.showMessageDialog(null,
                    "La divison es: " + objetoCalculadora.divison(objetoCalculadora2.getNumero()));
            JOptionPane.showMessageDialog(null,
                    "La multiplicacion es: " + objetoCalculadora.multiplicacion(objetoCalculadora2.getNumero()));
            JOptionPane.showMessageDialog(null,
                    "El modulo es: "
                                    + objetoCalculadora.modulo(objetoCalculadora2.getNumero()));
                    
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}




class Calculadora {

    private float numero;

    public Calculadora() {

    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public float suma(float suma) {
        return (this.numero + suma);
    }
    
    public float resta(float suma) {
        return (this.numero - suma);
    }
    public float divison(float suma) {
        return (this.numero / suma);
    }
    
    public float multiplicacion(float suma) {
        return (this.numero * suma);
    }

    public float modulo(float suma) {
        return (this.numero % suma);
    }
}

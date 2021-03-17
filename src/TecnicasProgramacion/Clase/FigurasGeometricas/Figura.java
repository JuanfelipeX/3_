package TecnicasProgramacion.Clase.FigurasGeometricas;

import javax.swing.JOptionPane;

public class Figura {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Cilindro cilindro = new Cilindro();

        circulo.setRadio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio: ")));
        cilindro.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio: ")));
        JOptionPane.showMessageDialog(null, "El volumen del cilindro es: " + cilindro.volumenCilindro());  //arereglar
    }
}



class Rectangulo extends Figura {

}



class Circulo extends Figura {

    protected float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }
}



class Cilindro extends Circulo {

    protected float altura;

    public Cilindro() {
     
    }

    public Cilindro(float radio, int altura) {
        super(radio);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float volumenCilindro() {
        return (float) ((calcularArea())*(getAltura()));
    }
}







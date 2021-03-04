package TecnicasProgramacion.Clase.Consecionario;

import javax.swing.JOptionPane;

public class ConsecionarioExercise {

    public static void main(String[] args) {

        try {

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del coche"));
            JOptionPane.showMessageDialog(null, "El precio del coche con descuento es: " + Coche.calcularPrecio(precio));

            String marca = (JOptionPane.showInputDialog("Ingrese la marca del coche: "));
            JOptionPane.showMessageDialog(null, "La marca del coches es: " + Coche.marcaVehiculo(marca));

            String color = (JOptionPane.showInputDialog("Ingrese el color del coche: "));
            JOptionPane.showMessageDialog(null, "El color del coches es: " + Coche.colorVehiculo(color));

            String matricula = (JOptionPane.showInputDialog("Ingrese la matricula del coche: "));
            JOptionPane.showMessageDialog(null, "La matricula del coches es: " + Coche.matriculaVehiculo(matricula));

            JOptionPane.showMessageDialog(null, "El descuento del coche es: " + Coche.getDescuento());


        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        
    }
    
}





class Coche{

    private String marca,color,matricula;
    private  double precio;
    private static double descuento = 2000000;

    public Coche() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        Coche.descuento = descuento;
    }

    public static double calcularPrecio(double precio) {
        precio = precio - descuento;
        return precio;
    }
    
    public static String marcaVehiculo(String marca) {
        return marca;
    }

    public static String colorVehiculo(String color) {
        return color;
    }

    public static String matriculaVehiculo(String matricula) {
        return matricula;
    }

}

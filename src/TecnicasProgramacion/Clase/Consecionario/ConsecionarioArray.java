package TecnicasProgramacion.Clase.Consecionario;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ConsecionarioArray {
    
    static ArrayList<CocheArray> listaConsencionario = new ArrayList<>();

    public static void main(String[] args) {

        try {
           
           ingresarCoches();

           dineroCalculado();
        
       } catch (Exception e) {

           System.out.println("Error " + e);
       }
    }
    
    public static void ingresarCoches() {

        int listaCoches = Integer.parseInt(JOptionPane.showInputDialog("Cuantos coches va a ingresar"));

        for (int i = 0; i < listaCoches; i++) {

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del coche " + (i + 1)));

            String marca = (JOptionPane.showInputDialog("Ingrese la marca del coche: " + (i + 1)));

            String color = (JOptionPane.showInputDialog("Ingrese el color del coche: " + (i + 1)));

            String matricula = (JOptionPane.showInputDialog("Ingrese la matricula del coche: " + (i + 1)));

            CocheArray cocheArray = new CocheArray(marca, color, matricula, precio);

            listaConsencionario.add(cocheArray);

            JOptionPane.showMessageDialog(null, listaConsencionario);

        }

    }
    
    public static void dineroCalculado() {

        double acumulador = 0;

        for (int i = 0; i < listaConsencionario.size(); i++) {

            acumulador = acumulador + listaConsencionario.get(i).getPrecio();
        }

        JOptionPane.showMessageDialog(null, "Total de dinero de los coches SIN descuento: " + acumulador);

        JOptionPane.showMessageDialog(null, "Total de dinero de los coches CON descuento: " + (acumulador-CocheArray.getDescuentos()));
    }
    
}





class CocheArray {


    private String marca, color, matricula;
    private double precio;
    private static double descuentos = 2000000;

    public CocheArray(String marca, String color, String matricula, double precio) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.precio = precio;
    }
    
    public CocheArray() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static double getDescuentos() {
        return descuentos;
    }

    public static void setDescuentos(double descuentos) {
        CocheArray.descuentos = descuentos;
    }

    @Override
    public String toString() {
        return "Coche [color= " + color + ", marca= " + marca + ", matricula= " + matricula + ", precio= " + precio + " ]";
    }

    

    
    
    

    
    

    




    


    

    
    


}

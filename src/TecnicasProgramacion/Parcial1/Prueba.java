package TecnicasProgramacion.Parcial1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {


        Empleados empleados = new Empleados();

        int n = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: ")));


        empleados.setSalarioNeto(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario el neto: ")));

        empleados.calculaSalud(empleados.getSalarioNeto());
        empleados.calculaPension(empleados.getSalarioNeto());

        int peopleSalarioSolidario = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que ganan mas de 4 salarios minios ")));

        if (peopleSalarioSolidario >= 4) {
            
            empleados.calcularSolidario(empleados.getSalarioNeto());
             
            JOptionPane.showMessageDialog(null,
                    "El dinero neto descontado de salud, pension y solidaridad es: " + empleados.getSalarioNeto());

            int peopleDiscapasitada = (Integer
                    .parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas discapacitadas ")));

            if (peopleDiscapasitada > 10) {

                JOptionPane.showMessageDialog(null,
                        " el gobierno le hará un descuento en impuesto ");
                        
            } else {

                JOptionPane.showMessageDialog(null, " el gobierno No le hará un descuento en impuesto ");
            }
                    
        } else {

            JOptionPane.showMessageDialog(null,
                    "El dinero neto descontado de salud, pension es: " + empleados.getSalarioNeto());

                    int peopleDiscapasitada = (Integer
                            .parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas discapacitadas ")));

            if (peopleDiscapasitada > 10) {

                JOptionPane.showMessageDialog(null, " el gobierno le hará un descuento en impuesto ");

            } else {

                JOptionPane.showMessageDialog(null, " el gobierno No le hará un descuento en impuesto ");
            }
        }
    }

}

class Empleados {
    
    private static double salud = 0.05;
    private static double pension = 0.02;
    private double salarioNeto;
    private static double fondoSolidaridad = 0.01;
    private int cantidadEmpleadosDiscapastiados;

    
    public Empleados() {
    }

    public static double getSalud() {
        return salud;
    }

    public static void setSalud(double salud) {
        Empleados.salud = salud;
    }

    public static double getPension() {
        return pension;
    }

    public static void setPension(double pension) {
        Empleados.pension = pension;
    }

    public static double getFondoSolidaridad() {
        return fondoSolidaridad;
    }

    public static void setFondoSolidaridad(double fondoSolidaridad) {
        Empleados.fondoSolidaridad = fondoSolidaridad;
    }

    public int getCantidadEmpleadosDiscapastiados() {
        return cantidadEmpleadosDiscapastiados;
    }

    public void setCantidadEmpleadosDiscapastiados(int cantidadEmpleadosDiscapastiados) {
        this.cantidadEmpleadosDiscapastiados = cantidadEmpleadosDiscapastiados;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public void calculaSalud(double salarioNeto) {

        double salud = (getSalarioNeto()) * (getSalud());
        double salarioNow = (getSalarioNeto()) - (salud);
        setSalarioNeto(salarioNow);
    }
    
    public void calculaPension(double salarioNeto) {

        double pension = (getSalarioNeto()) * (getPension());
        double salarioNow = (getSalarioNeto()) - (pension);
        setSalarioNeto(salarioNow);

    }

    public void calcularSolidario(double salarioNeto) {

        double fondoSolidaridad = (getSalarioNeto()) * (getFondoSolidaridad());
        double salarioNow = (getSalarioNeto()) - (fondoSolidaridad);
        setSalarioNeto(salarioNow);
    }

    
}



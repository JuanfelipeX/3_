package TecnicasProgramacion.Parcial1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ClinicaEmpresa {

    public static void main(String[] args) {
        Descuentos descuentos = new Descuentos();

        descuentos.anadirEmpleado();
        descuentos.descuentosPensionSalud();
        descuentos.descuentoSolidaridad();
        descuentos.solidaridadTotal();

        descuentos.salarioNeto();
        descuentos.imprimirDatos();
        
    }
}



class Empleado {

    protected ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    protected String nombre;
    protected double salario;
    protected int estrato;
    protected double salarioNeto;
    protected double salarioDescuentos;
    protected double salarioDescuentosSolidaridad=0;


    public Empleado(String nombre, double salario, int estrato, double salarioDescuentos, double salarioDescuentosSolidaridad) {
        this.nombre = nombre;
        this.salario = salario;
        this.estrato = estrato;
        this.salarioDescuentos = salarioDescuentos;
        this.salarioDescuentosSolidaridad = salarioDescuentosSolidaridad;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public double getSalarioDescuentos() {
        return salarioDescuentos;
    }

    public void setSalarioDescuentos(double salarioDescuentos) {
        this.salarioDescuentos = salarioDescuentos;
    }

    public double getSalarioDescuentosSolidaridad() {
        return salarioDescuentosSolidaridad;
    }

    public void setSalarioDescuentosSolidaridad(double salarioDescuentosSolidaridad) {
        this.salarioDescuentosSolidaridad = salarioDescuentosSolidaridad;
    }

    public void anadirEmpleado() {

        int n = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: ")));

        for (int i = 0; i < n; i++) {

            setNombre(JOptionPane.showInputDialog("Ingrese el nombre "));
            setSalario(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario ")));
            setEstrato(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato ")));

            setSalarioDescuentos(getSalario());
            
            Descuentos empleado = new Descuentos(getNombre(), getSalario(), getEstrato(), getSalarioDescuentos(), getSalarioDescuentosSolidaridad()); //aqui hago el constructor para anadir en la arrayList
            listaEmpleados.add(empleado);
        }
    }

    public void salarioNeto() {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            salarioNeto += listaEmpleados.get(i).getSalarioDescuentos();
        }
    }

    

    
}

class Descuentos extends Empleado {
    
    protected double salud = 0.03;
    protected double pension = 0.04;
    protected double FondoSolidario = 0.02;
    protected double fondoSolidaridadTotal;

    
    public Descuentos(String nombre, double salario, int estrato, double salarioDescuentos, double salarioDescuentosSolidaridad) {
        super(nombre, salario, estrato, salarioDescuentos, salarioDescuentosSolidaridad);
    }

    public Descuentos(double salud, double pension) {
        this.salud = salud;
        this.pension = pension;
    }

    public Descuentos() {
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public double getFondoSolidario() {
        return FondoSolidario;
    }

    public void setFondoSolidario(double fondoSolidario) {
        FondoSolidario = fondoSolidario;
    }

    public double getFondoSolidaridadTotal() {
        return fondoSolidaridadTotal;
    }

    public void setFondoSolidaridadTotal(double fondoSolidaridadTotal) {
        this.fondoSolidaridadTotal = fondoSolidaridadTotal;
    }

    public void descuentosPensionSalud() {

        for (int i = 0; i < listaEmpleados.size(); i++) {

            double descuentoSalud = listaEmpleados.get(i).getSalario() * getSalud(); //multiplica salario por salud 0.03 y luego ese resultado lo suma con pensio y resta la el salario origina y lo setea
            double descuentoPension = listaEmpleados.get(i).getSalario() * getPension();

            double descuentoTotal = descuentoSalud + descuentoPension;

            descuentoTotal = listaEmpleados.get(i).getSalario() - descuentoTotal;

            listaEmpleados.get(i).setSalarioDescuentos(descuentoTotal);

        }
    }
    
    public void descuentoSolidaridad() {

        for (int i = 0; i < listaEmpleados.size(); i++) {

            if (listaEmpleados.get(i).getSalario() >= 3634104) {

                double descuentoSolidaridad = listaEmpleados.get(i).getSalario() * getFondoSolidario();   ////multiplica salario por fondoSolidario 0.02 y luego ese resultado lo resta con SalarioDescuentos y lo setea
                descuentoSolidaridad = listaEmpleados.get(i).getSalarioDescuentos() - descuentoSolidaridad;

                listaEmpleados.get(i).setSalarioDescuentos(descuentoSolidaridad);

                double descuentoSolidaridad2 = listaEmpleados.get(i).getSalario() * getFondoSolidario();  
                listaEmpleados.get(i).setSalarioDescuentosSolidaridad(descuentoSolidaridad2);   //aqui setea setSalarioDescuentosSolidaridad usando descuentoSolidaridad2
            }
        }
    }

    public void solidaridadTotal() {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            fondoSolidaridadTotal += listaEmpleados.get(i).getSalarioDescuentosSolidaridad();   //suma cada SalarioDescuentosSolidaridad y lo guarda en fondoSolidaridadTotal
        }
    }
    
    public void imprimirDatos() {
        JOptionPane.showMessageDialog(null, listaEmpleados.toString());
        JOptionPane.showMessageDialog(null, "Salario Neto " + getSalarioNeto());

        JOptionPane.showMessageDialog(null, "Dinero total de fondo de solidaridad " + fondoSolidaridadTotal);

        if (fondoSolidaridadTotal > 4542630) {
            JOptionPane.showMessageDialog(null, "el gobierno le hará un descuento en impuestos del 2% :D");
        } else {
            JOptionPane.showMessageDialog(null, "el gobierno NO le hará un descuento en impuestos del 2% :c");
        }
    }

    @Override
    public String toString() {
        return "Empleado [Nombre=" + nombre + ", Estrato=" + estrato + ", salario=" + salario
                + ", salario descontando de pension, salud y fondo de solidaridad SI cumple con el requsito ="
                + salarioDescuentos + "\n" + "]";
    }

    

    
    

    

    

}

package TecnicasProgramacion.Parcial1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ClinicaEmpresa {

    public static void main(String[] args) { 

        AmorAmistad amorAmistad = new AmorAmistad();

        amorAmistad.anadirEmpleado();
        amorAmistad.descuentosPensionSalud();
        amorAmistad.descuentoSolidaridad();
        amorAmistad.solidaridadTotal();

        amorAmistad.bonoPersonasEstratoDos();
        amorAmistad.bonoPersonasEstratoUno();
        amorAmistad.bonoAnioBisiesto();

        amorAmistad.salarioNeto();
        amorAmistad.imprimirDatos();

    }
}














class Empleado {

    protected ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    protected String nombre;
    protected double salario;
    protected int estrato;
    protected int cedula;
    protected String hijos;
    protected String anioBisiesto;

    protected double salarioNeto;
    protected double salarioDescuentos;
    protected double salarioDescuentosSolidaridad = 0;
    protected double bonoDeCincuenta = 50000;
    protected double bonoCien = 100000;
    protected double bonoBisiesto = 200000;

    public Empleado(String nombre, double salario, int estrato, int cedula, String hijos, String anioBisiesto,
            double salarioDescuentos, double salarioDescuentosSolidaridad ) {
        this.nombre = nombre;
        this.salario = salario;
        this.estrato = estrato;
        this.cedula = cedula;
        this.hijos = hijos;
        this.anioBisiesto = anioBisiesto;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getHijos() {
        return hijos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public String getAnioBisiesto() {
        return anioBisiesto;
    }

    public void setAnioBisiesto(String anioBisiesto) {
        this.anioBisiesto = anioBisiesto;
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
    
    
    
    
    public double getBonoDeCincuenta() {
        return bonoDeCincuenta;
    }

    public void setBonoDeCincuenta(double bonoDeCincuenta) {
        this.bonoDeCincuenta = bonoDeCincuenta;
    }

    public double getBonoCien() {
        return bonoCien;
    }


    public void setBonoCien(double bonoCien) {
        this.bonoCien = bonoCien;
    }

    public double getBonoBisiesto() {
        return bonoBisiesto;
    }

    public void setBonoBisiesto(double bonoBisiesto) {
        this.bonoBisiesto = bonoBisiesto;
    }



    public void anadirEmpleado() {

        int n = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: ")));

        for (int i = 0; i < n; i++) {

            setNombre(JOptionPane.showInputDialog("Ingrese el nombre "));
            setSalario(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario ")));
            setEstrato(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato ")));
            setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula ")));
            setHijos((JOptionPane.showInputDialog("¿Tiene Hijos? (Si o No) ")));
            setAnioBisiesto(JOptionPane.showInputDialog("Nacio en anio bisiesto (Si o No)"));
            

            setSalarioDescuentos(getSalario()); //salarioDescuento es igual a salario

            AmorAmistad empleado = new AmorAmistad(getNombre(), getSalario(), getEstrato(), getCedula(), getHijos(),
                    getAnioBisiesto(), getSalarioDescuentos(), getSalarioDescuentosSolidaridad()); //aqui hago el constructor para anadir en la arrayList

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

    public Descuentos(String nombre, double salario, int estrato, int cedula, String hijos, String anioBisiesto,
            double salarioDescuentos, double salarioDescuentosSolidaridad) {
        super(nombre, salario, estrato, cedula, hijos, anioBisiesto, salarioDescuentos, salarioDescuentosSolidaridad );
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

                double descuentoSolidaridad = listaEmpleados.get(i).getSalario() * getFondoSolidario(); ////multiplica salario por fondoSolidario 0.02 y luego ese resultado lo resta con SalarioDescuentos y lo setea
                descuentoSolidaridad = listaEmpleados.get(i).getSalarioDescuentos() - descuentoSolidaridad;

                listaEmpleados.get(i).setSalarioDescuentos(descuentoSolidaridad);

                double descuentoSolidaridad2 = listaEmpleados.get(i).getSalario() * getFondoSolidario();
                listaEmpleados.get(i).setSalarioDescuentosSolidaridad(descuentoSolidaridad2); //aqui setea setSalarioDescuentosSolidaridad usando descuentoSolidaridad2
            }
        }
    }

    public void solidaridadTotal() {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            fondoSolidaridadTotal += listaEmpleados.get(i).getSalarioDescuentosSolidaridad(); //suma cada SalarioDescuentosSolidaridad y lo guarda en fondoSolidaridadTotal
        }
    }

    
}











class AmorAmistad extends Descuentos {


    protected double dineroInvetidoBonosDecincuenta;
    protected double dineroInvetidoBonosDecien;
    protected double dineroInvetidoBonosAnioBisiesto;

    

    public AmorAmistad(String nombre, double salario, int estrato, int cedula, String hijos, String anioBisiesto,
            double salarioDescuentos, double salarioDescuentosSolidaridad) {
        super(nombre, salario, estrato, cedula, hijos, anioBisiesto, salarioDescuentos, salarioDescuentosSolidaridad);
    }

    
    public AmorAmistad(double salud, double pension, double dineroInvetidoBonosDecincuenta) {
        super(salud, pension);
        this.dineroInvetidoBonosDecincuenta = dineroInvetidoBonosDecincuenta;
    }

    public AmorAmistad() {
    }
    

    public void bonoPersonasEstratoDos() {

        for (int i = 0; i < listaEmpleados.size(); i++) {

            if (listaEmpleados.get(i).getEstrato() == 2) {
                if (listaEmpleados.get(i).getCedula() == 2 || listaEmpleados.get(i).getCedula() == 4
                        || listaEmpleados.get(i).getCedula() == 7) {

                    dineroInvetidoBonosDecincuenta += listaEmpleados.get(i).getBonoDeCincuenta();   //busca lista empleados con getBonoDeCincuenta y va sumando dineroInvetidoBonosDecincuenta y asi con cada una
                }
            }
        }

    }
    
    public void bonoPersonasEstratoUno() {

        for (int i = 0; i < listaEmpleados.size(); i++) {

            if (listaEmpleados.get(i).getEstrato() == 1) {
                if (listaEmpleados.get(i).getHijos().equalsIgnoreCase("Si")) {
                    dineroInvetidoBonosDecien += listaEmpleados.get(i).getBonoCien();
                }
            }
        }
    }

    public void bonoAnioBisiesto() {

        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getAnioBisiesto().equalsIgnoreCase("Si")) {
                dineroInvetidoBonosAnioBisiesto += listaEmpleados.get(i).getBonoBisiesto();  
            }
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

        JOptionPane.showMessageDialog(null,
                "Dinero invertido en bonos de 50.000 es de: " + dineroInvetidoBonosDecincuenta);
        JOptionPane.showMessageDialog(null,
                "Dinero invertido en bonos de 100.000 es de: " + dineroInvetidoBonosDecien);

        JOptionPane.showMessageDialog(null,
                "Dinero invertido en bonos de 200.000 es de: " + dineroInvetidoBonosAnioBisiesto);

        double bonosTotales = (dineroInvetidoBonosDecincuenta + dineroInvetidoBonosDecien
                + dineroInvetidoBonosAnioBisiesto);
                
        JOptionPane.showMessageDialog(null,
                "Dinero invertido en bonos totales es de: " + bonosTotales);
    }

    @Override
    public String toString() {
        return "Empleado [Nombre=" + nombre + ", cedula=" + cedula + ", nacion en anio bisiesto=" + anioBisiesto + ", Estrato="
                + estrato + ", hijos=" + hijos + ", salario=" + salario
                + ", salario descontando de pension, salud y fondo de solidaridad SI cumple con el requsito ="
                + salarioDescuentos + "\n" + "]";

    }

}





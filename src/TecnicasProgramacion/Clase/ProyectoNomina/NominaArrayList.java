package TecnicasProgramacion.Clase.ProyectoNomina;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NominaArrayList {

    public static void main(String[] args) {

        ArrayList<EmpleadoList> listaEmpleados = new ArrayList<>();

        try {

            int op, cont = 0;
            long hours;

            do {

                op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese alguna de las siguientes opciones " + "\n"
                        + "\n1. Insertar datos empleado " + "\n" + "\n2. Calcular nomina del empleado" + "\n"
                        + "\n3. Calculador nomina total " + "\n" + "\n4. Salir"));

                switch (op) {

                    case 1:

                        hours = Integer.parseInt(
                                JOptionPane.showInputDialog("Ingrese la cantidad de horas del empleado " + (cont + 1)));

                        EmpleadoList empleadoList = new EmpleadoList(hours);
                        listaEmpleados.add(empleadoList);
                        cont++;
                        break;

                    case 2:

                        JOptionPane.showMessageDialog(null, "Empleados con " + listaEmpleados);
                        break;

                    case 3:

                        long acumulador = 0;
                        for (int i = 0; i < listaEmpleados.size(); i++) {

                            acumulador = acumulador + listaEmpleados.get(i).calculandoNomina(5000);
                        }

                        JOptionPane.showMessageDialog(null, "Nomina total:" + acumulador);
                    
                        break;

                    case 4:
                        System.exit(0);

                        break;

                    default:
                        break;
                }

            } while (op != 4);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}


class EmpleadoList {

    EmpresaList empresaList = new EmpresaList();

    private long cantidadHorasTrabajadas;

    public EmpleadoList(long cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    public long getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }

    public void setCantidadHorasTrabajadas(long cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    public long calculandoNomina(long valorHora) {
        return (this.cantidadHorasTrabajadas * valorHora);
    }

    @Override
    public String toString() {

        return "Nomina " +  calculandoNomina(empresaList.getValorHora());
        
    }

}







class EmpresaList {

    private static long valorHora = 5000;

    public EmpresaList() {
    }

    public static long getValorHora() {
        return valorHora;
    }

    public static void setValorHora(long valorHora) {
        EmpresaList.valorHora = valorHora;
    }

}
    

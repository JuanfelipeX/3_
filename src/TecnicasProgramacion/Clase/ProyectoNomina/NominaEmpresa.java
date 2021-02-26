package TecnicasProgramacion.Clase.ProyectoNomina;

import javax.swing.JOptionPane;

public class NominaEmpresa {
    
    public static void main(String[] args) {
        try {
            Empresa empresa = new Empresa();
            Empleado empleado = new Empleado();
            int op, cont=0;
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese alguna de las siguientes opciones " + "\n" +
                "\n1. Insertar datos empleado " + "\n" +
                "\n2. Calcular nomina del empleado" + "\n" +
                "\n3. Calculador nomina total " + "\n" + 
                "\n4. Salir"));

                switch (op) {
                    case 1:
                    empleado.setCantidadHoraTrabajada(Integer
                            .parseInt(JOptionPane.showInputDialog(
                                    "Ingrese la cantidad de horas trabajadas empleado " + (cont + 1))));

                    empresa.setListaEmpleado(empleado, cont);
                    cont++;
                    break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "nomina por empleado: " + empresa.nomina(cont));
                          
                        break;

                    case 3:

                        break;

                    case 4:
                        System.exit(0);
                        
                        break;
                
                    default:
                        break;
                }
                
            } while (op!=4);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}



class Empleado {

    private long cantidadHoraTrabajada;

    public Empleado() {

    }

    public long getCantidadHoraTrabajada() {
        return cantidadHoraTrabajada;
    }

    public void setCantidadHoraTrabajada(long cantidadHoraTrabajada) {
        this.cantidadHoraTrabajada = cantidadHoraTrabajada;
    }

    public long calcularNomina(int valorHora) {
        return (this.cantidadHoraTrabajada * valorHora);
    }
}



class Empresa {
    
    private static int cantidadEmpleado = 3;
    private static int horasTrabajadas = 50000;

    Empleado [] listaEmpleado = new Empleado [cantidadEmpleado]; 

    public Empresa() {
    }

    public static int getCantidadEmpleado() {
        return cantidadEmpleado;
    }

    public static void setCantidadEmpleado(int cantidadEmpleado) {
        Empresa.cantidadEmpleado = cantidadEmpleado;
    }

    public Empleado[] getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(Empleado empleado, int posicion) {
        this.listaEmpleado[posicion] = empleado;
    }

    public static int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public static void setHorasTrabajadas(int horasTrabajadas) {
        Empresa.horasTrabajadas = horasTrabajadas;
    }

    

    public long nomina(int cantidad) {
        long acumulador = 0;

        for (int i = 0; i < cantidad; i++) {
            acumulador = acumulador + this.listaEmpleado[i].calcularNomina(cantidad);
        }
        return acumulador;
    }

    public String calcularEmpleado(int cantidad) {
        String cadena = "";
        for (int i = 0; i < cantidad; i++) {
            cadena += "Nomina empleado numero" + (i + 1) + ": $" + listaEmpleado[i].calcularNomina(cantidad);
        }
        return cadena;
    }

    
}

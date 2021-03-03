package TecnicasProgramacion.Ejercicios.Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOperaciones {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        try {
            operaciones.opciones();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}


class Operaciones {

    public void opciones() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        do {
            System.out.println("\n" + "Seleccione alguna de las opciones:" + "\n" + "1. Suma. " + "\n"
                    + "2. Resta. " + "\n" + "3. Multiplicacion. " + "\n"
                    + "4. Division. "  + "\n" + "5. Modulo" + "\n" + "6. Salir");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese dos numeros separados por (&)");
                    String texto = br.readLine();
                    String[] part = texto.split("&");
                    int number = Integer.parseInt(part[0]); 
                    int numbers = Integer.parseInt(part[1]);
                    System.out.println("La suma es:" + (number+numbers));
                    break;
                case 2:
                    System.out.println("Ingrese dos numeros separados por (&)");
                    String textos = br.readLine();
                    String[] parts = textos.split("&");
                    int number1 = Integer.parseInt(parts[0]);
                    int number2 = Integer.parseInt(parts[1]);
                    System.out.println("La resta es:" + (number1 - number2));
                break;
                case 3:
                    System.out.println("Ingrese dos numeros separados por (&)");
                    String textos1 = br.readLine();
                    String[] parts1 = textos1.split("&");
                    int number3 = Integer.parseInt(parts1[0]);
                    int number4 = Integer.parseInt(parts1[1]);
                    System.out.println("La multiplicacion es:" + (number3 * number4));
                    break;
                case 4:
                    System.out.println("Ingrese dos numeros separados por (&)");
                    String textos2 = br.readLine();
                    String[] parts2 = textos2.split("&");
                    double number5 = Integer.parseInt(parts2[0]);
                    double number6 = Integer.parseInt(parts2[1]);
                    System.out.println("La divison es:" + (number5 / number6));
                    break;
                case 5:
                    System.out.println("Ingrese dos numeros separados por (&)");
                    String textos3 = br.readLine();
                    String[] parts3 = textos3.split("&");
                    double number7 = Integer.parseInt(parts3[0]);
                    double number8 = Integer.parseInt(parts3[1]);
                    System.out.println("El modulo es:" + (number7 % number8));
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no seleccionada correctamente...");
                    break;
            }
        } while (opcion != 6);
    }
}


package EstructuraDatos.EjerciciosRecursivos;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

public class ReduccionFraccionesRecursivo {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String textos = br.readLine();
        String[] parts = textos.split("/");

        int numerador = Integer.parseInt(parts[0]);
        int denominador = Integer.parseInt(parts[1]);

        reducirFracciones(numerador, denominador, 2);

    }

    public static void reducirFracciones(int numerador, int denominador, int divisor) {
        int min = Math.min(numerador, denominador);

        if (divisor > min) {
            System.out.println(numerador + "/" + denominador);
            return;
        }

        if (numerador % divisor == 0 && denominador % divisor == 0) {
            reducirFracciones(numerador / divisor, denominador / divisor, divisor);
            return;
        }

        reducirFracciones(numerador, denominador, divisor + 1);
    }
}
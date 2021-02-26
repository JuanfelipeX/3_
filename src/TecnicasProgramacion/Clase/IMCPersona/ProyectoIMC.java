package TecnicasProgramacion.Clase.IMCPersona;

import javax.swing.JOptionPane;

public class ProyectoIMC {

    public static void main(String[] args) {

        Persona persona = new Persona();
        
        try {
        
        int numeroPersonas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas va a ingresar? "));
        Persona vectorLista[] = new Persona[numeroPersonas];

        for (int i = 0; i < vectorLista.length; i++) {

            persona.setNombre(JOptionPane.showInputDialog("Ingrese el nombre "));
            persona.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad ")));
            persona.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso ")));
            persona.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura ")));
            persona.setSexo((JOptionPane.showInputDialog("Ingrese el Sexo ")).charAt(0));
            persona.setCc(Long.parseLong((JOptionPane.showInputDialog("Ingrese su cc "))));

            JOptionPane.showMessageDialog(null, persona.toString());
            JOptionPane.showMessageDialog(null, "Su IMC es: " + persona.calcularImc());
            persona.estadoSalud();
            
        }
     
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

}


class Persona {

    private String nombre;
    private int edad;
    private int peso;
    private float altura;
    private char sexo;
    private long cc;

    public Persona(String nombre, int edad, int peso, float altura, char sexo, long cc) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.cc = cc;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public float calcularImc() {
        return (float) (this.peso / Math.pow(this.altura, 2));
    }

    public void estadoSalud() {
        JOptionPane.showMessageDialog(null, "Su estado de salud es:");
        
        if (calcularImc() < 18.5) {
            JOptionPane.showMessageDialog(null, "Peso inferior al normal");
            
        } else if (calcularImc() > 18.5 && calcularImc() < 24.9) {
            JOptionPane.showMessageDialog(null, "Normal");
            
        } else if (calcularImc() > 25.0 && calcularImc() < 29.9) {
            JOptionPane.showMessageDialog(null, "Peso surperior al normal");
            
        } else if (calcularImc() > 30.0) {
            JOptionPane.showMessageDialog(null, "Obeso");

        }
    }

    @Override
    public String toString() {
        return "Persona [altura=" + altura + ", cc=" + cc + ", edad=" + edad + ", nombre=" + nombre + ", peso=" + peso
                + ", sexo=" + sexo + "]";
    }

}

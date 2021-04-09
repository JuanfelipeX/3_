package TecnicasProgramacion.Clase.InterfacesEjemplo;

import javax.swing.JOptionPane;

public class Pofesion {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.cantar();

    }
}

interface Cantante {

    public void cantar();
}


class Persona implements Cantante {

    @Override
    public void cantar() {
        JOptionPane.showMessageDialog(null, "Axel Rose");
    }
}
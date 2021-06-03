package modelo;


public class Doctorado extends Docente{
    
    private final int HOURS_VALUE = 35000;

    public Doctorado() {
    }

    public Doctorado(String name, int id, int hours) {
        super(name, id, hours);
    }

    public int getHOURS_VALUE() {
        return HOURS_VALUE;
    }
    
}

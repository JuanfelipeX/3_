package modelo;

public class Pregrado extends Docente{
    
    private final int HOURS_VALUE = 15000;

    public Pregrado() {
    }
    
    public Pregrado(String name, int id, int hours) {
       super(name,id,hours);
    }

    public int getHOURS_VALUE() {
        return HOURS_VALUE;
    }

}

package modelo;


public class Maestria extends Docente{
 
    private final int HOURS_VALUE = 25000;

    public Maestria() {
    }
    
    public Maestria(String name, int id, int hours) {
        super(name, id, hours);
    }

    public int getHOURS_VALUE() {
        return HOURS_VALUE;
    }
    
}

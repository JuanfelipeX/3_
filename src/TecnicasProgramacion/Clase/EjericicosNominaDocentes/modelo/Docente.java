package modelo;

public abstract class Docente {
    
    private String name;
    private int id;
    private int hours;
    private String type;

    public Docente() {
    }

    public Docente(String name, int id, int hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void verifyEducation(){
        if(this.type.equalsIgnoreCase("Pregrado")){
            Docente p1 = new Pregrado();
        }
        if(this.type.equalsIgnoreCase("Maestria")){
            Maestria m1 = new Maestria();
        }
        if(this.type.equalsIgnoreCase("Doctorado")){
            Doctorado d1 = new Doctorado();
        }
    }
    
    public abstract int getHOURS_VALUE();
    
}

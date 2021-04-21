package EstructuraDatos.Taller2LinearList;



public interface LinearList {

    public boolean isEmpty();

    public int size();

    public Object get(int index);

    public int indexOf(Object theElement); //para el punto 3, retorna la posicio de la primera ocurrence of x in the list, return -1 si no esta en la lista

    public Object remove(int index);

    public void add(int index, Object theElement);

    @Override
    public String toString();
    
}

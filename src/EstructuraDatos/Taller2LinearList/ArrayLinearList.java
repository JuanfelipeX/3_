package EstructuraDatos.Taller2LinearList;



public class ArrayLinearList implements LinearList {

    protected Object[] element; // array of elements
    protected int size; // number of elements in array

    public ArrayLinearList(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        element = new Object[initialCapacity];
    }

     public void set(int index, Object theElement) {
        checkIndex(index);
        
        element[index] = theElement;
    }
    

    public ArrayLinearList() {// use default capacity of 10
        this(10);
    }

    @Override
    public boolean isEmpty() { // O(1)
        return size == 0;
    }

    @Override
    public int size() { // O(1)
        return size;
    }

    
    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        }
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return element[index]; // O(1)
    }

    @Override
    public int indexOf(Object theElement) { // O(size)
        // search element[] for theElement
        for (int i = 0; i < size; i++) {
            if (element[i].equals(theElement)) {
                return i;
            }
        }
        // theElement not found
        return -1;
    }

    @Override
    public Object remove(int index) { // O(size)
        checkIndex(index);
        // valid index, shift elements with higher index
        Object removedElement = element[index];
        for (int i = index + 1; i < size; i++) {
            element[i - 1] = element[i];
        }
        element[--size] = null;
        return removedElement;
    }

    @Override
    public void add(int index, Object theElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        }
        if (size == element.length) // no space, double capacity
        {
            element = ChangeArrayLength.changeLength1D(element, 2 * size);
        }
        // shift elements right one position
        for (int i = size - 1; i >= index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = theElement;
        size++;
    }

     //Añade un elemento al final de la lista
    public void add(Object theElement) {
        add(size, theElement);
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer("[");
        // put elements into the buffer
        for (int i = 0; i < size; i++) {
            if (element[i] == null) {
                s.append("null, ");
            } else {
                s.append(element[i].toString()).append(", ");
            }
        }
        if (size > 0) {
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        // create equivalent String
        return new String(s);
    }
    
    
}

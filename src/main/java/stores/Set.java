package stores;

import interfaces.ISet;

/**
* A generic implementation of the IList iterface.
*/
public class Set<E> implements ISet<E> {
    
    private MyArrayList<E> array = new MyArrayList<>();

    // INCOMPLETE.
    public boolean add(E element) {
        if(array.contains(element)){
            return false;
        }else{
            array.add(element);
            return true;
        }
        
    }

    // INCOMPLETE.
    public String toString() {
        if (array.isEmpty())
            return "[]";
        
        StringBuilder x = new StringBuilder("[");
        for (int i = 0; i < array.size(); i++) {
            if (i > 0)
                x.append(",");
            x.append(array.get(i));
        }
        x.append("]");
        return x.toString();
        // Returns a string representation of this Set object.
    }
    
    public void clear() {
        array.clear();
    }

    public boolean contains(E element) {
        return array.contains(element);
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public boolean remove(E element) {
        return array.remove(element);
    }

    public int size() {
        return array.size();
    }
    
}

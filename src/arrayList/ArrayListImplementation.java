package arrayList;

import java.util.Arrays;

public class ArrayListImplementation<T> {
    private Object [] element;
    private int size;
    private int capacity = 3;
    //   private static Object [] Object = new Object[2];


    public ArrayListImplementation() {
       element = new Object[capacity];
       size = 0;
    }

    public void add(T input) {
        for (int i = size; i < element.length; i++) {
            element[i] = input;
            break;
            }
            size++;
        if (size == capacity)addToArrayLength();
        }

    private void addToArrayLength() {
       int newLength = capacity *= 2;
        Object [] newElement = new Object[newLength];
        for (int i = 0; i < element.length; i++) {
            newElement[i] = element[i];
        }
        element = newElement;
    }

    public  int size() {
        return size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('{').append(Arrays.toString(element));
        sb.append('}');
        return sb.toString();
    }

    public  Object [] getAll() {
        Object [] newArray = new Object[size];
        for (int i = 0; i < element.length; i++) {
            newArray [i] = element[i];
            if (element[i+1] == null) break;
        }

        return newArray;
    }
    public void removeByIndex(int index){
        if (index > size || index< 0) throw new IllegalArgumentException("index out for " + index);
        for (int i = 0; i < element.length; i++) {
            if (i == index){
                for (int j = i; j < element.length-1; j++) {
                    element [j] = element [j+1];
                    if (j < element.length-1 && element [j + 1] == null) break;

                }
            }
        }
        size --;

    }

    public Object getByIndex(int input){
        for (int i = 0; i < element.length; i++) {
            if ( i == input) return element[i];
            }
        return null;
        }
    public void removeElement(T input){
        for (int i = 0; i < element.length; i++) {
            if (element[i] == input){
                for (int j = i; j < element.length-1; j++) {
                    element [j] = element [j+1];
                }
            }
        }
        size --;
    }

    public boolean getObject(Object object){
        for (Object element : element){
            if (element.equals(object)) return true;
        }

        return false;
    }


    public boolean contain(T input){
        for (int i = 0; i < element.length; i++) {
            if (element[i] == input) return true;
        }
        return false;

    }
}





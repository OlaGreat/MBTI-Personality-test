package arrayList;

import java.util.Arrays;

public class MyNewQueue<T> {
    private Object [] element;
    private int size;
    private int capacity;
    private int setCapacity;

    public MyNewQueue(int capacity){
        this.capacity = capacity;
        element = new Object[this.capacity];
        size = 0;
        setCapacity = 0;
    }

    public void enqueue(T input){
        if (capacity == setCapacity ){
            moveQueue();
        }
        if (size == capacity ) increaseCapacity();
        element [size] = input;
        size ++;
        setCapacity ++;
    }

//    public void enqueue(T ... input){
//        System.out.println(input.length);
//        if (capacity == setCapacity ){
//            moveQueue();
//        }
//        if (size == capacity ) increaseCapacity();
//        element [size] = input;
//        size ++;
//        setCapacity ++;
//    }



    private void increaseCapacity() {
        capacity+=1;
        int newLength = capacity;
        System.out.println(newLength);
        Object [] objects = new Object[newLength];
        for (int i = 0; i < element.length; i++) {
            objects [i] = element[i];
        }
        element = objects;
    }


    public int size() {
        return size;
    }

    public Object[] getAll(){
        Object [] newArray = new Object[element.length];
        for (int i = 0; i < element.length; i++) {
            newArray [i] = element[i];
    }
        return newArray;
    }


    public void remove() {
        for (int i = 0; i < element.length; i++) {
            if (element[i]!= null){
                element[i] = null;
                break;
            }
        }
        size--;
    }

    public Object getByIndex(int index){
        if (index > capacity || index < 0) throw new IllegalArgumentException("index out of bound for index "+ index);
        Object foundElement = element[index];
        return foundElement;
    }

    private void moveQueue(){
        for (int i = 0; i < element.length-1; i++) {
            if (element[i] == null){
                element[i] = element[i+1];
                element[i+1] = null;
                }
            }
        while (element[0] == null){
            moveQueue();
        }
        }

}





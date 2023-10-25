package arrayList;

public class MyQueue<T> {
    private final ArrayListImplementation <T> myArrayList = new ArrayListImplementation<>();


    public void enqueue(T element){
        myArrayList.add(element);
    }

    public int size() {
       return myArrayList.size();
    }
    public void getAll(){System.out.println(myArrayList);
    }


    public void dequeue() {
        myArrayList.removeByIndex(size()-size());
    }

    public Object getByIndex(int index){
       return myArrayList.getByIndex(index);
    }
}

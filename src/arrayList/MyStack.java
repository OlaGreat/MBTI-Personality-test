package arrayList;

public class MyStack<T> {
//    private ArrayListImplementation <T> myStack;
//    private int size;
//
//    public MyStack() {
//       myStack = new ArrayListImplementation<>();
//       size = 0;
//    }
    private final ArrayListImplementation <T> arrayList = new ArrayListImplementation<>();

    public void push(T element){
        arrayList.add(element);
    }


    public int getSize(){
      return  arrayList.size();
    }
    public Object peek(){
        return arrayList.getByIndex(arrayList.size()-1);
    }

    public void pop() {
        arrayList.removeByIndex(arrayList.size()-1);
    }

    public boolean search(T object){
        return arrayList.getObject(object);

    }

    public boolean empty() {
        if (getSize() > 0) return true;
        return false;
    }
}

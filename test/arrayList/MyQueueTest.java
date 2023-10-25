package arrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    @Test
    void testEnqueue(){
        MyQueue<Integer> number = new MyQueue<>();
        number.enqueue(6);
        number.enqueue(7);
        number.enqueue(8);
        number.enqueue(9);
        assertEquals(4, number.size());
        number.getAll();
    }

    @Test
    void testDequeue(){
        MyQueue<Integer> number = new MyQueue<>();
        number.enqueue(6);
        number.enqueue(7);
        number.enqueue(8);
        number.enqueue(9);

        assertEquals(4, number.size());
        number.dequeue();
        number.dequeue();
        assertEquals(2,number.size());
        number.getAll();

        assertEquals(9,number.getByIndex(1));

    }



}
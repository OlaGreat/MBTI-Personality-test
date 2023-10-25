package arrayList;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    @Test
    void testStackPush() {
        MyStack<Integer> number = new MyStack<>();
        number.push(5);
        number.push(3);
        number.push(5);
        number.push(8);

        assertEquals(4, number.getSize());
    }

    @Test
    void testStackPop() {
        MyStack<Integer> number = new MyStack<>();
        number.push(5);
        number.push(3);
        number.push(5);
        number.push(8);

        number.pop();

        assertEquals(3, number.getSize());

    }

    @Test
    void testPeek() {
        MyStack<Integer> number = new MyStack<>();
        number.push(5);
        number.push(3);
        number.push(5);
        number.push(8);

        number.pop();
        assertEquals(5, number.peek());

    }

    @Test
    void testSearch() {
        MyStack<Integer> number = new MyStack<>();
        number.push(5);
        number.push(3);
        number.push(5);
        number.push(8);

        assertTrue(number.search(8));
    }

    @Test
    void testEmpty() {
        MyStack<Integer> number = new MyStack<>();
        number.push(5);
        number.push(3);
        number.push(5);
        number.push(8);


        assertTrue(number.empty());


    }
}
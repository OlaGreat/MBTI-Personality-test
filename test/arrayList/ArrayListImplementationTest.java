package arrayList;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListImplementationTest {
    @Test
    void testThatElementCanBeAddedToTheList(){
        ArrayListImplementation<Integer> number = new ArrayListImplementation<>();

        number.add(6);
        number.add(5);
        number.add(9);
        number.add(2);

        System.out.println(Arrays.toString(number.getAll()));

    }
    @Test
    void removeByIndex(){
        ArrayListImplementation<Integer> number = new ArrayListImplementation<>();
        number.add(4);
        number.add(5);
        number.add(9);
        number.add(2);

        number.removeByIndex(2);
        number.removeByIndex(1);

       Object [] expected = {4,2};
       assertArrayEquals(expected, number.getAll());

    }
    @Test
    void removeByElement(){
        ArrayListImplementation<Integer> number = new ArrayListImplementation<>();
        number.add(4);
        number.add(5);
        number.add(9);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(2);

       number.removeElement(4);
       assertEquals(5, number.getByIndex(0));
        number.getAll();
        assertEquals(14, number.size());
    }



    @Test
    void testThatElementCanBeGettingByIndex(){
        ArrayListImplementation<Integer> number = new ArrayListImplementation<>();
        number.add(4);
        number.add(5);
        number.add(9);
        number.add(2);

        assertEquals(9,number.getByIndex(2));

    }
    @Test
    void contain(){
        ArrayListImplementation<Integer> number = new ArrayListImplementation<>();
        number.add(4);
        number.add(5);
        number.add(9);
        number.add(2);

        assertTrue(number.contain(5));

    }
}
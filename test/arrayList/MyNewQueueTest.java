package arrayList;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyNewQueueTest {
    @Test
    void testAdd(){
        MyNewQueue<PregnantWomen> pregnantWomenQueue = new MyNewQueue<>(7);

        pregnantWomenQueue.enqueue(new PregnantWomen("Oluchi",18,"5 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Inem",21,"4 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Remigious",20,"7 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Haneefah",16,"8 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Haneefah",16,"8 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Haneefah",16,"8 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Haneefah",16,"8 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Oluchi",18,"5 month"));
        assertEquals(8,pregnantWomenQueue.size());



    }
    @Test
    void testRemove(){
        MyNewQueue<PregnantWomen> pregnantWomenQueue = new MyNewQueue<>(7);



        pregnantWomenQueue.enqueue(new PregnantWomen("Oluchi",18,"5 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Inem",21,"4 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Remigious",20,"7 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Haneefah",16,"8 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Goodness",12,"8 month"));


        pregnantWomenQueue.remove();
        assertEquals(4,pregnantWomenQueue.size());


    }

    @Test
    void testGetByIndex(){
        MyNewQueue<PregnantWomen> pregnantWomenQueue = new MyNewQueue<>(7);

        PregnantWomen haneefah = new PregnantWomen("Haneefah",16,"8 month");

        pregnantWomenQueue.enqueue(new PregnantWomen("Oluchi",18,"5 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Inem",21,"4 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Remigious",20,"7 month"));
        pregnantWomenQueue.enqueue(haneefah);
        pregnantWomenQueue.enqueue(new PregnantWomen("Goodness",12,"8 month"));

        assertEquals(haneefah,pregnantWomenQueue.getByIndex(3));

    }
    @Test
    void testQueueMovement(){
        MyNewQueue<PregnantWomen> pregnantWomenQueue = new MyNewQueue<>(7);

        pregnantWomenQueue.enqueue(new PregnantWomen("Oluchi",18,"5 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Inem",21,"4 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Remigious",20,"7 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Haneefah",16,"8 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Goodness",13,"8 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Haneefah",16,"8 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Haneefah",16,"8 month"));


        pregnantWomenQueue.remove();
        assertEquals(6,pregnantWomenQueue.size());


        pregnantWomenQueue.enqueue(new PregnantWomen("Oluchi",18,"5 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Oluchi",18,"5 month"));
        pregnantWomenQueue.enqueue(new PregnantWomen("Oluchi",18,"5 month"));

        assertEquals(9,pregnantWomenQueue.size());

    }

//    @Test
//    void testMultipleInputForAdd(){
//        MyNewQueue<Integer> numbers = new MyNewQueue<>(7);
//        numbers.enqueue(2,4,6,8,9,6,2);
//        assertEquals(7,numbers.size());
//        System.out.println(Arrays.toString(numbers.getAll()));
//
//
//    }

}
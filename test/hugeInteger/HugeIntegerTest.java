package hugeInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {
    @Test
    void testParseMethod() {
        HugeInteger number = new HugeInteger();
        String input = "1111111";
        assertTrue((number.parse(input).isEqualTo(new HugeInteger().parse("1111111"))));

    }


    @Test
    void testNAdd() {
        HugeInteger number = new HugeInteger();
        String input = "103994915";
        String input1 = "587294805";
        HugeInteger expected = new HugeInteger().parse("691289720");
        assertTrue(number.parse(input).addition(input1).isEqualTo(expected));
    }

    @Test
    void testSubtract() {
        HugeInteger number = new HugeInteger();
        String input = "722497900";
        String input1 = "222222900";
        HugeInteger expected = new HugeInteger().parse("500275000");
        System.out.println(number.parse(input).subtraction(new HugeInteger().parse(input1)));
        assertTrue(number.parse(input).subtraction(new HugeInteger().parse(input1)).isEqualTo(expected));
    }

    @Test
    void testIsEqualTo() {
        HugeInteger number = new HugeInteger();
        String input = "722497900";
        assertTrue(number.parse("222222900").isEqualTo(new HugeInteger().parse("222222900")));

    }
    @Test
    void testIsNotEqualTo(){
        HugeInteger number = new HugeInteger();
        String input = "722497900";
        assertTrue(number.parse(input).isNotEqualTo(new HugeInteger().parse("222222900")));
    }

    @Test
    void testIsGreaterThan(){
        HugeInteger number = new HugeInteger();
        String input = "722497900";
        String input1 = "222222900";
        assertTrue(number.parse(input).isGreaterThan(new HugeInteger().parse(input1)));
        String input2 = "722497900";
        assertFalse(number.parse(input2).isGreaterThan(new HugeInteger().parse(input2)));

    }

    @Test
    void testIsLessThan(){
        HugeInteger number = new HugeInteger();
        String input = "722497900";
        String input1 = "22222900";
        assertTrue(number.parse(input1).isLessThan(new HugeInteger().parse(input)));

    }

}
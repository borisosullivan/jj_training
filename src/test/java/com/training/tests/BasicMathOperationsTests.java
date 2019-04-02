package com.training.tests;

import com.sptraining.basicMathOps.BasicMathOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicMathOperationsTests {
    BasicMathOperations basicMathOperations = new BasicMathOperations();

    @Test
    public void testBasics() {
        int additionResult = BasicMathOperations.basicMath("+", 3, 14);
        int subtractionResult = BasicMathOperations.basicMath("-", 21, 9);
        int multiplicationResult = BasicMathOperations.basicMath("*", 4, 5);
        int divisionResult = BasicMathOperations.basicMath("/", 35, 7);

        assertEquals(17, additionResult);
        assertEquals(12, subtractionResult);
        assertEquals(20, multiplicationResult);
        assertEquals(5, divisionResult);
    }

    @Test
    public void testRandomAddition() {
        Double random1 = Math.floor(Math.random() * 1005);
        Double random2 = Math.floor(Math.random() * 1005);
        int value1 = random1.intValue();
        int value2 = random2.intValue();
        int additionRandomResult = BasicMathOperations.basicMath("+", value1, value2);

        assertEquals((value1 + value2), additionRandomResult);
    }

    @Test
    public void testRandomSubtraction() {
        Double random1 = Math.floor(Math.random() * 1005);
        Double random2 = Math.floor(Math.random() * 1005);
        int value1 = random1.intValue();
        int value2 = random2.intValue();
        int additionRandomResult = BasicMathOperations.basicMath("-", value1, value2);

        assertEquals((value1 - value2), additionRandomResult);
    }

    @Test
    public void testRandomMultiplication() {
        Double random1 = Math.floor(Math.random() * 1005);
        Double random2 = Math.floor(Math.random() * 1005);
        int value1 = random1.intValue();
        int value2 = random2.intValue();
        int additionRandomResult = BasicMathOperations.basicMath("*", value1, value2);

        assertEquals((value1 * value2), additionRandomResult);

    }

    @Test
    public void testRandomDivision() {
        Double random1 = Math.floor(Math.random() * 1005);
        Double random2 = Math.floor(Math.random() * 1005);
        int value1 = random1.intValue();
        int value2 = random2.intValue();
        int additionRandomResult = BasicMathOperations.basicMath("/", value1, value2);

        assertEquals((value1 / value2), additionRandomResult);
    }

}

package com.sptraining;

import com.sptraining.basicMathOps.BasicMathOperations;

public class JavaApp {

    public static void main(String[] args) {
        BasicMathOperations basicMathOperations = new BasicMathOperations();

        int result = basicMathOperations.basicMath("/", 10, 2);
        System.out.println(result);
    }

}

package com.azerty;

public class TestMathLib {

    private MathLib toTest;

    private void prepare() {
        toTest = new MathLib();
    }

    // adds two positive numbers
    public void testPlusPositive() {
        prepare();
        System.out.println(toTest.plus(4, 2).equals(6) ? "plus positive test passed" : "plus positive test failed");
    }

    // subtracts two positive numbers a>b
    public void testMinusPositive() {
        prepare();
        System.out.pintln(toTest.minus(4, 2).equals(2) ? "subtracts positive test passed" : "subtracts positive test failed");
    }

    //  multiplies two positive numbers
    public void testMultiplyPositive() {
        prepare();
        System.out.print(toTest.multiply(4, 2).equals(8) ? "multiply positive test passed" : "multiply positive test failed");
    }

    // divides two numbers a>b>0
    public void testDividePositive() {
        prepare();
        System.out.println(toTest.divide(4, 2).equals(2) ? "divides positive test passed" : "divides positive test failed");
    }

    //  tests 2nd power of 4
    public void testExpoPositive() {
        prepare();
        System.out.println(toTest.exponent(4, 2).equals(16) ? "2nd power positive test passed" : "2nd power test failed");
    }

    // tests factorial of a positive number
    public void testFactorial() {
        prepare();
        System.out.println(toTest.factorial(3).equals(6) ? "factorial of positive test passed" : "factorial of positive test failed");
    }

    // tests modulo with two a>b>0
    public void testModuloPositive() {
        prepare();
        System.out.println(toTest.modulo(5, 2).equals(1) ? "modulo test passed" : "modulo test failed");
    }

    // adds two negative numbers
    public void testPlusNegativ() {
        prepare();
        System.out.println(toTest.plus(-4, -2).equals(-6) ? "plus negative test passed" : "plus negative test failed");
    }

    // subtracts two positive numbers a<b
    public void testMinusPositive() {
        prepare();
        System.out.pintln(toTest.minus(2, 5).equals(-3) ? "subtracts positive test passed" : "subtracts positive test failed");
    }

    // subtracts two negative numbers
    public void testMinusPositive() {
        prepare();
        System.out.pintln(toTest.minus(-4, -3).equals(1) ? "subtracts negative test passed" : "subtracts negative test failed");
    }
}

package com.azerty;

public class TestMathLib {

    private MathLib toTest;

    private void prepare() {
        toTest = new MathLib();
    }

    // adds two positive numbers
    public void testPlusPositive() {
        prepare();
        toTest.plus(4, 2);
    }

    // substracts two positive numbers a>b
    public void testMinusPositive() {
        prepare();
        toTest.minus(4, 2);
    }

    //  multiplies two positive numbers
    public void testMultiplyPositive() {
        prepare();
        toTest.multiply(4, 2);
    }

    // divides two numbers a>b>0
    public void testDividePositive() {
        prepare();
        toTest.divide(4, 2);
    }

    //  tests 2nd power of 4
    public void testExpoPositive() {
        prepare();
        toTest.exponent(4, 2);
    }

    // tests factorial of a positive number
    public void testFactorial() {
        prepare();
        toTest.factorial(42);
    }

    // tests modulo with two a>b>0
    public void testModuloPositive() {
        prepare();
        toTest.modulo(4, 2);
    }

}

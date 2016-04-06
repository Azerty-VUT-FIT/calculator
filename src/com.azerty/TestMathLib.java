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

    // substract two positive numbers a>b
    public void testMinusPositive() {
        prepare();
    }
}

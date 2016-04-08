package com.azerty;

public class TestMathLib {

    private MathLib toTest;

    private void prepare() {
        toTest = new MathLib();
    }

    // adds two positive numbers
    public void testPlusPositive() {
        prepare();
        System.out.println(toTest.getPlus(4, 2).equals(6) ? "getPlus positive test passed" : "getPlus positive test failed");
    }

    // subtracts two positive numbers a>b
    public void testMinusPositiveAB() {
        prepare();
        System.out.println(toTest.getMinus(4, 2).equals(2) ? "subtracts positive test passed" : "subtracts positive test failed");
    }

    //  multiplies two positive numbers
    public void testMultiplyPositive() {
        prepare();
        System.out.print(toTest.getMultiply(4, 2).equals(8) ? "getMultiply positive test passed" : "getMultiply positive test failed");
    }

    // divides two numbers a>b>0
    public void testDividePositive() {
        prepare();
        System.out.println(toTest.getDivide(4, 2).equals(2) ? "divides positive test passed" : "divides positive test failed");
    }

    //  tests 2nd power of 4
    public void testExpoPositive() {
        prepare();
        System.out.println(toTest.getExponent(4, 2).equals(16) ? "2nd power positive test passed" : "2nd power test failed");
    }

    // tests getFactorial of a positive number
    public void testFactorial() {
        prepare();
        System.out.println(toTest.getFactorial(3).equals(6) ? "getFactorial of positive test passed" : "getFactorial of positive test failed");
    }

    // tests getModulo with two a>b>0
    public void testModuloPositive() {
        prepare();
        System.out.println(toTest.getModulo(5, 2).equals(1) ? "getModulo test passed" : "getModulo test failed");
    }

    // adds two negative numbers
    public void testPlusNegative() {
        prepare();
        System.out.println(toTest.getPlus(-4, -2).equals(-6) ? "getPlus negative test passed" : "getPlus negative test failed");
    }

    // subtracts two positive numbers a<b
    public void testMinusPositiveBA() {
        prepare();
        System.out.println(toTest.getMinus(2, 5).equals(-3) ? "subtracts positive test passed" : "subtracts positive test failed");
    }

    // subtracts two negative numbers
    public void testMinusNegative() {
        prepare();
        System.out.println(toTest.getMinus(-4, -3).equals(1) ? "subtracts negative test passed" : "subtracts negative test failed");
    }
    //ToDo errors check
}

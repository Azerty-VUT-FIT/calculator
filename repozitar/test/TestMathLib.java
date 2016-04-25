package toTest;

public class TestMathLib {

    public TestMathLib() { }

    private MathLib toTest;

    private void prepare() {
        toTest = new MathLib();
    }

		/**
     * Sum of two positive integer numbers.
		 */
    // adds two positive numbers
    public void testPlusPositive() {
        prepare();
        System.out.println(toTest.getPlus(4, 2).equals("6.0") ? "getPlus positive test passed" : "getPlus positive test failed");
    }

		/**
     * Difference of two positive integer numbers.
		 */
    // subtracts two positive numbers a>b
    public void testMinusPositiveAB() {
        prepare();
        System.out.println(toTest.getMinus(4, 2).equals("2.0") ? "subtracts positive test passed" : "subtracts positive test failed");
    }

		/**
     * Multiple of two positive integer numbers.
		 */
    //  multiplies two positive numbers
    public void testMultiplyPositive() {
        prepare();
        System.out.println(toTest.getMultiply(4, 2).equals("8.0") ? "getMultiply positive test passed" : "getMultiply positive test failed");
    }

		/**
     * Quotient of two positive integer numbers.
		 */
    // divides two numbers a>b>0
    public void testDividePositive() {
        prepare();
        System.out.println(toTest.getDivide(4, 2).equals("2.0") ? "divides positive test passed" : "divides positive test failed");
    }

		/**
     * 2nd power of number four.
		 */
    //  tests 2nd power of 4
    public void testExpoPositive() {
        prepare();
        System.out.println(toTest.getExponent(4, 2).equals("16.0") ? "2nd power positive test passed" : "2nd power test failed");
    }

		/**
	   * Factorial of positive integer number.
		 */
    // tests getFactorial of a positive number
    public void testFactorial() {
        prepare();
        System.out.println(toTest.getFactorial(3).equals("6") ? "getFactorial of positive test passed" : "getFactorial of positive test failed");
    }

		/**
	   * Modulo of two positive integer numbers, where a>b.
		 */
    // tests getModulo with two a>b>0
    public void testModuloPositive() {
        prepare();
        System.out.println(toTest.getModulo(5, 2).equals("1.0") ? "getModulo test passed" : "getModulo test failed");
    }

		/**
	   * Sum of two negative numbers.
		 */
    // adds two negative numbers
    public void testPlusNegative() {
        prepare();
        System.out.println(toTest.getPlus(-4, -2).equals("-6.0") ? "getPlus negative test passed" : "getPlus negative test failed");
    }

		/**
	   * Sum of two negative numbers.
		 */
    // subtracts two positive numbers a<b
    public void testMinusPositiveBA() {
        prepare();
        System.out.println(toTest.getMinus(2, 5).equals("-3.0") ? "subtracts positive test passed" : "subtracts positive test failed");
    }
		/**
	   * Difference of two negative numbers.
		 */
    // subtracts two negative numbers
    public void testMinusNegative() {
        prepare();
        System.out.println(toTest.getMinus(-4, -3).equals("-1.0") ? "subtracts negative test passed" : "subtracts negative test failed");
    }

		/**
	   * Negative 2nd power of number six.
		 */
    // tests negative 2nd power of 6
    public void testExpoNegative(){
        prepare();
        double x=(1/36); //correct answer
        System.out.println(toTest.getExponent(6, -2).equals(Double.toString(x)) ? "negative 2nd power test passed" : "negative 2nd power test failed");
        System.out.println(x);
        System.out.println(toTest.getExponent(6, -2));
    }

		/**
	   * Negative factorial of number.
		 */
    // negative factorial
    public void testNegativeFactorial(){
        prepare();
        System.out.println(toTest.getFactorial(-3).equals(toTest.mathError) ? "negative factorial test passed" : "negative factorial test failed");
    }

		/**
	   * Dividing with number zero.
		 */
    //dividing with 0
    public void testDivideZero(){
        prepare();
        System.out.println(toTest.getDivide(6, 0).equals(toTest.mathError) ? "dividing with 0 test passed" : "dividing with 0 test failed");
    }


    //launches all basic tests
    public void test(){
        testDividePositive();
        testDivideZero();
        //testExpoNegative();
        testExpoPositive();
        testFactorial();
        testMinusNegative();
        testMinusPositiveAB();
        testMinusPositiveBA();
        testModuloPositive();
        testMultiplyPositive();
        testNegativeFactorial();
        testPlusPositive();
        testPlusNegative();
    }

    //ToDo Overflow errors tests -multiply - division

		/**
	   * Overflow multiply..
		 */
    //overflow multiply
    public void testOverflowMulti(){
        prepare();
        System.out.println(toTest.getMultiply(Double.MAX_VALUE, 10).equals(toTest.overError) ? "overflow multiply test passed" : "overflow multiply test failed");
    }
}

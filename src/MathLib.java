/**
 *@file Mathlib.java
 *@brief Mathematical library of Azerty calculator
 *@author Azerty team
 *@date April 2016
 */

package toTest;

public class MathLib{

    //public MathLib() { }
		/**
     * math error message.
		 */
    public static final String mathError = "syntax error"; //math mathError message
		/**
     * calc not able to handle such a large number
		 */
    public static final String overError = "math error"; //calc not able to handle such a large number


		/**
     * This function returns absolute value of number.
     * @param x intiger number
     * @return absolute value of number x
		 */
    //returns absolute value
    public static int absoluteValue (int x) {
        if (x>=0) return x;
        else return -x;
    }

		/**
     * This function check double overflow.
     * @param eq double number
     * @return true or false
		 */
    //checks double overflow
    public static boolean overCheck(double eq) {
        if (Double.isInfinite(eq)) return true;
        return false;
    }

		/**
     * This function check double underflow.
     * @param eq double number
     * @return true or false
		 */
    //checks double underflow
    public static boolean underCheck(double eq) {
        if (eq==0) return true;
        return false;
    }

		/**
     * This function returns sum of two numbers.
     * @param a first double number
     * @param b second double number
     * @return sum of a and b
		 */
    //plus calculation
    public static double plus(double a, double b) {
        return a+b;
    }
    static String getPlus(double a, double b) {
        return Double.toString(plus(a, b));
    }

		/**
     * This function returns difference of two numbers.
     * @param a first double number
     * @param b second double number
     * @return difference of a and b
		 */
    //minus calculation
    public static double minus(double a, double b) {
        return a-b;
    }
    static String getMinus(double a, double b) {
        return Double.toString(minus(a, b));
    }

		/**
     * This function returns multiple of two numbers.
     * @param a first double number
     * @param b second double number
     * @return multiple of a and b
		 */
    //multiply calculation
    public static double multiply(double a, double b) {
        return a*b;
    }
    static String getMultiply(double a, double b) {
        double eq = multiply(a, b);
        if (overCheck(eq)) return overError;
        else if (underCheck(eq) && !(a==0 || b==0)) return overError;
        return Double.toString(eq);
    }

		/**
     * This function returns quotient of two numbers.
     * @param a first double number
     * @param b second double number
     * @return quotient of a and b
		 */
    //divide operation
    public static double divide(double a, double b) {
        return a/b;
    }
    //division exception handling
    static String getDivide(double a, double b) {
        if (b==0) return mathError;
        return Double.toString(divide(a, b));
    }

		/**
     * This function returns y-power of number x.
     * @param x double number
     * @param y integer number - exponent
     * @return y-power of number x
		 */
    //exponent calculation
    public static double exponent(double x, int y) {
        if (y==0) return 1;
        double eq=x; //result
        for (int i = absoluteValue(y); i>1; i--)
            eq *=x; //power
        return y>0 ? eq : 1/eq; // positive exponent - normal result : negative exponent - inverted result
    }
    static String getExponent(double x, int y) {
        double eq = exponent(x, y);
        if (overCheck(eq)) return overError;
        else if (underCheck(eq) && x!=0) return overError;
        return Double.toString(eq);
    }

		/**
     * This function returns factorial of number.
     * @param a integer number
     * @return factorial of number a
		 */
    //factorial calculation
    public static long factorial(int a) {
        if (a==0) return 1; //0! = 1
        if (a<0) return 0;
        return a*factorial(a-1); //recursive calculation
    }
    //factorial exception handling
    static String getFactorial(int a) {
        if (a<0) return mathError; // a! <=> a<0 = mathError
        long eq = factorial(a);
        if (underCheck(eq)) return overError;
        return Long.toString(eq);
    }

		/**
     * This function returns modulo.
     * @param a first double number
     * @param b second double number
     * @return modulo of number a and number b
		 */
    //modulo calculation
    public static double modulo(double a, double b) {
        return a%b;
    }
    static String getModulo(double a, double b) {
        return Double.toString(modulo(a, b));
    }
}

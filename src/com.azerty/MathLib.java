package com.azerty;

public class MathLib {

    public MathLib() { }

    public static final String mathError = "syntax error"; //math mathError message
    public static final String overError = "math error"; //calc not able to handle such a large number

    //returns absolute value
    public static int absoluteValue (int x) {
        if (x>=0) return x;
        else return -x;
    }

    //checks double overflow
    private static boolean overCheck(double eq) {
        if (Double.isInfinite(eq)) return true;
        return false;
    }
    //checks double underflow
    private static boolean underCheck(double eq) {
        if (eq==0) return true;
        return false;
    }

    //plus calculation
    private static double plus(double a, double b) {
        return a+b;
    }
    static String getPlus(double a, double b) {
        return Double.toString(plus(a, b));
    }

    //minus calculation
    private static double minus(double a, double b) {
        return a-b;
    }
    static String getMinus(double a, double b) {
        return Double.toString(minus(a, b));
    }

    //multiply calculation
    private static double multiply(double a, double b) {
        return a*b;
    }
    static String getMultiply(double a, double b) {
        double eq = multiply(a, b);
        if (overCheck(eq)) return overError;
        else if (underCheck(eq) && !(a==0 || b==0)) return overError;
        return Double.toString(eq);
    }

    //divide operation
    private static double divide(double a, double b) {
        return a/b;
    }
    //division exception handling
    static String getDivide(double a, double b) {
        if (b==0) return mathError;
        return Double.toString(divide(a, b));
    }

    //exponent calculation
    private static double exponent(double x, int y) {
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


    //factorial calculation
    private static long factorial(int a) {
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

    //modulo calculation
    private static double modulo(double a, double b) {
        return a%b;
    }
    static String getModulo(double a, double b) {
        return Double.toString(modulo(a, b));
    }
}
package com.azerty;

public class MathLib {

    public MathLib() { }

    public static final String mathError = "math error"; //math mathError message
    public static final String overError = "calc error"; //calc not able to handle such a large number ToDo overflow checks

    //returns absolute value
    public static int absoluteValue (int x) {
        if (x>=0) return x;
        else return -x;
    }

    //plus calculation
    private static double plus(double a, double b) {
        return a+b;
    }
    static String getPlus(double a, double b) {
        double eq=a+b;
        if (a>0 && b>0 && eq>a && eq>b){
            return Double.toString(plus(a, b));
        }else if(a<0 && b<0 && eq<a && eq<b) {
            return Double.toString(plus(a, b));
        }
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
        long maximum = Long.signum(a) == Long.signum(b) ? Long.MAX_VALUE : Long.MIN_VALUE;

        if (a != 0 && (b > 0 && b > maximum / a ||
                b < 0 && b < maximum / a)) {
            return overError;
        }
            return Double.toString(multiply(a, b));
    }

    //divide operation
    private static double divide(double a, double b) {
        return a/b;
    }
    //division exception handling
    static String getDivide(double a, double b) {
        if (b==0) return "mathError";
        return Double.toString(divide(a, b));
    }

    //exponent calculation
    private static double exponent(double x, int y) {
        if (y==0) return 1;
        double eq=x; //result
        for (int i = absoluteValue(y); i>1; i--)
            eq *=x; //power ToDo overflow check
        return y>0 ? eq : 1/eq; // positive exponent - normal result : negative exponent - inverted result
    }
    static String getExponent(double x, int y) {
        return Double.toString(exponent(x, y));
    }


    //factorial calculation
    private static long factorial(int a) {
        if (a==0) return 1; //0! = 1
        return a*factorial(a-1); //recursive calculation
        //ToDo overflow check
    }
    //factorial exception handling
    static String getFactorial(int a) {
        if (a<0) return mathError; // a! <=> a<0 = mathError
        return Long.toString(factorial(a));
    }

    //modulo calculation
    private static double modulo(double a, double b) {
        return a%b;
    }
    static String getModulo(double a, double b) {
        return Double.toString(modulo(a, b));
    }
}
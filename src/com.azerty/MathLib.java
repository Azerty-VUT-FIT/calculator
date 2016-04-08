package com.azerty;

import java.util.DoubleSummaryStatistics;

public class MathLib {

    public MathLib() { }

    public static final String error = "error"; //error message

    public static int absoluteValue (int x) {
        if (x>=0) return x;
        else return -x;
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

    //multiply calculation ToDo
    private static double multiply(double a, double b) {
        return a*b;
    }
    static String getMultiply(double a, double b) {
        return Double.toString(multiply(a, b));
    }

    //divide operation
    private static double divide(double a, double b) {
        return a/b;
    }
    //division exception handling
    static String getDivide(double a, double b) {
        if (b==0) return "error";
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
        if (a<0) return error; // a! <=> a<0 = error
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
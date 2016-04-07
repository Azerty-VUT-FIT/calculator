package com.azerty;

public class MathLib {

    public MathLib() {
    }

    public static final String error = "error"; //error message

    static String getPlus(double a, double b) {
        return "";
    }

    static String getMinus(double a, double b) {
        return "";
    }

    static String getMultiply(double a, double b) {
        return "";
    }

    static String getDivide(double a, double b) {
        return "";
    }

    static String getExponent(double a, int b) {
        return "";
    }


    //factorial calculation
    private static long factorial(int a) {
        if (a==0) return 1; //0! = 1
        return factorial(a)*factorial(a-1); //recursive calculation
        //ToDo overflow check
    }

    static String getFactorial(int a) {
        if (a<0) return error; // a! <=> a<0 = error
        return Long.toString(factorial(a));
    }

    static String getModulo(double a, double b) {
        return "";
    }


}
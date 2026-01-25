package com.arham.foundations.concepts;

public class C004_ArithmeticOperatorsDemo {
    public static void main (String[] args){

        int x = 10;
        int y = 2;
        int z;

        z = x+y; //add
        System.out.println(z);
        z = x-y; //subtract
        System.out.println(z);
        z = x*y; //multiply
        System.out.println(z);
        z = x/y; //divide
        System.out.println(z);
        z = x % y; //remainder
        System.out.println(z);

        x += y; //augmented assignment operator
        System.out.println(x);
        x -= y;
        System.out.println(x);
        x *= y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
        x %= y;
        System.out.println(x);

        x = 10;
        x ++; //increment
        System.out.println(x);
        x --; //decrement
        System.out.println(x);

        // order of operations (PEMDAS)
        double result = 3+4* (7-5) / 2.0;
        System.out.println(result);
    }
}

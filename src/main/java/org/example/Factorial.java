package org.example;

public class Factorial {

    public int factorial(int a) {
        int fact = 1;
        if (a < 0) throw new ArithmeticException("Отрицательно число");
        for (int i = 1; i <= a; i++){
            fact = fact * i;
        }
        return fact;
    }
}

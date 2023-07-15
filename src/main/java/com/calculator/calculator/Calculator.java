package com.calculator.calculator;

public class Calculator {

    public  int add(int num1 , int num2){
        return num1 + num2;
    }

    public int subtract(int num1 , int num2){
        return num1-num2;
    }

    public int mutliply(int num1 , int num2){
        return num1 * num2;
    }

    public double divide(int num1, int num2){
        if (num2==0){
            throw new ArithmeticException("A number is divided by zero is not allowed");
        }

        return num1/num2;
    }
}

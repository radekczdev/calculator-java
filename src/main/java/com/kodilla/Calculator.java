package com.kodilla;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,6));

    }
}

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a sample project to test Qodana in TeamCity!");

        Calculator calculator = new Calculator();

        // Intentional bug: Division by zero will throw an exception
        int result = calculator.divide(10, 0);
        System.out.println("Result: " + result);

        // Unused variable
        String unusedVariable = "This variable is not used.";
    }
}

package com.revature.maven.jars;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result is : " +checkIfInputIsAnEvenNumber(122)); // Testing in the main method
    }

    public static boolean checkIfInputIsAnEvenNumber(int number){
        return number % 2 == 0;
    }
}
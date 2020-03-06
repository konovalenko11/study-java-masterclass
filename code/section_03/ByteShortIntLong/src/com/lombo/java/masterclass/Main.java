package com.lombo.java.masterclass;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer MIN value: " + myMinIntValue);
        System.out.println("Integer MAX value: " + myMaxIntValue);
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value: " + (myMinIntValue - 1));

        int myIntTest = myMaxIntValue + 100;
        System.out.println("My overflowed int value: " + myIntTest);
    }
}

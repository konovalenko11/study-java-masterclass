package com.lombo.java.masterclass;

public class Main {

    public static void main(String[] args) {

        // Integer
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer MIN value: " + myMinIntValue);
        System.out.println("Integer MAX value: " + myMaxIntValue);
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value: " + (myMinIntValue - 1));

        int myIntTest = myMaxIntValue + 100;
        System.out.println("My overflowed int value: " + myIntTest);

        // Byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte MIN value: " + myMinByteValue);
        System.out.println("Byte MAX value: " + myMaxByteValue);
        System.out.println("Busted MAX Byte value (implicit): " + (myMaxByteValue + 10));
        System.out.println("Busted MAX Byte value (explicit): " + (byte)(myMaxByteValue + 10));

        // Short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short MIN value: " + myMinShortValue);
        System.out.println("Short MAX value: " + myMaxShortValue);
        System.out.println("Busted MAX Short value (implicit): " + (myMaxShortValue + 10));
        System.out.println("Busted MAX Short value (explicit): " + (short)(myMaxShortValue + 10));

        // Long
        long myLongValue = 100L;
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long MIN value: " + myMinLongValue);
        System.out.println("Long MAX value: " + myMaxLongValue);
        System.out.println("Busted MAX Long value (implicit): " + (myMaxLongValue + 10));
        System.out.println("Busted MAX Long value (explicit): " + (long)(myMaxLongValue + 10));

        long myBigLongValue = 2_147_483_648L;

        int myTotalIntValue = myMinIntValue / 2;
        byte myTotalByteValue = (byte) (myMinByteValue / 2);
        short myTotalShortValue = (short) (myMinShortValue / 2);

    }
}

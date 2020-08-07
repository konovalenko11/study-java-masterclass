package com.lombo.java.masterclass;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class PrimitiveTypeChallenge {

    public static int randomInt (int min, int max) {
        Random rand = new Random();

        float r = rand.nextFloat();
        int i = (int) (r * ((long) max - min + 1)) + min;

        return i;
    }

    public static void main(String[] args) {
        /*
         *  1. Create a BYTE variable and assign valid BYTE value;
         *  2. Create a SHORT variable and assign valid SHORT value;
         *  3. Create a INT variable and assign valid INT value;
         *  4. Create a LONG variable and assign valid 50000 + 10 * sum of Byte, Short, Int;
         */

        byte sampleByte = (byte) randomInt(Byte.MIN_VALUE, Byte.MAX_VALUE);
        short sampleShort = (short) randomInt(Short.MIN_VALUE, Short.MAX_VALUE);
        int sampleInt = randomInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int sampleInt2 = new Random().nextInt();

        System.out.println("Sample BYTE: [" + sampleByte + "];");
        System.out.println("Sample SHORT: [" + sampleShort + "];");
        System.out.println("Sample INT: [" + sampleInt + "];");
        System.out.println("Sample INT2: [" + sampleInt2 + "];");
        System.out.println("Sample SUM: [" + (long) (sampleByte + sampleShort + sampleInt + sampleInt2) + "];");

        long sampleLong = 50000 + ((long) 10 * (sampleByte + sampleShort + sampleInt + sampleInt2));
        long sampleLong2 = 50000L + (10L * (Integer.MAX_VALUE + 10));

        System.out.println("Sample LONG: [" + sampleLong + "];");
        System.out.println("Sample LONG2: [" + sampleLong2 + "];");
    }
}

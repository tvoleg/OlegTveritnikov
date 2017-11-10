package com.lesson1.lesson12.doubleObj;

public class CreateObj {
    public static void main(String[] args) {
        Double aDouble1 = 1.5;
        Double aDouble2 = 5.5;
        Double aDoubled3 = Double.valueOf(4.4);
        Double aDoubled4 = Double.valueOf("1010");
        Double aDoubled5 = Double.parseDouble("3.14");

        String d = aDouble1.toString(3.14);

        System.out.println(aDouble1);
        System.out.println(aDouble2);
        System.out.println(aDoubled3);
        System.out.println(aDoubled4);
        System.out.println(aDoubled5);
        System.out.println(" ");

        System.out.println(aDouble1.byteValue());
        System.out.println(aDouble1.shortValue());
        System.out.println(aDouble1.intValue());
        System.out.println(aDouble1.longValue());
        System.out.println(aDouble1.floatValue());
        System.out.println(aDouble1.doubleValue());

        System.out.println(d);
    }
}

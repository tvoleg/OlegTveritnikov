package com.lesson1.lesson12.doubleValueOfCheck;

public class DoubleValueOfCheck {

    public static void byteToString(byte b1) {
        String s1 = Byte.toString(b1);
        System.out.println("It's byte to String - " + s1);
    }

    public static void shortToString(short sh1) {
        String s1 = Short.toString(sh1);
        System.out.println("It's short to String - " + s1);
    }

    public static void charToString(char c1) {
        String s1 = Character.toString(c1);
        System.out.println("It's char to String - " + s1);
    }

    public static void intToString(int i1) {
        String s1 = Integer.toString(i1);
        System.out.println("It's int to String - " + s1);
    }

    public static void longToString(long l1) {
        String s1 = Long.toString(l1);
        System.out.println("It's long to String - " + s1);
    }

    public static void floatToString(float f1) {
        String s1 = Float.toString(f1);
        System.out.println("It's  float to String - " + s1);
    }

    public static void booleanToString(Boolean bo1) {
        String s1 = Boolean.toString(bo1);
        System.out.println("It's  boolean to String - " + s1);
    }

    @Override
    public String toString() {
        return "DoubleValueOfCheck{}";
    }

    public static void main(String[] args) {
        Double object = Double.valueOf(11.11);
        Double object1 = Double.valueOf(33.33);

        System.out.println("Приведение Double при помощи valueOf() = " + object + " and " + object1);

        double d1 = Double.parseDouble("24.5");
        System.out.println(
                "Приведение String к double при помощи parseDouble() = " + d1);


    }

}


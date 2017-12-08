package com.lesson1.lesson9.circle;

public class CircleDemo {
    private double radius;
    static final double PI = 3.14;

    CircleDemo(double radius) {
        this.radius = radius;
    }

    public double areaCircle() {
        return (radius * radius) * PI;
    }

    public double longCircle() {
        return 2 * PI * radius;
    }

    public void printInfo() {
        System.out.println("Радиус круга = " + radius + "\n" + "Площадь круга = " + areaCircle() + "\n"
                + "Длинна окружности = " + longCircle() + "\n");
    }

    public static void main(String[] args) {
        CircleDemo circle = new CircleDemo(23);
        CircleDemo circle1 = new CircleDemo(12.34);
        circle.areaCircle();
        circle.longCircle();
        circle1.areaCircle();
        circle1.longCircle();

        circle.printInfo();
        circle1.printInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CircleDemo that = (CircleDemo) o;

        return Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "CircleDemo{" +
                "radius=" + radius +
                '}';
    }
}

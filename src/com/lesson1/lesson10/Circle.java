package com.lesson1.lesson10;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle radius: " + radius + ", with color: " + getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Белый", 23);
        Circle circle1 = new Circle("Красный", 13);
        circle.draw();
        circle1.draw();
    }
}

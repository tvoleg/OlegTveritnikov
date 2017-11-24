package com.lesson1.lesson10.shape;

import javafx.scene.shape.Circle;

public class Сircle extends Shape {
    private int radius;

    public Сircle(String color, int radius) {
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

        Сircle сircle = (Сircle) o;

        return radius == сircle.radius;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return "Сircle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

 /*   public static void main(String[] args) {
        Circle circle = new Circle(20, "Белый");
        Circle circle1 = new Circle(10, "Красный");
        circle.draw();
        circle1.draw();
    }*/
}

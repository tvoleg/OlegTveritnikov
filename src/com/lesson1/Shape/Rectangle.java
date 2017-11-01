package com.lesson1.Shape;

public class Rectangle extends Shape {
    public Rectangle(double x1, double x2, double x3, double y1, double y2, String color) {
        super(x1, x2, x3, y1, y2, "Белый");
    }

    public double draw() {
        System.out.println("Прямоугольник "+ x2*y1 +" "+ color);
        return (x2*y1);
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }
}
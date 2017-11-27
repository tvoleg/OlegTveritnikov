package com.lesson1.lesson10;

public class Rectangle extends Shape {
    private int x1, y1;

    public Rectangle(String color, int x1, int y1) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void draw() {
        System.out.println("Прямоугольник с площадью =  " + x1 * y1 + ", и цветом: " + getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (x1 != rectangle.x1) return false;
        return y1 == rectangle.y1;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x1;
        result = 31 * result + y1;
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "x1=" + x1 +
                ", y1=" + y1 +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Синий", 21, 15);
        Rectangle rectangle1 = new Rectangle("Черный", 34, 44);
        rectangle.draw();
        rectangle1.draw();
    }
}
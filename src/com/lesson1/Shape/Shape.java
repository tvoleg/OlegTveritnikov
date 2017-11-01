package com.lesson1.Shape;

abstract public class Shape {
    String color;
    double x1, x2, x3, y1, y2;

    public Shape(double x1,double x2,double x3,double y1,double y2,String color) {
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.color = color;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (Double.compare(shape.x1, x1) != 0) return false;
        if (Double.compare(shape.x2, x2) != 0) return false;
        if (Double.compare(shape.x3, x3) != 0) return false;
        if (Double.compare(shape.y1, y1) != 0) return false;
        if (Double.compare(shape.y2, y2) != 0) return false;
        return color != null ? color.equals(shape.color) : shape.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color != null ? color.hashCode() : 0;
        temp = Double.doubleToLongBits(x1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(x2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(x3);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }

    abstract public double draw();
}
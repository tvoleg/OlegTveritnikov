package com.lesson1.lesson10.shape;

public class Array {
    public static void main(String[] args) {
        Shape[] figures = new Shape[3];
        figures[0] = new Сircle("Белый", 33);
        figures[1] = new Сircle("Красный", 11);
        figures[2] = new Rectangle("Зеленый", 10, 5);
        for (Shape figure : figures) {
            figure.draw();
            System.out.println(figure);
        }
        System.out.println (figures[0].equals(figures[1]));
    }

    @Override
    public String toString() {
        return "Array{}";
    }
}

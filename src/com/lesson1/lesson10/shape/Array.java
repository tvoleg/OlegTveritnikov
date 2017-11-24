package com.lesson1.lesson10.shape;

public class Array {
    public static void main(String[] args) {
        Shape[] figures = new Shape[3];
        figures[0] = new Сircle(2.3, 3.3, 4.4, 5.5, 6.6,"Синий");
        figures[1] = new Сircle(1.1, 2.2, 3.3, 4.4, 5.5, "Зеленый");
        figures[2] = new Rectangle(55.5, 44.4, 33.3, 22.2, 11.1,"Белый");
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

package com.lesson1.lesson10.shape;

public class Сircle extends Shape {
    public Сircle(double x1, double x2, double x3, double y1, double y2, String color){
        super (x1,x2,x3,y1,y2,"Синий");
    }
    public double draw(){
        System.out.println("Центр круга " + x1 +" "+ color);
        return x1;
    }

    @Override
    public String toString() {
        return "Сircle{}";
    }
}

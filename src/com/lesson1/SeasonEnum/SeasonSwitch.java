package com.lesson1.SeasonEnum;


public class SeasonSwitch {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        med1(season);
    }

    private static void med1(Season season) {
        switch (season){
            case WINTER:
                System.out.println("Season - Winter");
                break;
            case SPRING:
                System.out.println("Season - Spring");
                break;
            case SUMMER:
                System.out.println("Season - Summer");
                break;
            case AUTUMN:
                System.out.println("Season - Autumn");
                break;
        }
    }

}

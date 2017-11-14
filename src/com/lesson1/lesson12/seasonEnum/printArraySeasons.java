package com.lesson1.lesson12.seasonEnum;

public class printArraySeasons {
    public static void main(String[] args) {
        Season season;
        System.out.println("Seasons: ");
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s + " " + s.getTemp());
        }
        System.out.println();

        for (Season s : seasons) {
            System.out.println(s + " " + s.getDescription());
        }
        System.out.println();

        season = Season.valueOf("SUMMER");
        System.out.println("The best season is " + season);
        season.getDescription();
    }
}

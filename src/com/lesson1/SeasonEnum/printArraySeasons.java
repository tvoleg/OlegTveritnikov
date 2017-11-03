package com.lesson1.SeasonEnum;

public class printArraySeasons {
    public static void main(String[] args) {
        Season season;
        System.out.println("Seasons: ");
        Season[]seasons = Season.values();
        for (Season s:seasons){
            System.out.println(s+ ""+ s.getTemp());
        }
        System.out.println( );

        season = Season.valueOf("SUMMER");
        System.out.println("The best season is "+ season);
    }
}

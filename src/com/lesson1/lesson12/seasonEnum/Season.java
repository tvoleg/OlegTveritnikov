package com.lesson1.lesson12.seasonEnum;


public enum Season {
    WINTER(-10), SPRING(12), SUMMER(20), AUTUMN(10);

    private int temp;

    Season(int temp) {
        this.temp = temp;
    }
    public int getTemp(){return temp;}

    public String getSeasonCode(){
        return "Холодное время года";
    }
}

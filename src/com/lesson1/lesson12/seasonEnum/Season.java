package com.lesson1.lesson12.seasonEnum;


public enum Season {
    WINTER(-10), SPRING(12), SUMMER(20){
        public String getDescription(){
            return "Теплое время года.";
        }
    }, AUTUMN(10);

    private int temp;

    Season(int temp) {
        this.temp = temp;
    }
    public int getTemp(){return temp;}

    public String getDescription(){
        return "Холодное время года";
    }
}

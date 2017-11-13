package com.lesson1.lesson15.cookable;

public class Food {
    public void prepare (Cookable c){
        c.cook();
    }

    public static void main(String[] args) {
        Food f = new Food();
        f.prepare(new Cookable (){
            public void cook(){
                System.out.println("Prepare dinner..."+f);
            }
        });
    }
}

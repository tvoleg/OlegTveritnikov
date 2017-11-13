package com.lesson1.lesson17;


import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
   private int weight;
    private int height;
    private int depth;

    private HeavyBox(){
    }

    private HeavyBox (int weight, int height,int depth){
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "HeavyBox: " +
                "weight=" + weight +
                ", height=" + height +
                ", depth=" + depth;
    }

    public static void main(String[] args) {
        List<HeavyBox> hb = new ArrayList<>();
        hb.add(new HeavyBox(1,2,3));
        hb.add(new HeavyBox(4,5,6));
        hb.add(new HeavyBox(7,8,9));
        HeavyBox box = new HeavyBox();
        hb.add(box);
        for(HeavyBox h : hb){
            System.out.println(h);
        }
    }
}

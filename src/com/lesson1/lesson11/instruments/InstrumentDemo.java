package com.lesson1.lesson11.instruments;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[]{new Guitar(7), new Drum(4),
                new Trumpet(23.5), new Guitar(5), new Drum(20), new Trumpet(11)};
        for (Instrument instrument : instruments) {
            instrument.play();
        }
        System.out.println("Звучит " + Instrument.KEY);
    }
}

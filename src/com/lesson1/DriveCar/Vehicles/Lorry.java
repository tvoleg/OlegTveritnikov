package com.lesson1.DriveCar.Vehicles;

import com.lesson1.DriveCar.Details.Engine;
import com.lesson1.DriveCar.Professions.Driver;

public class Lorry extends Car {
    int carrying;

    public Lorry(String marka, String carClass, Driver driver, Engine engine, int carrying) {
        super(marka, carClass, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }
    public void setCarrying (int carrying) {this.carrying = carrying;}

    @Override
    public String toString() {
        return "Lorry{} " + super.toString();
    }
}

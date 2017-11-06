package com.lesson1.lesson9.driveCar.vehicles;

import com.lesson1.lesson9.driveCar.details.Engine;
import com.lesson1.lesson9.driveCar.professions.Driver;
import com.lesson1.lesson9.driveCar.vehicles.Car;

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

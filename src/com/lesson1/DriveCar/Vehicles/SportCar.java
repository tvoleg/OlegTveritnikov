package com.lesson1.DriveCar.Vehicles;

import com.lesson1.DriveCar.Professions.Driver;
import com.lesson1.DriveCar.Details.Engine;

public class SportCar extends Car {
    public double speed;

    public SportCar(String marka, String carClass, Driver driver, Engine engine, double speed) {
        super(marka, carClass, driver, engine);
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed (double speed) {this.speed = speed;}

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}

package com.lesson1.lesson9.driveCar.vehicles;

import com.lesson1.lesson9.driveCar.professions.Driver;
import com.lesson1.lesson9.driveCar.details.Engine;
import com.lesson1.lesson9.driveCar.vehicles.Car;

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

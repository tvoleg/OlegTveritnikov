package com.lesson1.lesson9.driveCar.vehicles;

import com.lesson1.lesson9.driveCar.professions.Driver;
import com.lesson1.lesson9.driveCar.details.Engine;

public class SportCar extends Car {
    private double speed;

    public SportCar(String marka, String carClass, Driver driver, Engine engine, SportCar speed) {
        super(marka, carClass, driver, engine, speed);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportCar sportCar = (SportCar) o;

        return Double.compare(sportCar.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(speed);
        return (int) (temp ^ (temp >>> 32));
    }
}

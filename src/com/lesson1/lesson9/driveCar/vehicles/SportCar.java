package com.lesson1.lesson9.driveCar.vehicles;


import com.lesson1.lesson9.driveCar.details.Engine;
import com.lesson1.lesson9.driveCar.professions.Driver;

public class SportCar  extends Car{
    private double speed;

    public SportCar(double speed, String marka, String carClass, Driver driver, Engine engine) {
        super(marka,  carClass,  driver,  engine);
        this.speed = speed;
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

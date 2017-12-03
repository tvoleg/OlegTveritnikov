package com.lesson1.lesson9.driveCar.vehicles;

import com.lesson1.lesson9.driveCar.details.Engine;
import com.lesson1.lesson9.driveCar.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(int carrying, String marka, String carClass, Driver driver, Engine engine) {
        super(marka, carClass, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lorry lorry = (Lorry) o;

        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        return carrying;
    }
}

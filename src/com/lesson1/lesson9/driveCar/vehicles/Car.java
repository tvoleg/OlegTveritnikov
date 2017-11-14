package com.lesson1.lesson9.driveCar.vehicles;

import com.lesson1.lesson9.driveCar.details.Engine;
import com.lesson1.lesson9.driveCar.professions.Driver;

public class Car {
    private String carClass, marka;
    private Driver driver;
    private Engine engine;
    private static SportCar speed;

    public Car(String marka, String carClass, Driver driver, Engine engine, SportCar speed) {
        this.marka = marka;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;
        this.speed = speed;
    }

    private void start() {
        System.out.println("едет прямо");
    }
    private void stop() {
        System.out.println("остановился");
    }
    private void turnLeft() {
        System.out.println("повернул налево");
    }
    private void turnRight() {
        System.out.println("повернул направо");
    }



    public void printInfo() {
        System.out.println("Марка авто: " + marka + " Класс авто: " + carClass);
        System.out.println("Компания производитель: " + engine.getCompany() + " Мощность двигателя: " + engine.getPower());
        System.out.println("Водитель: " + driver.getFullName() + ", Возраст: " + driver.getAge() + "год" + ", С опытом вождения: "
                + driver.getExperience() + "года, со скоростью " + speed.getSpeed());
    }

    public static void main(String[] args) {
        Driver driver = new Driver("Олег Алексеевич; ", 21, 3);
        Engine engine = new Engine(234, " Mercedes; ");
        Car myCar = new Car(" Mercedes S class; ", " Luxury Car; ", driver, engine, 33.33);
        myCar.printInfo();
        myCar.start();
        myCar.stop();
        myCar.turnLeft();
        myCar.turnRight();
    }
}

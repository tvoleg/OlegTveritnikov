package com.lesson1.DriveCar.Vehicles;

import com.lesson1.DriveCar.Details.Engine;
import com.lesson1.DriveCar.Professions.Driver;


public class Car {
    String carClass, marka;
    Driver driver;
    Engine engine;

    public Car(String marka, String carClass, Driver driver, Engine engine) {
        super();
        this.marka = marka;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;

    }

    public void start() {
        System.out.println("Едет прямо");
    }

    public void stop() {
        System.out.println("Остановился");
    }

    public void turnLeft() {
        System.out.println("Повернул налево");
    }

    public void turnRight() {
        System.out.println("Повернул направо");
    }

    public void printInfo() {
        System.out.println("Марка авто: " + marka + " Класс авто: " + carClass);
        System.out.println(
                "Компания производитель: " + engine.getCompany() + " Мощность двигателя: " + engine.getPower());
        System.out.println("Водитель: " + driver.getFullName() + ", Возраст: " + driver.getAge() + "год" + ", С опытом вождения: "
                + driver.getExperience() + "года");
    }

    public static void main(String[] args) {
        Driver driver = new Driver("Олег Алексеевич; ", 21, 3);
        Engine engine = new Engine(234, " Mercedes; ");
        Car myCar = new Car(" Mercedes S class; ", " Luxury Car; ", driver, engine);
        myCar.printInfo();

    }
}

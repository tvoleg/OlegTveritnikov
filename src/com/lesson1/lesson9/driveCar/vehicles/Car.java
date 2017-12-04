package com.lesson1.lesson9.driveCar.vehicles;

import com.lesson1.lesson9.driveCar.details.Engine;
import com.lesson1.lesson9.driveCar.professions.Driver;

public class Car {
    private String carClass, marka;
    private Driver driver;
    private Engine engine;

    public Car(String marka, String carClass, Driver driver, Engine engine) {
        this.marka = marka;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Едет прямо. ");
    }

    public void stop() {
        System.out.println("Остановился. ");
    }

    public void turnLeft() {
        System.out.println("Поверачивает налево. ");
    }

    public void turnRight() {
        System.out.println("Поворачивает направо. ");
    }


    public void printInfo() {
        System.out.println("Марка авто: " + marka + " Класс авто: " + carClass);
        System.out.println("Компания производитель: " + engine.getCompany() + " Мощность двигателя: " + engine.getPower());
        System.out.println("Водитель: " + driver.getFullName() + ", Возраст: " + driver.getAge() + " год(лет)" + ", c опытом вождения: "
                + driver.getExperience() + " год(а)(лет).");
    }

    public static void main(String[] args) {
        Driver driver = new Driver("Олег Алексеевич; ", 21, 3);
        Driver driver1 = new Driver("Michael Shumaher ", 43, 15);
        Driver driver2 = new Driver("Mike Huston ", 32, 7);

        Engine engine = new Engine(234, " Mercedes; ");
        Engine engine1 = new Engine(345, " BMW ");
        Engine engine2 = new Engine(990, " CAT ");

        Car myCar = new Car(" Mercedes S class; ", " Luxury Car; ", driver, engine);
        SportCar maxSpeedCar = new SportCar(333.3, "Formula-1, ", "Faster car, ", driver1, engine1);
        Lorry monsterTruck = new Lorry(500, "CAT", "The biggest truck", driver2, engine2);

        myCar.printInfo();
        myCar.start();
        System.out.println("После чего ");
        myCar.turnRight();
        System.out.println(" ");

        maxSpeedCar.printInfo();
        maxSpeedCar.stop();
        System.out.println(" ");

        monsterTruck.printInfo();
        monsterTruck.turnLeft();
    }
}

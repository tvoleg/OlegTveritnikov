package com.lesson1.lesson7.phone;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone phoneApple = new Phone(223, "2", 4);
        Phone phoneNokia = new Phone();
        Phone phoneSamsung = new Phone();

        phoneNokia.number = 2;
        phoneNokia.model = "Nokia 3310";
        phoneNokia.weight = 150;

        phoneSamsung.number = 3;
        phoneSamsung.model = "Samsung J7";
        phoneSamsung.weight = 300;

        System.out.println("Number =" + phoneApple.number);
        System.out.println("Model =" + phoneNokia.number);
        System.out.println("Weight =" + phoneSamsung.number);

        phoneApple.receiveCall("Alex ");
        System.out.println(phoneApple.getPhoneNumber());
        phoneApple.receiveCall("Alex ", " 223342");

        phoneApple.sendMassage ();
        phoneApple.sendMassage (phoneApple.number, 34643);
        phoneApple.sendMassage(1111, 22, 3, 444);

        phoneApple.setNumber(1111);
        phoneApple.setModel("s7");
        phoneApple.setWeight(3);

        System.out.println("Number =" + phoneApple.getNumber());
        System.out.println("Number =" + phoneApple.getModel());
        System.out.println("Number =" + phoneApple.getWeight());
        System.out.println(phoneApple.getCount());


    }
}

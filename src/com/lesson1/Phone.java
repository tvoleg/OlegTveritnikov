package com.company;

public class Phone {

    public static void main(String[] args) {
        PhoneMy phoneApple = new PhoneMy(223, "2", 4);
        PhoneMy phoneNokia = new PhoneMy();
        PhoneMy phoneSamsung = new PhoneMy();

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

        System.out.println("Number =" + phoneApple.getNumber);
        System.out.println("Number =" + phoneApple.getModel);
        System.out.println("Number =" + phoneApple.getWeight);

    }
}

package com.lesson1.DriveCar.Details;

public class Engine {
    private int power;
    private String company;

    public Engine(int power, String company) {
        super();
        this.company = company;
        this.power = power;
    }

    public int getPower() { return power; }

    public void setPower(int power) { this.power = power; }

    public String getCompany() { return company; }
    public void setCompany(String company) {this.company = company;}

    public static void main(String[] args) {
    }
    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}

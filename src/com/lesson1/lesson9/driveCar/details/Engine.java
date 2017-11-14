package com.lesson1.lesson9.driveCar.details;

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


    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != engine.power) return false;
        return company != null ? company.equals(engine.company) : engine.company == null;
    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + (company != null ? company.hashCode() : 0);
        return result;
    }
}

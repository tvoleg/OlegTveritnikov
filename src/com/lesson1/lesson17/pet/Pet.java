package com.lesson1.lesson17.pet;

public class Pet {
    private String name;
    private String address;

    public Pet(String name) {this.name = name;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Pet(String name, String address){this.name = name; this.address = address;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (name != null ? !name.equals(pet.name) : pet.name != null) return false;
        return address != null ? address.equals(pet.address) : pet.address == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pet:" +
                "name: " + name + '\'' +
                ", address: " + address;
    }
}

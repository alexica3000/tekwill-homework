package com.tekwill.learning.methods;

public class Dog {
    private String name;
    private String breed;
    private String idNumber;

    public Dog(String name, String breed, String idNumber) {
        this.name = name;
        this.breed = breed;
        setIdNumber(idNumber);
    }

    public String getName() {
        return "Mr." + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = "ID-" + idNumber;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void bark() {
        System.out.println("Bark! Bark! Bark!");
    }

    public void run(int numberOfMeters) {
        System.out.println("Running " + numberOfMeters);
    }
}

package rvt.exercises;

public class Person {

    String name;
    String adress;

    public Person() {
        
    }

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String toString() {
        return name + "\n" + adress;
    }
}
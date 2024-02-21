package rvt.exercises;

public class Person {

    String name;
    String adress;
    Education education;
    public Person() {
        
    }

    /* public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    } */

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public String toString() {
        return name + ", " + education;
    }
}

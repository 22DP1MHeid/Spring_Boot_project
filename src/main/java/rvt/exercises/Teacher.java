package rvt.exercises;

public class Teacher extends Person{
    public int salary;

    public Teacher(String name, String adress, int salary) {
        this.name = name;
        this.adress = adress;
        this.salary = salary;
    }

    public String toString() {
        return this.name + "\n" + this.adress + "\n" + "salary " + this.salary + " euro/month";
    }
}

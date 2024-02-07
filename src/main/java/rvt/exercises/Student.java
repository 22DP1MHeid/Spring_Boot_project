package rvt.exercises;

public class Student extends Person {
    //public String name;
    //public String surname;
    //public String email;
    //public String group;
    public int credits;


    //public Student(String name, String surname, String email, String group) {
        //this.name = name;
        //this.surname = surname;
        //this.email = email;
        //this.group = group;
    //}

    public Student(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public void study() {
        this.credits += 1;
    }

    public int credits() {
        return this.credits;
    }
}

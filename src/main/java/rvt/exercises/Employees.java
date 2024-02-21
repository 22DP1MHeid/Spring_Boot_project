package rvt.exercises;

import java.util.*;

public class Employees {
    ArrayList<Person> employees;

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(ArrayList<Person> peopleToAdd) {
        for (int i = 0; i < peopleToAdd.size(); i++) {
            employees.add(peopleToAdd[i]);
        }
    }

    public void print() {
        
    }

    public void print(Education education) {

    }

    public void fire(Education education) {

    }

}

package rvt.exercises;

public class CD implements Packable{
    private String author;
    private String name;
    private int year;
    private double weight;

    public CD(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return author + ": " + name + " (" + year + ")";
    }

    @Override
    public double weight() {
        weight = weight + 0.1;
        return weight;
    }
}

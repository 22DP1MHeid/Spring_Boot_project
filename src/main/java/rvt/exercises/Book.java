package rvt.exercises;

public class Book implements Packable{
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return author + ": " + name;
    }

    @Override
    public double weight() {
        weight = weight + this.weight;
        return weight;
    }
}

package rvt.exercises;

public class Money {
    private final int euros;
    private final int cents;
    
    //Constructor
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    //Constructor overloading // Second class constructor
    public Money() {
        this.euros = 0;
        this.cents = 0;
    }

    // Third constructor
    public Money(int euros) {
        this.euros = euros;
        this.cents = 0;
    }
    
    public int euros() {
        return euros;
    }
    
    public int cents() {
        return cents;
    }
    
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
    
        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        // if there are 100 cents turns them into 1 euro
        if (newCents >= 100) {
            newCents -= 100; // same as newCents = newCents - 100
            newEuros++; // newEuros = newEuros + 1
        }

        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    // Method overloading // divas metodes ar vienadu vardu
    public Money plus(int euroAmount) {
        int newEuros = this.euros + euroAmount;
        return new Money(newEuros, 0);
        }

    public boolean lessThan(Money compared) {
        if (this.euros >= compared.euros && this.cents >= compared.cents) {
            return false;
        } else if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {

        if (this.euros - decreaser.euros <= 0 && this.cents - decreaser.cents <= 0) {
            return new Money(0, 0);
        }

        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newCents < 0) {
            newEuros--;
            newCents = 100 + newCents;
        }

        return new Money(newEuros, newCents);
    }
}
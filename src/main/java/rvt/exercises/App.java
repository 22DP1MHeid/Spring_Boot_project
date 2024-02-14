package rvt.exercises;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void printPersons(ArrayList<Person> persons) {
        int size = persons.size();
        for (int i = 0; i < size; i++) {
            System.out.println(persons.get(i));
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);


        Box box = new Box(10);
        
        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
        
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        
        System.out.println(box);
    }

        /* 
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
        
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

        
        // test for the 1st step of Card Payments
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());


        // test for the 2nd step of Card Payments
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);



        // test for the 3rd step of Card Payments
        PaymentTerminal unicafeExactum2 = new PaymentTerminal();

        double change2 = unicafeExactum2.eatAffordably(10);
        System.out.println("remaining change: " + change2);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful2 = unicafeExactum2.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful2);
        wasSuccessful2 = unicafeExactum2.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful2);
        wasSuccessful2 = unicafeExactum2.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful2);

        System.out.println(unicafeExactum2);



        // test for the 4th step of Card Payments
        PaymentTerminal unicafeExactum3 = new PaymentTerminal();
        System.out.println(unicafeExactum3);

        PaymentCard annesCard3 = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard3.balance() + " euros");

        boolean wasSuccessful3 = unicafeExactum3.eatHeartily(annesCard3);
        System.out.println("there was enough money: " + wasSuccessful3);

        unicafeExactum3.addMoneyToCard(annesCard3, 100);

        wasSuccessful3 = unicafeExactum3.eatHeartily(annesCard3);
        System.out.println("there was enough money: " + wasSuccessful3);

        System.out.println("amount of money on the card is " + annesCard3.balance() + " euros");

        System.out.println(unicafeExactum3); 
        
        rvt.DefaultController.testABC();
        rvt.DefaultController.testInheritance(); 

        rvt.DefaultController.testPerson();
        rvt.DefaultController.testStudent();
        rvt.DefaultController.testStudentToString();
        rvt.DefaultController.testTeacher();*/
}
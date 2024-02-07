package rvt.exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        

        /* 
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
        rvt.DefaultController.testInheritance(); */

        rvt.DefaultController.testPerson();
        rvt.DefaultController.testStudent();

    }
}
package be.intecbrussel.opdrachten.opdracht2;

import java.util.Scanner;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("enter your age: ");
        int ageGiven = kbd.nextInt();

        Consumer<Integer> consumer = (Integer age) -> {
            if (age < 18) {
                System.out.println("You are too yong");
            } else {
                if (age > 17) {
                    System.out.println("you are too old");
                }

            }
        };
        consumer.accept(ageGiven);

    }

}




package be.intecbrussel.opdrachten.opdracht3;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(4)+1;


        };

        Function<Integer, String> function = (Integer i) -> {

            double i2 =i;

            double newNumber = i2/4*100;

            return i + " changed into " + newNumber;




        };
        System.out.println(function.apply(supplier.get()));

    }

}
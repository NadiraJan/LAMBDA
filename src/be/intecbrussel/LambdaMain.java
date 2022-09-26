package be.intecbrussel;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaMain {
    public static void main(String[] args) {

        Game game = (String toy) -> {
            System.out.println("Play game with: " + toy);
        };

        game.playGame("doll");

        Consumer<String> consumer = (String toy) -> {
            System.out.println("Play game with: " + toy);
        };
        consumer.accept("Marbles");


        Runnable runnable = () -> {
            System.out.println("hello");

        };
        runnable.run();

        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };
        System.out.println(supplier.get());

        Function<Integer, String> function = (Integer i) -> {
            int newNumber = i * 4;
            return i + " changed into " + newNumber;
        };
        System.out.println(function.apply(5));
    }
}
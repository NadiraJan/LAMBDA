package be.intecbrussel.opdrachten.opdracht1;

import be.intecbrussel.Game;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {


        Consumer<String> consumer = (String food) ->
                System.out.println("Eating a " + food);


        consumer.accept("cookie");


        Supplier<String> supplier = () -> {
            String time = LocalDateTime.now().toString();
            return "The time right now is: " + time;
        };


            System.out.println(supplier.get());


            Function<String, Integer> function = (String a) -> a.length();
            System.out.println(function.apply("cookie"));

            Runnable runnable = () -> {
                System.out.println("oof");
            };
            runnable.run();

        }
    }

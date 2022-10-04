package be.intecbrussel.opdrachten.opdracht4;

import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        Function<Double, Function<Integer, Consumer<String>>> f = d -> i -> s -> {
            System.out.println("" + d+ "; " + i+ "; " + s);
        };
        f.apply(1.0).apply(2).accept("s");

    }
}

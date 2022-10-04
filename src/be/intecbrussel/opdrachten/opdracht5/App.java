package be.intecbrussel.opdrachten.opdracht5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {

        IntStream.of(5,8,640,1111,27,16).filter(n->n%8==0).map(n->n/4).forEach(System.out::println);






    }
}

package be.intecbrussel.opdrachten.opdracht6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("ShaRk");
        animals.add("DOg");
        animals.add("PirAnha");
        animals.add("MouSE");
        animals.add("CaT");
        animals.add("ParRoT");
        animals.add("DOLphin");

        List<String>result = animals.stream().map(b->b.toLowerCase(Locale.ROOT)).filter(s->s.contains("a")).
                sorted(Comparator.comparingInt(n->n.length())).collect(Collectors.toList());




        }


        }






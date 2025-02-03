package listas;

import model.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EjmploComparator {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>(List.of(new Persona("juan","toni", LocalDate.of(2000,9,9))));
        Persona sara = new Persona("sara","leo",LocalDate.of(2001,11,9));
        personas.add(sara);
        personas.add(new Persona("àngel","fran",LocalDate.of(2002,6,28)));
        Persona izan = new Persona("izan","leo",LocalDate.of(2002,6,28));
        personas.add(izan);
        Persona raquel = new Persona("raquel","leo",LocalDate.of(2004,4,29));
        personas.add(raquel);

        System.out.println(personas);
        //ordenado por el orden natural, es decir por Comparable
        Collections.sort(personas);
        System.out.println(personas);

        //ordenador por un comparator
        personas.sort(Persona.SORT_BY_AGE);
        System.out.println(personas);
    }
}

package listas;

import model.Persona;

import java.time.LocalDate;
import java.util.*;

public class MainIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("a","u","o","e","i","a","e","i","a","u","o","e","i","a","e","i"));

//        for (int i = 0; i < lista.size(); i++) {
//            System.out.print(lista.get(i) + " - ");
//        }
//        System.out.println();
//        for(String vocal:lista){
//            System.out.print(vocal + " - ");
//        }
        System.out.println();
        //iterador, mostrar por pantalla el contenido de la lista
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()){
            String vocal = iterator.next();
            if (vocal.contains("u")){
                iterator.remove();
            }else {
            System.out.print(vocal);
            }
        }

        System.out.println();
        List<String> lista2 = new ArrayList<>(lista);
        System.out.println(lista2);

        Set<String> conjunto = new HashSet<>(lista);
        System.out.println(conjunto);


        List<Persona> personas = new LinkedList<>(List.of(new Persona("juan","toni", LocalDate.of(2000,9,9))));
        Persona sara = new Persona("sara","leo",LocalDate.of(2001,11,9));
        personas.add(sara);
        personas.add(new Persona("àngel","fran",LocalDate.of(2002,6,28)));
        Persona izan = new Persona("izan","leo",LocalDate.of(2003,7,3));
        personas.add(izan);
        Persona raquel = new Persona("raquel","leo",LocalDate.of(2004,4,29));
        Persona raquel2 = new Persona("raquel","leo",LocalDate.of(2005,4,29));
        personas.add(raquel2);
        personas.add(raquel);
        personas.add(raquel);


        Set<Persona> personaConjunto = new HashSet<>(personas);
//        personaConjunto.remove(personas.get(3));
        System.out.println(personaConjunto);

        Set<Persona> personaConjunto2 = new LinkedHashSet<>(personas);
        System.out.println(personaConjunto2);

        Set<Persona> personaConjunto3 = new TreeSet<>(personas);
        System.out.println(personaConjunto3);



    }
}

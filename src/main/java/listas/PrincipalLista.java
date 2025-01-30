package listas;

import model.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrincipalLista {
    public static void main(String[] args) {
        //crear una lista de enteros, añadir 5 elementos, imprimir el tamaño,
        //imprimid la lista, quitar el primer elemento, añadirle de una los elementos 73, 71, 17
        //imprimid la lista, poned (no añadir, sino substituyendo) en la segunda posición el número 23
        List<Integer> numerosPrimos = new ArrayList<>();
        numerosPrimos.add(2);
        numerosPrimos.add(3);
        numerosPrimos.add(5);
        numerosPrimos.add(7);
        numerosPrimos.add(11);
//        System.out.println(numerosPrimos.size());
//        System.out.println(numerosPrimos);
        numerosPrimos.remove(0);
//        List<Integer> numerosPrimos1 = new ArrayList<>();
//        numerosPrimos1.add(73);
//        numerosPrimos1.add(71);
//        numerosPrimos1.add(17);
//        numerosPrimos.addAll(numerosPrimos1);
        numerosPrimos.addAll(List.of(73,71,17));
//        System.out.println(numerosPrimos);
        numerosPrimos.set(1,23);
//        System.out.println(numerosPrimos);

        List<Persona> personas = new LinkedList<>(List.of(new Persona("juan","toni",LocalDate.of(2000,9,9))));
        Persona sara = new Persona("sara","leo",LocalDate.of(2001,11,9));
        personas.add(sara);
        personas.add(new Persona("àngel","fran",LocalDate.of(2002,6,28)));
        Persona izan = new Persona("izan","leo",LocalDate.of(2003,7,3));
        personas.add(izan);
        Persona raquel = new Persona("raquel","leo",LocalDate.of(2004,4,29));
        personas.add(raquel);
        personas.add(raquel);
        personas.add(raquel);

//        System.out.println(personas);
        //imprimir las personas que no tienen una r en el nombre
        for(Persona persona:personas){
            if(!(persona.getNombre().contains("r"))){
                System.out.print(persona);
            }
        }

        //si el nombre contiene la r, lo borramos, sino lo imprimo
        //no se puede modificar una lista miestras iteras en un foreach
        //esto no funciona
//        for(Persona persona:personas){
//            if((persona.getNombre().contains("r"))){
//                personas.remove(persona);
//            } else {
//                System.out.println(persona);
//            }
//        }

        Persona persona;
        Iterator<Persona> iterador = personas.iterator();
        while(iterador.hasNext()){
            persona = iterador.next();
            if(persona.getNombre().contains("r")){
                iterador.remove();
                System.out.println("Hemos borrado: " + persona);
            }
            else
                System.out.println(persona);
        }

        System.out.println(personas);










    }
}

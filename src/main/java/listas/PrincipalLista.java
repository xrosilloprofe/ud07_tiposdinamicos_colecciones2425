package listas;

import java.util.ArrayList;
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
        System.out.println(numerosPrimos.size());
        System.out.println(numerosPrimos);
        numerosPrimos.remove(0);
//        List<Integer> numerosPrimos1 = new ArrayList<>();
//        numerosPrimos1.add(73);
//        numerosPrimos1.add(71);
//        numerosPrimos1.add(17);
//        numerosPrimos.addAll(numerosPrimos1);
        numerosPrimos.addAll(List.of(73,71,17));
        System.out.println(numerosPrimos);
        numerosPrimos.set(1,23);
        System.out.println(numerosPrimos);
    }
}

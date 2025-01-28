package tad;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListaEnteros lista = new ListaEnteros();
        System.out.println(lista);
        lista.addCabeza(33);
        System.out.println(lista);
        lista.addCabeza(22);
        System.out.println(lista);
        lista.addCola(44);
        lista.addCola(55);
        System.out.println(lista);
        System.out.println(lista.search(22));
        System.out.println(lista.search(55));
        System.out.println(lista.search(555));
        int[] array = lista.toArray();
        System.out.println(Arrays.toString(array));
        ListaEnteros lista2 = new ListaEnteros();
        lista2.addCola(1);
        lista2.addCola(2);
        lista.addAll(lista2);
        System.out.println(lista);
        lista.remove(5);
        System.out.println(lista);
        lista.remove(4);
        System.out.println(lista);
        lista.addCola(5);
        System.out.println(lista);
    }
}

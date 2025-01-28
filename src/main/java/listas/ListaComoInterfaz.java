package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaComoInterfaz {

    public static void main(String[] args) {
        //ArrayList<String> arrayList = new ArrayList<>(); <-- mejor como lista
        List<String> arrayList = new ArrayList<>();
        arrayList.add("juan");
        arrayList.add("sara");
        arrayList.add("àngel");
        arrayList.add(0,"lia");
        imprimir(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);
        //NECESITA POLIMORFISMO
        imprimir(linkedList);

    }

//    public static void imprimir(ArrayList<String> lista){
//        for(String nombre:lista) {
//            System.out.print(nombre + " -> ");
//        }
//        System.out.println();
//    }

    public static void imprimir(List<String> lista){
        for(String nombre:lista) {
            System.out.print(nombre + " -> ");
        }
        System.out.println();
    }


}

package tad;

public class MainT {
    public static void main(String[] args) {
        Lista<String> listaCadena = new Lista<>();
        Lista<Integer> listaEnteros = new Lista<>();

        listaCadena.addCola("xabi");
        listaCadena.addCabeza("fran");
        listaCadena.addCabeza("angel");
        listaCadena.addCola("leo");

        System.out.println(listaCadena);

        listaEnteros.addCabeza(1);
        listaEnteros.addCabeza(11);
        System.out.println(listaEnteros);
        listaEnteros.remove(0);
        System.out.println(listaEnteros);

    }
}

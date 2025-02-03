package mapas;

import java.time.LocalDate;
import java.util.*;

public class TestMapas {
    public static void main(String[] args) {
        Map<Integer, String> alumnos=new HashMap<>();
        alumnos.put(123,"lia paul");
        alumnos.put(999,"jesus madariaga");
        alumnos.put(321,"marcos del pueblo");
        System.out.println("Tamaño: " + alumnos.size());
        System.out.println(" Vacío? " + alumnos.isEmpty());

        alumnos.remove(123);
        if(!alumnos.containsKey(123))
            alumnos.put(123,"alex acosta");

        if(!alumnos.containsValue("lia paul"))
            alumnos.put(777,"lia paul");

        System.out.println(alumnos);

        //sólo me devuelve las claves
        Set<Integer> claves = alumnos.keySet();
        System.out.println(claves);

        //sólo los valores
        Collection<String> valores = alumnos.values();
        System.out.println(valores);
        List<String> valoresLista = new ArrayList<>(valores);

        Map<Integer,String> ordenadoPorInsercion = new LinkedHashMap<>(alumnos);
        Map<Integer,String> ordenadorOrdenNatural = new TreeMap<>(alumnos);
        ordenadorOrdenNatural.put(852,"ivan teglas");

        System.out.println(ordenadoPorInsercion);
        System.out.println(ordenadorOrdenNatural);

        //RECORRER UN MAPA
        //con un foreach
        for(Integer nia:ordenadoPorInsercion.keySet()){
            System.out.println("NIA: " + nia + " nombre: "
                    + ordenadoPorInsercion.get(nia));
        }

        //foreach con Map.Entry
        for(Map.Entry<Integer,String> alumno:ordenadoPorInsercion.entrySet()){
            System.out.println("NIA: " + alumno.getKey() + " nombre: " +
                    alumno.getValue());
        }

        //mostrar las claves del mapa ordenadorOrdenNatural
        System.out.println("Sólo las claves");
        for(Integer nia:ordenadorOrdenNatural.keySet())
            System.out.print(" --> " + nia);
        System.out.println();

        //mostrar los valores del mapa ordenadorOrdenNatural
        System.out.println("Sólo los valores");
        for(String nombre:ordenadorOrdenNatural.values())
            System.out.print(" --> " + nombre);
        System.out.println();

        //imprimirlo con un iterador <-- ayuda: el iterador sólo funciona con Collection
        System.out.println("Con un iterador");
        Iterator<Integer> iterator = ordenadorOrdenNatural.keySet().iterator();
        while(iterator.hasNext()){
            Integer nia = iterator.next();
            System.out.println("NIA: " + nia + " nombre: "
                    + ordenadorOrdenNatural.get(nia));
        }
        System.out.println();

    }
}

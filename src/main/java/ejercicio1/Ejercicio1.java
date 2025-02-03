package ejercicio1;

import java.time.LocalDate;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        Pais espanya = new Pais("España",47);
        Pais mexico = new Pais("Mexico",132);
        Pais bolivia = new Pais("Bolivia",11);
        Pais peru = new Pais("Perú",37);
        Pais venezuela = new Pais("Venezuela",26);

        Empleado eric = new Empleado("99X","eric jara", LocalDate.of(1971,2,3));
        Empleado angel = new Empleado("98Y","angel pascual", LocalDate.of(1987,3,13));
        Empleado pau = new Empleado("97Q","pau navarro", LocalDate.of(1968,4,23));
        Empleado andrii = new Empleado("96A","andrii litvinov", LocalDate.of(2001,5,4));
        Empleado juan = new Empleado("95B","juan tello", LocalDate.of(1977,6,14));
        Empleado toni = new Empleado("94C","toni novejarque", LocalDate.of(1982,7,14));
        Empleado ivan = new Empleado("93S","ivan lopez", LocalDate.of(1992,8,24));
        Empleado leo = new Empleado("92X","leo marin", LocalDate.of(2002,8,24));
        Empleado fran = new Empleado("91V","fran arranz", LocalDate.of(2002,8,24));
        Empleado francisco = new Empleado("90O","fran arranz", LocalDate.of(1992,12,12));

        Map<Empleado,Pais> empleados = new HashMap<>();
        empleados.put(eric,venezuela);
        empleados.put(angel,peru);
        empleados.put(pau,peru);
        empleados.put(andrii,mexico);
        empleados.put(juan,espanya);
        empleados.put(toni,venezuela);
        empleados.put(ivan,venezuela);
        empleados.put(leo,espanya);
        empleados.put(fran,venezuela);
        empleados.put(francisco,peru);

        //Obtener un informe con los países de los trabajadores de la empresa
        for(Pais pais: empleados.values()){
            System.out.print(" --> " + pais);
        }
        System.out.println();

        //Lo mismo pero sin duplicados
        Set<Pais> paises = new HashSet<>(empleados.values());
        for(Pais pais: paises){
            System.out.print(" --> " + pais);
        }
        System.out.println();

        //Listado de solo los trabajadores ordenados por su orden natural (DNI).
        // TreeSet
        Set<Empleado> empleadoSet = new TreeSet<>(empleados.keySet());
        for(Empleado empleado:empleadoSet){
            System.out.print(" --> " + empleado);
        }
        System.out.println();


        //Listado de solo los trabajadores ordenados por su orden natural (DNI).
        // ArrayList
        List<Empleado> empleadoList = new ArrayList<>(empleados.keySet());
        //empleadoList.sort(Empleado::compareTo); <-- es correcto usando lambdas
        Collections.sort(empleadoList);
        for(Empleado empleado:empleadoList){
            System.out.print(" --> " + empleado);
        }
        System.out.println();

        //Países por orden alfabético

        //Trabajadores por edad

        //Informe con los países por orden alfabético y sus trabajadores por edad (único informe)

        //Recorrer todos los trabajadores y mostrar solo aquellos con edad superior a 50 años
        // utilizando un iterador. <-- Period.between(empleado.getFechaNac(),LocalDate.now()).getYears();

    }
}

package model;

import java.time.LocalDate;
import java.util.Comparator;

public class Persona implements Comparable<Persona>{
    public static final Comparator<Persona> SORT_BY_AGE =
            new Comparator<Persona>(){
        @Override
        public int compare(Persona persona1, Persona persona2) {
            return persona1.fechaNac.compareTo(persona2.fechaNac);
        }
    };
    //con lambdas
//    public static final Comparator<Persona> SORT_BY_AGE1 =
//            (Persona o1, Persona o2) -> o1.fechaNac.compareTo(o2.fechaNac);
//    public static final Comparator<Persona> SORT_BY_AGE2 =
//            Comparator.comparing((Persona o) -> o.fechaNac);

    private String nombre;
    private String apellido;
    private LocalDate fechaNac;

    public Persona(String nombre, String apellido, LocalDate fechaNac){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNac=fechaNac;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString(){
        return "Nombre completo: "+nombre+" "+apellido
                + " y fecha de nacimiento: "+fechaNac;
    }

    @Override
    public boolean equals(Object object){
        if(object==null||!(object instanceof Persona))
            return  false;

        Persona persona = (Persona)object;
        return persona.getNombre().equals(nombre)
                && persona.getApellido().equals(apellido);
    }

    //NECESARIO para usar HashMaps, HashSet
    @Override
    public int hashCode(){
        return (apellido.hashCode()+nombre.hashCode());
    }

    @Override
    public int compareTo(Persona persona){
        if (this.getApellido().equals(persona.getApellido())){
            return this.getNombre().compareTo(persona.getNombre());
        }
        return apellido.compareTo(persona.getApellido());
    }

}

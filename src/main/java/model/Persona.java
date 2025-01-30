package model;

import java.time.LocalDate;

public class Persona implements Comparable<Persona>{
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

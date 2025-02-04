package ejercicio1;

import java.util.Comparator;

public class Pais implements Comparable<Pais>{
    public static final Comparator<Pais> BY_POP = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o2.getPoblacion()-o1.getPoblacion();
        }
    };

    private String nombre;
    private int poblacion;

    public Pais(String nombre, int poblacion){
        this.nombre=nombre;
        this.poblacion=poblacion;
    }

    public String getNombre(){return nombre;}
    public int getPoblacion() {
        return poblacion;
    }

    @Override
    public String toString(){
        return nombre;
    }

    @Override
    public int compareTo(Pais pais){
        return nombre.compareTo(pais.getNombre());
    }

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Pais))
            return false;
        Pais pais=(Pais) object;
        return this.nombre.equals(pais.getNombre());
    }

    @Override
    public int hashCode(){ return nombre.hashCode();}

}

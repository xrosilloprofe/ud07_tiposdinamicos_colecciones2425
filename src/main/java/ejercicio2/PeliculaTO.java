package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class PeliculaTO {

    private String titulo;
    private List<String> actores;
    private List<String> directores;
    private int id;
    private static int index=0;

    public PeliculaTO() {
        actores = new ArrayList<>();
        directores = new ArrayList<>();
        id=index++;
    }

    public int getId(){ return id;}

    public List<String> getActores() {
        return actores;
    }

    public void addActor(String actor) {
        actores.add(actor);
    }

    @Override
    public boolean equals(Object object){
        if(object==null || !(object instanceof PeliculaTO))
            return false;
        PeliculaTO pelicula = (PeliculaTO) object;
        return pelicula.getId()==id;
    }

    @Override
    public String toString(){
        return Integer.toString(id);
    }


}
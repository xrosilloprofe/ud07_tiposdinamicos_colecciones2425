package ejercicio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PeliculaTO pelicula = new PeliculaTO();
        PeliculaTO pelicula2 = new PeliculaTO();
        PeliculaTO pelicula3 = new PeliculaTO();
        PeliculaTO pelicula4 = new PeliculaTO();

        MemoryPeliculaDAO listaPelis = new MemoryPeliculaDAO();
        listaPelis.addPelicula(pelicula4);
        listaPelis.addAllPeliculas(List.of(pelicula2,pelicula));
        listaPelis.addPelicula(pelicula3);
        listaPelis.addPelicula(pelicula3);
        listaPelis.addPelicula(pelicula3);

        System.out.println(listaPelis);

        listaPelis.removePelicula(5);
        listaPelis.removePelicula(0);
        System.out.println(listaPelis);

    }
}

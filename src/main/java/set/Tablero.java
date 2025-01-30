package set;

import java.util.TreeSet;

public class Tablero {
    private TreeSet<Bola> tablero;

    public Tablero(){
        tablero = new TreeSet<>();
    }

    public void anyadirBola(Bola bola){
        tablero.add(bola);
    }

    @Override
    public String toString(){
        return tablero.toString();
    }

}

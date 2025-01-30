package set;

public class Juego {
    public static void main(String[] args) {
        Bombo bombo = new Bombo();
        Tablero tablero = new Tablero();

        bombo.inicializar(30,"rojo");

        for (int i = 0; i < 10; i++) {
            Bola bola = bombo.cogerBola();
            tablero.anyadirBola(bola);
        }

        System.out.println(bombo);
        System.out.println(tablero);
    }
}

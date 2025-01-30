package set;

public class Bola implements Comparable<Bola> {
    private int numero;
    private String color;

    public Bola(int numero, String color){
        this.color=color;
        this.numero=numero;
    }

    public int getNumero(){return numero;}
    public String getColor(){return color;}

    @Override
    public String toString(){ return Integer.toString(numero);}

    @Override
    public int compareTo(Bola o) {
        return numero - o.getNumero();
    }

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Bola))
            return false;
        Bola bola = (Bola) object;
        return color.equals(bola.getColor())
                && numero== bola.getNumero();
    }

    @Override
    public int hashCode(){ return numero;}



}

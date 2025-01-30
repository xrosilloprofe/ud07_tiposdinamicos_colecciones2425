package set;

import java.util.*;

public class Bombo {
    private Set<Bola> bombo;

    public Bombo(){
        bombo=new LinkedHashSet<>();
    }

    public void inicializar(int maximasBolas, String colorBolas){
        for (int i = 1; i <= maximasBolas; i++) {
            bombo.add(new Bola(i,colorBolas));
        }
    }

    private void girar(){
        List<Bola> listaAuxiliar = new ArrayList<>(bombo);
        Collections.shuffle(listaAuxiliar);
        bombo.clear();
        bombo.addAll(listaAuxiliar);
    }

    private Bola cogerBolaLista(){
        girar();
        List<Bola> listaBola = new ArrayList<>(bombo);
        Bola sacada = listaBola.remove(0);
        bombo.remove(sacada);
        return sacada;
    }

    public Bola cogerBola(){
        Bola bola=null;
        girar();
        Iterator<Bola> iterador = bombo.iterator();
        //quitamos el elemento en la posición 0
        if(iterador.hasNext()){
            bola = iterador.next();
            iterador.remove();
        }
        return bola;
    }

    @Override
    public String toString(){
        return bombo.toString();
    }

}

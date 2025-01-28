package tad;

import java.lang.reflect.Array;

public class Lista<T> {
    Nodo<T> cabeza, cola;
    private int tamanyo;

    public Lista(){
        cabeza=null;
        cola=null;
        tamanyo=0;
    }
    public int size(){
        return tamanyo;
    }
    public boolean isEmpty(){
        return tamanyo==0;
    }
    public void addCabeza(T elemento){
        Nodo<T> nodo = new Nodo<>(elemento);
        if (isEmpty()){
            cola=nodo;
        } else {
            nodo.setSiguiente(cabeza);
        }
        cabeza=nodo;
        tamanyo++;
    }
    public void addCola(T elemento){
        Nodo<T> nodo = new Nodo<>(elemento);
        if (isEmpty()){
            cabeza=nodo;
        } else {
            cola.setSiguiente(nodo);
        }
        cola=nodo;
        tamanyo++;
    }
    public T get(int index){
        if(index<0||index>=tamanyo)
            return null;
        Nodo<T> aux = cabeza;
        for (int i = 0; i < index; i++) {
            aux=aux.getSiguiente();
        }
        return aux.getElemento();
    }
    public int search(T elemento){
        Nodo<T> aux = cabeza;
        for (int i = 0; i < tamanyo; i++) {
            if (elemento == aux.getElemento()){
                return i;
            }
            aux=aux.getSiguiente();
        }
        return -1;
    }
    public boolean contains(T elemento){
        Nodo<T> nodo=cabeza;
        for (int i = 0; i < tamanyo; i++) {
            if (nodo.getElemento().equals(elemento)){
                return true;
            }
            nodo=nodo.getSiguiente();
        }
        return false;
    }
    public T[] toArray(Class clazz){
        T[] array = (T[]) Array.newInstance(clazz,tamanyo);
        Nodo<T> nodo = cabeza;
        for (int i = 0; i <tamanyo ; i++) {
            array[i] = nodo.getElemento();
            nodo = nodo.getSiguiente();
        }
        return array;
    }
    public void clear(){
        cabeza=null;
        cola=null;
        tamanyo=0;
    }
    public void addAll(Lista<T> lista){
        for (int t = 0; t < lista.size(); t++) {
            this.addCola(lista.get(t));
        }
    }
    public T remove(int index){
        Nodo<T> nodo=cabeza;
        T elemento=null;
        if(get(index)==null)
            return elemento;

        if(index==0){
            elemento= nodo.getElemento();
            cabeza = nodo.getSiguiente();
        } else {
            for (int i = 0; i < index-1; i++) {
                nodo = nodo.getSiguiente();
            }
            elemento = nodo.getSiguiente().getElemento();
            nodo.setSiguiente(nodo.getSiguiente().getSiguiente());
            if(index == tamanyo-1)
                cola = nodo;
        }
        tamanyo--;
        return elemento;
    }

    @Override
    public String toString(){
        Nodo<T> nodo = cabeza;
        String resultado = "";
        for (int i = 0; i < tamanyo; i++) {
            resultado += nodo + " -> ";
            nodo = nodo.getSiguiente();
        }
        if(resultado.length()>0){
            resultado = resultado.substring(0,resultado.length()-3);
        }
        return resultado;
    }

    private class Nodo<T>{
        private T elemento;
        private Nodo siguiente;

        public Nodo(T elemento){
            this.elemento = elemento;
        }

        public T getElemento() {
            return elemento;
        }
        public Nodo<T> getSiguiente() {
            return siguiente;
        }
        public void setSiguiente(Nodo<T> siguiente) { this.siguiente = siguiente; }

        @Override
        public String toString(){
            return elemento.toString();
        }
    }

}

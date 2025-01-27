public class ListaEnteros {

    private Nodo cabeza, cola;
    private int tamanyo;

    public ListaEnteros(){
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

    public void addCabeza(int elemento){
        Nodo nodo =new Nodo(elemento);
        if (isEmpty()){
            cola=nodo;
        } else {
            nodo.setSiguiente(cabeza);
        }
        cabeza=nodo;
        tamanyo++;
    }
    public void addCola(int elemento){
        Nodo nodo = new Nodo(elemento);
        if (isEmpty()){
            cabeza=nodo;
        } else {
            cola.setSiguiente(nodo);
        }
        cola=nodo;
        tamanyo++;
    }
    public Integer get(int index){
        if(index<0||index>=tamanyo)
            return null;
        Nodo aux = cabeza;
        for (int i = 0; i < index; i++) {
            aux=aux.getSiguiente();
        }
        return aux.getElemento();
    }
    public int search(int elemento){
        Nodo aux = cabeza;
        for (int i = 0; i < tamanyo; i++) {
            if (elemento == aux.getElemento()){
                return i;
            }
            aux=aux.getSiguiente();
        }
        return -1;
    }
    public boolean contains(int elemento){
        Nodo nodo=cabeza;
        for (int i = 0; i < tamanyo; i++) {
            if (nodo.getElemento()==elemento){
                return true;
            }
            nodo=nodo.getSiguiente();
        }
        return false;
    }
    public int[] toArray(){
        int[] array = new int[tamanyo];
        Nodo nodo = cabeza;
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
    public void addAll(ListaEnteros lista){
        for (int t = 0; t < lista.size(); t++) {
            this.addCola(lista.get(t));
        }
    }
    public Integer remove(int index){
        Nodo nodo=cabeza;
        Integer elemento=null;
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
        Nodo nodo = cabeza;
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

    private class Nodo{
        private int elemento;
        private Nodo siguiente;

        public Nodo(int elemento){
            this.elemento = elemento;
        }

        public int getElemento() {
            return elemento;
        }
        public Nodo getSiguiente() {
            return siguiente;
        }
        public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }

        @Override
        public String toString(){
            return Integer.toString(elemento);
        }

    }

}

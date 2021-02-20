package listas;

/**
 * Created by alan on 30/09/16.
 */
public class ListaSimpleCircular {

    private NodoDoble raiz;
    public int tamaño;

    public ListaSimpleCircular() {
        raiz = null;
    }

    public boolean estaVacio(){
        return this.raiz == null;
    }

    public void agregar(String valor){
        NodoDoble nuevo = new NodoDoble(valor);

        if (estaVacio()){
            this.raiz = nuevo;
        } else {
            NodoDoble aux = this.raiz;
            while (aux.siguiente != this.raiz.anterior){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }

        this.tamaño++;
    }

    public void eliminarUltimoElemento(){
        if (estaVacio()){
            System.out.println("Lista vacia");
        } else {
            NodoDoble aux = this.raiz;
            NodoDoble nodoAnterior = aux;
            while (aux.siguiente != this.raiz.anterior){
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            if (aux == this.raiz){
                this.raiz = null;
            } else {
                nodoAnterior.siguiente = this.raiz.anterior;
            }

            this.tamaño--;
        }
    }

    public void imprimir() {
        if (estaVacio()) {
            System.out.println("Lista vacia");
        } else {
            NodoDoble aux = this.raiz;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    public void devolverValor(int pos){
        if (estaVacio()){
            System.out.println("La lista esta vacia");
        } else {
            NodoDoble aux = this.raiz;
            for (int i = 0; i < this.tamaño; i++){
                if (i == pos){
                    System.out.println(aux.valor);
                }
                aux = aux.siguiente;
            }
        }
    }

    public void eliminarElemento(int pos){
        if (estaVacio()){
            System.out.println("La lista esta vacia");
        } else {
            NodoDoble aux = this.raiz;
            for (int i = 0; i < pos; i++){
                if (i == pos){
                    aux.siguiente = null;
                }
            }
            tamaño--;
        }
    }
}

package listas;

/**
 * Created by alan on 30/09/16.
 */
public class ListaDobleCircular {

    private NodoDoble primero;
    private NodoDoble ultimo;
    private int tamaño = 0;

    public ListaDobleCircular() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean estaVacio(){
        return this.primero == null;
    }

    public void agregar(String valor){
        NodoDoble nuevo = new NodoDoble(valor);

        if (estaVacio()){
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            NodoDoble aux = primero;
            while (aux.siguiente != primero.anterior){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            nuevo.anterior = aux;
            this.ultimo = nuevo;
            this.ultimo.siguiente = this.primero.anterior;
        }

        this.tamaño++;
    }

    public void eliminarUltimo(){
        if (estaVacio()){
            System.out.println("Lista vacia");
        } else {
            NodoDoble aux = primero;
            NodoDoble nodoAnterior = aux;
            while (aux.siguiente != primero.anterior){
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            if (aux == this.primero){
                this.primero = null;
                this.ultimo = null;
            } else {
                ultimo = nodoAnterior;
                nodoAnterior.siguiente = null;
                aux.anterior = null;
            }
            tamaño--;
        }
    }

    public void imprimir() {
        if (estaVacio()) {
            System.out.println("Lista vacia");
        } else {

            NodoDoble aux = primero;

            for(int i=0;i<this.tamaño;i++){
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    public void imprimirInverso() {
        if (estaVacio()) {
            System.out.println("Lista vacia");
        } else {

            NodoDoble aux = ultimo;

            for(int i=0;i<this.tamaño;i++){
                System.out.println(aux.valor);
                aux = aux.anterior;
            }
        }
    }

    public void devolverValor(int pos){
        if (estaVacio()){
            System.out.println("La lista esta vacia");
        } else {
            NodoDoble aux = this.primero;
            for (int i = 0; i < this.tamaño; i++){
                if (i == pos){
                    System.out.println(aux.valor);
                }
                aux = aux.siguiente;
            }
        }
    }

    public void devolverValorInverso(int pos){
        if (estaVacio()){
            System.out.println("La lista esta vacia");
        } else {
            NodoDoble aux = this.ultimo;
            for (int i = 0; i < this.tamaño; i++){
                if (i == pos){
                    System.out.println(aux.valor);
                }
                aux = aux.anterior;
            }
        }
    }
}

package listas;

/**
 * Created by alan on 30/09/16.
 */
public class Nodo {

    public String valor;
    public Nodo anterior;
    public Nodo siguiente;

    public Nodo(String valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }
}
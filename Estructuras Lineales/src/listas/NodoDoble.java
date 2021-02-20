package listas;

/**
 * Created by alan on 30/09/16.
 */
public class NodoDoble {
    public String valor;
    public NodoDoble anterior;
    public NodoDoble siguiente;

    public NodoDoble(String valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }
}

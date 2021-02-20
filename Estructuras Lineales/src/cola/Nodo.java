package cola;

/**
 * Created by alan on 05/11/16.
 */
public class Nodo {

    public int valor;
    public Nodo siguiente;

    public Nodo(int valor){
        this.valor = valor;
        this.siguiente = null;
    }

    @Override
    public String toString(){
        return String.valueOf(this.valor);
    }
}

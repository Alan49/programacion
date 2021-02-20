package cola;

/**
 * Created by alan on 29/09/16.
 */
public class Cola {

    public Nodo raiz;

    public Cola(){
        raiz = null;
    }

    public void encolar(int valor){
        if (raiz == null){
            raiz = new Nodo(valor);
        } else {
            Nodo aux = raiz;

            while (aux.siguiente != null){
                aux = aux.siguiente;
            }

            aux.siguiente = new Nodo(valor);
        }
    }

    public void desencolar(){
        this.raiz = raiz.siguiente;
    }

    public void imprimir(){
        Nodo aux = raiz;
        while (aux != null){
            System.out.println(aux.valor);
            aux = aux.siguiente;
        }
    }
}

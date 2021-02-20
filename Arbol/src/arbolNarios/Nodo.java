package arbolNarios;
import java.util.ArrayList;
/**
 * Created by alan on 08/11/16.
 */
public class Nodo {

    private String valor;
    private ArrayList<Nodo> nodos = new ArrayList<>();

    public Nodo(String valor){
        this.valor = valor;
    }

    public void addHijo(Nodo nuevo){
        nodos.add(nuevo);
    }

    public int getCantHijos(){
        return nodos.size();
    }

    @Override
    public String toString(){
        return this.valor;
    }
}

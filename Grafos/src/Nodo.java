import java.util.ArrayList;

/**
 * Created by alan on 08/11/16.
 */
public class Nodo {

    private String valor;
    private ArrayList<Arista> aristas = new ArrayList<>();

    public Nodo(String valor){
        this.valor = valor;
    }

    public void conectarAOtroNodo(Nodo otroNodo, int longitud){
        aristas.add(new Arista(longitud, this, otroNodo));
    }

    public Nodo getConexion(int pos){
        return aristas.get(pos).getHasta();
    }

    public void paresAdyacencia(){
        for (int i = 0; i < aristas.size(); i++){
            System.out.print("(" + aristas.get(i).getDesde() + ", " + aristas.get(i).getHasta() + ")");
        }
    }

    public int cantAristas(){
        return aristas.size();
    }

    @Override
    public String toString() {
        return this.valor;
    }
}

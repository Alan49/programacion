/**
 * Created by alan on 08/11/16.
 */
public class Arista {

    private int longitud;
    private Nodo desde;
    private Nodo hasta;

    public Arista(int longitud, Nodo desde, Nodo hasta){
        this.longitud = longitud;
        this.desde = desde;
        this.hasta = hasta;
    }

    public Nodo getDesde(){
        return desde;
    }

    public Nodo getHasta(){
        return hasta;
    }

    @Override
    public String toString() {
        return "(" + this.desde.toString() + ")---" + this.longitud + "---(" + this.hasta.toString() + ")";
    }
}

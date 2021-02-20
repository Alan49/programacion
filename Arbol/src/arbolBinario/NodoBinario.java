package arbolBinario;

/**
 * Created by alan on 08/11/16.
 */
public class NodoBinario {

    private String valor;
    private NodoBinario izq;
    private NodoBinario der;

    public NodoBinario siguiente;

    public NodoBinario(String valor){
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }

    public void setIzq(NodoBinario izq) {
        this.izq = izq;
    }

    public NodoBinario getIzq(){
        return this.izq;
    }

    public void setDer(NodoBinario der) {
        this.der = der;
    }

    public NodoBinario getDer(){
        return this.der;
    }

    @Override
    public String toString(){
        return this.valor;
    }
}

package arbolBinario;

/**
 * Created by alan on 08/11/16.
 */
public class Main {

    public static void main(String ... args){

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
    }

    public static void ejercicio1(){

        NodoBinario n1 = new NodoBinario("4");
        NodoBinario n2 = new NodoBinario("2");
        NodoBinario n3 = new NodoBinario("5");

        n1.setIzq(n2);
        n1.setDer(n3);

        NodoBinario n4 = new NodoBinario("1");
        NodoBinario n5 = new NodoBinario("3");

        n2.setIzq(n4);
        n2.setDer(n5);

        NodoBinario n6 = new NodoBinario("6");

        n3.setDer(n6);

        ///////////////////////
        preOrden(n1);
        System.out.println("*******");
        inOrden(n1);
        System.out.println("*******");
        postOrden(n1);
    }

    public static void ejercicio2(){

        NodoBinario n1 = new NodoBinario("4");
        NodoBinario n2 = new NodoBinario("2");
        NodoBinario n3 = new NodoBinario("5");

        n1.setIzq(n2);
        n1.setDer(n3);

        NodoBinario n4 = new NodoBinario("1");
        NodoBinario n5 = new NodoBinario("3");

        n2.setIzq(n4);
        n2.setDer(n5);

        NodoBinario n6 = new NodoBinario("6");

        n3.setDer(n6);

        anchura(n1);
    }

    public static void ejercicio3(){

        NodoBinario nA = new NodoBinario("+");
        NodoBinario nB = new NodoBinario("*");
        NodoBinario nC = new NodoBinario("-");

        nA.setIzq(nB);
        nA.setDer(nC);

        NodoBinario nD = new NodoBinario("1");
        NodoBinario nE = new NodoBinario("3");

        nB.setIzq(nD);
        nB.setDer(nE);

        NodoBinario nF = new NodoBinario("1");
        NodoBinario nG = new NodoBinario("6");

        nC.setIzq(nF);
        nC.setDer(nG);

        preOrden(nA);
    }

    /**
     * Metodos de busqueda
     */
    public static void preOrden(NodoBinario nodoRaiz){
        if (nodoRaiz == null)
            return;
        System.out.println(nodoRaiz.toString());
        preOrden(nodoRaiz.getIzq());
        preOrden(nodoRaiz.getDer());
    }

    public static void inOrden(NodoBinario nodoRaiz){
        if (nodoRaiz == null)
            return;
        inOrden(nodoRaiz.getIzq());
        System.out.println(nodoRaiz.toString());
        inOrden(nodoRaiz.getDer());
    }

    public static void postOrden(NodoBinario nodoRaiz){
        if (nodoRaiz == null)
            return;
        postOrden(nodoRaiz.getIzq());
        postOrden(nodoRaiz.getDer());
        System.out.println(nodoRaiz.toString());
    }

    public static void anchura(NodoBinario nodoRaiz){
        class Cola {

            private NodoBinario raiz;

            public Cola(){
                this.raiz = null;
            }

            public boolean vacio(){
                if (this.raiz == null)
                    return true;
                return false;
            }

            public void agregar(NodoBinario nodoNuevo){
                if (this.raiz == null){
                    raiz = nodoNuevo;
                } else {
                    NodoBinario aux = raiz;

                    while (aux.siguiente != null){
                        aux = aux.siguiente;
                    }

                    aux.siguiente = nodoNuevo;
                }
            }

            public NodoBinario desencolar(){
                return this.raiz = raiz.siguiente;
            }
        }

        Cola cola = new Cola();
        cola.agregar(nodoRaiz);

        NodoBinario aux = nodoRaiz;

        while (!cola.vacio()){

            System.out.println(aux.toString());
            if (aux.getIzq() != null){
                cola.agregar(aux.getIzq());
            }

            if (aux.getDer() != null){
                cola.agregar(aux.getDer());
            }

            aux = cola.desencolar();
        }
    }
}

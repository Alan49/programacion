package cola;

/**
 * Created by alan on 05/11/16.
 */
public class Main {

    public static void main(String ... args){

        Cola cola = new Cola();
        cola.encolar(1);
        cola.encolar(5);
        cola.encolar(6);
        cola.encolar(2);
        cola.encolar(76);
        cola.encolar(12);


        cola.imprimir();

        System.out.println("*********************");

        cola.desencolar();
        cola.desencolar();
        cola.desencolar();
        cola.imprimir();
    }
}

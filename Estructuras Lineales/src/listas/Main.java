package listas;

/**
 * Created by alan on 30/09/16.
 */
public class Main {

    public static void main(String[] args){
        listaSimpleCircular();
        //listasDobleCircular();
    }

    public static void listaSimpleCircular(){
        ListaSimpleCircular listaSimple = new ListaSimpleCircular();
        listaSimple.agregar("uno");
        listaSimple.agregar("dos");
        listaSimple.agregar("tres");
        listaSimple.agregar("cuatro");
        listaSimple.agregar("cinco");
        listaSimple.agregar("seis");

        listaSimple.imprimir();
        System.out.println("-------------");
        listaSimple.eliminarUltimoElemento();
        listaSimple.imprimir();
        System.out.println("-------------");
        System.out.print("Elemento de la posicion 2: "); listaSimple.devolverValor(2);
        System.out.println("-------------");
        listaSimple.eliminarElemento(2);
        listaSimple.imprimir();

    }
}

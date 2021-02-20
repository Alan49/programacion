/**
 * Created by alan on 08/11/16.
 */
public class Main {

    public static void main(String ... args){

        /**
         * Creamos una arreglo de nodos y le asignamos un objeto de la clase nodo
         * con sus letras correspondientes
         */
        Nodo[] nodos = new Nodo[10];

        nodos[0] = new Nodo("A");
        nodos[1] = new Nodo("B");
        nodos[2] = new Nodo("C");
        nodos[3] = new Nodo("D");
        nodos[4] = new Nodo("E");
        nodos[5] = new Nodo("F");
        nodos[6] = new Nodo("G");
        nodos[7] = new Nodo("H");
        nodos[8] = new Nodo("I");
        nodos[9] = new Nodo("J");

        /**
         * CONECTAMOS NODOS CON OTROS NODOS PARA CREAR EL GRAFO
         */
        //A
        nodos[0].conectarAOtroNodo(nodos[1], 2); //A con B
        nodos[0].conectarAOtroNodo(nodos[2], 4); //A con C
        nodos[0].conectarAOtroNodo(nodos[3], 3); //A con D

        //B
        nodos[1].conectarAOtroNodo(nodos[4], 7); //B con E
        nodos[1].conectarAOtroNodo(nodos[5], 4); //B con F
        nodos[1].conectarAOtroNodo(nodos[6], 6); //B con G

        //C
        nodos[2].conectarAOtroNodo(nodos[4], 3); //C con E
        nodos[2].conectarAOtroNodo(nodos[5], 2); //C con F
        nodos[2].conectarAOtroNodo(nodos[6], 4); //C con G

        //D
        nodos[3].conectarAOtroNodo(nodos[4], 4); //D con E
        nodos[3].conectarAOtroNodo(nodos[5], 1); //D con F
        nodos[3].conectarAOtroNodo(nodos[6], 5); //D con G

        //E
        nodos[4].conectarAOtroNodo(nodos[7], 1); //E con H
        nodos[4].conectarAOtroNodo(nodos[8], 4); //E con I

        //F
        nodos[5].conectarAOtroNodo(nodos[7], 6); //F con H
        nodos[5].conectarAOtroNodo(nodos[8], 3); //F con I

        //G
        nodos[6].conectarAOtroNodo(nodos[7], 3); //G con H
        nodos[6].conectarAOtroNodo(nodos[8], 3); //G con I

        //H
        nodos[7].conectarAOtroNodo(nodos[9], 3); //H con J

        //I
        nodos[8].conectarAOtroNodo(nodos[9], 4); //I con J

        /**
         * Imprimimos los pares de adyacencia
         */
        paresAdyacencia(nodos);

        System.out.println("");
        System.out.println("***************************");
        System.out.println("");

        matrizAdyacencia(nodos);
    }

    public static void paresAdyacencia(Nodo[] nodos){
        /**
         * Este metodo pide un arreglo de nodos para poder imprimir uno por uno su lista de adyacencia
         */
        for (int i = 0; i < nodos.length; i++){
            nodos[i].paresAdyacencia();
        }
    }

    public static void matrizAdyacencia(Nodo[] nodos){
        int a = nodos.length;
        int[][] nodosAux = new int[a][a];

        int cantAristas = 0;
        String[] letras;

        for (int i = 0; i < a; i++){
            cantAristas = nodos[i].cantAristas();
            letras = new String[cantAristas];
            for (int aux = 0; aux < cantAristas; aux++){
                letras[aux] = nodos[i].getConexion(aux).toString();
            }

            for (int k = 0; k < cantAristas; k++){
                for (int j = 0; j < a; j++){
                    if (nodos[j].toString().equals(letras[k])){
                        nodosAux[i][j] = 1;
                    }
                }
            }
        }

///////    ---- Iteradores para imprimir nuestra matriz ----    ////////
        System.out.print("   ");
        for (int i = 0; i < a; i++){
            System.out.print(nodos[i].toString() + " ");
        }

        System.out.println("");

        for (int i = 0; i < a; i++){
            System.out.print(nodos[i].toString() + ". ");
            for (int j = 0; j < a; j++){
                System.out.print(nodosAux[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void bfs(Nodo nodoRaiz){ //Anchura

    }
}

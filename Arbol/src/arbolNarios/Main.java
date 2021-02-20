package arbolNarios;

/**
 * Created by alan on 08/11/16.
 */
public class Main {

    public static void main(String ... args){

        //Creamos nodo raiz
        Nodo nA = new Nodo("A");

        //Creamos hijos del nodo raiz y los asignamos
        Nodo nB = new Nodo("B"); nA.addHijo(nB);
        Nodo nC = new Nodo("C"); nA.addHijo(nC);
        Nodo nD = new Nodo("D"); nA.addHijo(nD);
        Nodo nE = new Nodo("E"); nA.addHijo(nE);
        Nodo nF = new Nodo("F"); nA.addHijo(nF);

        //Creamos los hijos de "B" y los asignamos
        Nodo nG = new Nodo("G"); nB.addHijo(nG);
        Nodo nH = new Nodo("H"); nB.addHijo(nH);
        Nodo nI = new Nodo("I"); nB.addHijo(nI);

        //Creamos los hijos de "F" y los asignamos
        Nodo nJ = new Nodo("J"); nF.addHijo(nJ);
        Nodo nK = new Nodo("K"); nF.addHijo(nK);
        Nodo nL = new Nodo("L"); nF.addHijo(nL);

        //Creamos los hijos de H y los asignamos
        Nodo nM = new Nodo("M"); nH.addHijo(nM);
        Nodo nN = new Nodo("N"); nH.addHijo(nN);
        Nodo nO = new Nodo("O"); nH.addHijo(nO);
        Nodo nP = new Nodo("P"); nH.addHijo(nP);

        //Creamos los hijos de K y los asignamos
        Nodo nQ = new Nodo("Q"); nK.addHijo(nQ);
        Nodo nR = new Nodo("R"); nK.addHijo(nR);

        //Creamos y asignamos el hijo de N
        Nodo nS = new Nodo("S"); nN.addHijo(nS);

        System.out.println("Nodo: " + nA.toString() + " Cantidad de hijos: " + nA.getCantHijos());
        System.out.println("Nodo: " + nB.toString() + " Cantidad de hijos: " + nB.getCantHijos());
        System.out.println("Nodo: " + nC.toString() + " Cantidad de hijos: " + nC.getCantHijos());
        System.out.println("Nodo: " + nD.toString() + " Cantidad de hijos: " + nD.getCantHijos());
        System.out.println("Nodo: " + nE.toString() + " Cantidad de hijos: " + nE.getCantHijos());
        System.out.println("Nodo: " + nF.toString() + " Cantidad de hijos: " + nF.getCantHijos());
        System.out.println("Nodo: " + nG.toString() + " Cantidad de hijos: " + nG.getCantHijos());
        System.out.println("Nodo: " + nH.toString() + " Cantidad de hijos: " + nH.getCantHijos());
        System.out.println("Nodo: " + nI.toString() + " Cantidad de hijos: " + nI.getCantHijos());
        System.out.println("Nodo: " + nJ.toString() + " Cantidad de hijos: " + nJ.getCantHijos());
        System.out.println("Nodo: " + nK.toString() + " Cantidad de hijos: " + nK.getCantHijos());
        System.out.println("Nodo: " + nL.toString() + " Cantidad de hijos: " + nL.getCantHijos());
        System.out.println("Nodo: " + nM.toString() + " Cantidad de hijos: " + nM.getCantHijos());
        System.out.println("Nodo: " + nN.toString() + " Cantidad de hijos: " + nN.getCantHijos());
        System.out.println("Nodo: " + nO.toString() + " Cantidad de hijos: " + nO.getCantHijos());
        System.out.println("Nodo: " + nP.toString() + " Cantidad de hijos: " + nP.getCantHijos());
        System.out.println("Nodo: " + nQ.toString() + " Cantidad de hijos: " + nQ.getCantHijos());
        System.out.println("Nodo: " + nR.toString() + " Cantidad de hijos: " + nR.getCantHijos());
        System.out.println("Nodo: " + nS.toString() + " Cantidad de hijos: " + nS.getCantHijos());
    }
}

import metodos.Metodos;

import java.util.*;
import static metodos.Metodos.*;

/**
 * Created by alan on 28/09/16.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        print("Ingrese un numero del 1 al 3: ");
        int num = scanner.nextInt();

        while (num < 1 || num > 10) {
            print("El numero no esta entre el 1 y 3. Ingrese de nuevo: ");
            num = scanner.nextInt();
        }

        switch (num) {
            case 1:
                println("Sucesion Fibonacci de manera recursiva");
                print(fiboRecursive(30));
                println("LLamadas Recursivas: " + llamadasRecursivas);

                println("Sucesion Fibonacci con Programacion Dinamica: BottomUp");
                print(fiboBottomUp(30));
                println("Llamadas: " + llamadasBottomUp);

                println("Sucesion Fibonacci con Programacion Dinamica: TopDown");
                int[] array = new int[30];
                print(fiboTopBottom(30, array));
                println("Llamadas: " + llamadasTopBottom);
                break;
            case 2: break;
            case 3: break;
        }
    }
}
import static metodos.Metodos.*;
import java.util.Scanner;

/**
 * Created by Alan on 02/09/2016.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        print("Ingrese un numero del 1 al 10: "); int num = scanner.nextInt();

        while (num < 1 || num > 10){
            print("El numero no esta entre el 1 y 10. Ingrese de nuevo: "); num = scanner.nextInt();
        }

        switch (num){
            case 1: //Terminado
                println("Imprimir los numeros del 1 al 10 de manera recursiva");
                imprimirNumeros(1);
                break;
            case 2: //Terminado
                println("Imprimir de manera recursiva la tabla del 9");
                imprimirTabla9(1);
                break;
            case 3: //Terminado
                println("Encontrar de manera recursiva, el numero mayor dentro de un vector");
                print("Ingrese el tamaño del vector: "); int array[] = new int[scanner.nextInt()];
                int mayor = Integer.MIN_VALUE;

                for (int i = 0; i < array.length; i++){
                    print("Ingrese el numero " + i + ": "); array[i] = scanner.nextInt();
                }

                encontrarMayor(array, 0, mayor);
                break;
            case 4: //Terminado
                println("Imprimir la serie Fibonacci hasta un numero ingresado por teclado, de manera recursiva");
                print("Ingrese el numero con el cual desea cortar la serie: "); int finalFibo = scanner.nextInt();

                println(fibonacciRecursive(finalFibo));
                break;
            case 5: //Terminado
                println("Ingresar un numero, e imprimir la cantidad total de orejas de los conejos");
                print("Ingrese un numero: "); int boonies = scanner.nextInt();
                print(booniesEars(boonies));
                break;
            case 6: //Terminado
                println("Lo mismo que el 5 pero en este caso los conejos con una posicion par son de 3 orejas");
                print("Ingrese un numero: "); int boonies2 = scanner.nextInt();
                print(booniesEars2(boonies2));
                break;
            case 7: //Terminado
                println("Ingresar un numero y el programa le dice la cantidad de " + 7 + " que hay en el");
                print("Ingrese un numero: "); int count = scanner.nextInt();
                print(count7(count));
                break;
            case 8: //Terminado
                println("Ingresar un numero y el loco te devuelve el factorial del numero");
                print("Ingrese un numero: "); int factorial = scanner.nextInt();
                print(factorialRecursive(factorial));
                break;
            case 9: //Terminado
                println("Ingresar un numero y el programa de devuelve la suma de sus digitos");
                print("Ingrese un numero; "); int digit = scanner.nextInt();
                print(sumDigits(digit));
                break;
            case 10: //Terminado
                println("Ingrese dos numeros y el programa le devuelve el primer numero elevado por el segundo");
                print("Ingrese dos numeros separados por un espacio: "); int base = scanner.nextInt(), expon = scanner.nextInt();
                print(powerN(base, expon));
                break;
        }
    }
}

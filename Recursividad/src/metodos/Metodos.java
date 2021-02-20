package metodos;

/**
 * Created by Alan on 02/09/2016.
 */
public class Metodos {

    /**
     * Print's & Println's
     */

    public static void print(String mensaje){
        System.out.print(mensaje);
    }

    public static void print(int mensaje){
        System.out.print(mensaje);
    }

    public static void println(String mensaje){
        System.out.println(mensaje);
    }

    public static void println(int mensaje){
        System.out.println(mensaje);
    }

    /**
     * Metodos recursivos
     */
    public static void imprimirNumeros(int num){
        println(num);
        if (num != 10){
            imprimirNumeros(num + 1);
        }
    }

    public static void imprimirTabla9(int num){
        println("9 x " + num + " = " + (num * 9));
        if (num != 10){
            imprimirTabla9(num + 1);
        }
    }

    public static void encontrarMayor(int array[], int pos, int mayor){
        if (pos != array.length){
            if (array[pos] > mayor){
                mayor = array[pos];
            }

            encontrarMayor(array, pos + 1, mayor);
        } else {
            println(mayor);
        }
    }

    public static int fibonacciRecursive(int num){
        println(num + " ");
        if (num == 0){
            return 0;
        } else if (num == 1){
            return 1;
        } else return fibonacciRecursive(num - 2) + fibonacciRecursive(num - 1);
    }
    
    public static int booniesEars(int num){
        if (num == 0){
            return 0;
        } else if (num == 1){
            return 2;
        } else {
            return booniesEars(num - 1) + 2;
        }
    }

    public static int booniesEars2(int num){
        if (num == 0){
            return 0;
        } else if (num % 2 != 0){
            return booniesEars2(num - 1) + 2;
        } else return booniesEars2(num - 1) + 3;
    }

    public static int count7(int num){
        if (num == 0){
            return num;
        } else if (num % 10 == 7){
            return 1 + count7(num / 10);
        } else return count7(num / 10);
    }

    public static int factorialRecursive(int num){
        if (num > 0){
            return num * factorialRecursive(num - 1);
        } else return 1;
    }

    public static int sumDigits(int num){
        int aux = num % 10;
        if (num > 0){
            return aux + sumDigits(num / 10);
        } else return 0;
    }

    public static int powerN(int num1, int num2) {
        if (num2 == 0){
            return 1;
        } else if (num2 > 0){
            return num1 * powerN(num1, num2 -1);
        } else return num1;
    }
}

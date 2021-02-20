package metodos;

/**
 * Created by alan on 28/09/16.
 */
public class Metodos {
    public static int llamadasRecursivas = 0;
    public static int llamadasBottomUp = 0;
    public static int llamadasTopBottom = 0;

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
     * Metodos
     */
    public static int fiboRecursive(int num){
        llamadasRecursivas++;

        if (num == 1 || num == 2){
            return 1;
        } else {
            return fiboRecursive(num - 1) + fiboRecursive(num - 2);
        }
    }

    public static int fiboBottomUp(int num){
        llamadasBottomUp++;
        int[] table = new int[num];
        if (num == 0){
            return 0;
        } else if (num == 1){
            return 1;
        } else {
            table[0] = 1;
            table[1] = 1;
            for (int i = 2; i < num; i++){
                table[i] = table[i - 1] + table[i - 2];
            }

            return table[num - 1];
        }
    }

    public static int fiboTopBottom(int num, int[] table){
        llamadasTopBottom++;
        if (num <= 1){
            return num;
        }

        if (table[num - 1] == -1){
            table[num - 1] = fiboTopBottom(num - 1, table);
        }

        if (table[num - 2] == -1){
            table[num - 2] = fiboTopBottom(num - 2, table);
        }

        table[num] = table[num - 1] + table[num - 2];
        return table[num - 1];
    }
}

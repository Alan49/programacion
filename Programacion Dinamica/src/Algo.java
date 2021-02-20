/**
 * Created by alan on 29/09/16.
 */
public class Algo {

    public static void main(String[] args){

    }

    public static int fiboBottomUp(int n){
        int[] array = new int[n];

        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i < n; i++){
                array[i] = array[i - 1] + array[i - 2];
                System.out.println(array[i]);
            }

            return array[n - 1];
        }
    }
}

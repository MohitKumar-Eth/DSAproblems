package Array;

import java.util.Random;

public class ShuffleTheArray {
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void shuffle(int[] a){
        Random r = new Random();
        for(int i = 0; i < a.length; i++){
            int j = r.nextInt(a.length);
            swap(a, i, j);
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {15,8,10,9,4,1,11};
        shuffle(a);
    }
}

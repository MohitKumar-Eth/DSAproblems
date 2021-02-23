package Array;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationSubarrayLessThan {
    static void multiplicationSubarray(int[] a , int num){
        int multi = 1;
        int start = 0;
        List<List<Integer>> Final = new ArrayList<>();

        for(int i =0; i < a.length; i++){
            multi = multi * a[i];

            while(multi >= num){
                multi = multi/a[start];
                start++;
            }
            List<Integer> list = new ArrayList<>();
            for(int j = i; j >= start; j--){
                list.add(0, a[j]);
                Final.add(new ArrayList<>(list));
            }
        }
        System.out.println(Final);
    }

    public static void main(String[] args) {
        int[] a = {1,3,2,4,9};
        multiplicationSubarray(a, 6);
    }
}

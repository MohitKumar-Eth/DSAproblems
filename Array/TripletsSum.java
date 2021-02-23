package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsSum {
    public static List<List<Integer>> triplets(int[] a, int target) {
        Arrays.sort(a);
//        for(int i =0; i < a.length-1; i++){
//            System.out.print(a[i] +" ");
//        }
//        System.out.println();

        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < a.length-2; i++){
            int sum = target - a[i];

            int start = i + 1;
            int end = a.length-1;
            while(start < end){
                int t = a[start] + a[end];
                if (t == sum){
                    list.add(Arrays.asList(a[start], a[end], a[i]));
                    start++;
                    end--;
                }
                if(t < sum){
                    start++;
                }else end--;
            }
        }


        return list;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,3,5,1,0};
        System.out.println(triplets(a, 6));
    }
}

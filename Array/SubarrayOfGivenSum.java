package Array;

import java.util.HashMap;
import java.util.Map;

public class SubarrayOfGivenSum {

    // Sliding window method.... applicable if only all elements of array are positive
//    static void subArrayPositive(int[] a, int sum){
//        int start = 0;
//        int end = 0;
//        int sumWindow = 0;
//        while(end < a.length){
//            sumWindow = sumWindow + a[end];
//            if (sumWindow == sum){
//                System.out.println("index: " + start + " to " + end);
//                return;
//            }
//
//            while(sumWindow > sum && start<end) {
//                sumWindow = sumWindow - a[start];
//                start++;
//                if (sumWindow == sum){
//                    System.out.println("index: " + start + " to " + end);
//                    return;
//                }
//            }
//            end++;
//        }
//
//    }


    static void subArrayNegative(int[] b, int sum) {
        int sumHere = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, -1);

        for(int i = 0; i < b.length; i++){
            sumHere += b[i];
            if(hmap.containsKey(sumHere - sum)){
                System.out.println("[" + (hmap.get(sumHere- sum)+1) + "-" + i + "]" );
                return;
            }
            hmap.put(sumHere, i);
        }
        System.out.println("not found");

    }

    public static void main(String[] args) {
       // int[] a = {4,2,5,3,1,8};
        int[] b = {3,-1,6,8,9,3,1};
      //  subArrayPositive(a, 12);
        subArrayNegative(b, 2);
    }
}

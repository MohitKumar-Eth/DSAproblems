package Array;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public static boolean twoSum(int[] a, int target){
         Set<Integer> hs = new HashSet<>();
         for(int i = 0; i < a.length; i++){
             if(hs.contains(target - a[i])){
                 return true;
             }
             hs.add(a[i]);
         }
         return false;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 7, 8, 3, 9};
        System.out.println(twoSum(a, 111));
    }
}

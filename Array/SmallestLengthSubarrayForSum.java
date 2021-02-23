package Array;

import java.util.HashMap;
import java.util.Map;

public class SmallestLengthSubarrayForSum {

    static int minLengthSubarray(int[] a, int sum){
        int len = Integer.MAX_VALUE;
        int sumSoFar = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < a.length; i++){
            sumSoFar += a[i];
            if(map.containsKey(sumSoFar-sum) && len > (i - map.get(sumSoFar-sum)) ){
                len = i - map.get(sumSoFar-sum);
            }
            map.put(sumSoFar, i);
        }
        return len;
    }
    public static void main(String[] args){
        int[] a = {3,1,2,1,1,2,1,8,9,11,-1,2,3,2,1,2};
        System.out.println(minLengthSubarray(a, 10));
    }
}

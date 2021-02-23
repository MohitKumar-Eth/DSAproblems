package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraysOfGivenSum {
    static void subArrays(int[] a, int sum){
        int sumSoFar = 0;
        Map<Integer, List<Integer> > map = new HashMap<>();
        map.put(0, new ArrayList<>());// to handle case if subarray starts from o index
        map.get(0).add(-1);
        System.out.println("List of given sum subarrays by index range: ");
        for(int i = 0; i < a.length; i++){
            sumSoFar += a[i];
            if(map.containsKey(sumSoFar - sum)){
                List<Integer> list = map.get(sumSoFar-sum);
                for(Integer e: list){
                    System.out.println("[" + (e+1) + "to"+ i +"]");
                }
            }
            map.putIfAbsent(sumSoFar , new ArrayList<>());
            map.get(sumSoFar).add(i);
        }
    }
    public static void main(String[] args) {
        int[] b = {3,-1,6,8,9,3,-1,2,3,5,-3};
        subArrays(b, 2);
    }
}

package Array;
import java.util.*;
public class TripletClosestSum {
    static void tripletsClosest(int[] a, int target){
        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
        int closeSum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length-2; i++){
            int start = i+1;
            int end = a.length-1;
            while(start<end) {
                int tripSum = a[i] + a[start] + a[end];
                if (tripSum == target) {
                    System.out.println(tripSum);
                }

                if (Math.abs(target - tripSum) < minDiff) {
                    minDiff = Math.abs(target - tripSum);
                    closeSum = tripSum;
                }
                if (Math.abs(target - tripSum) == minDiff && tripSum < closeSum) {
                    closeSum = tripSum;
                }
                if (tripSum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(closeSum);
    }

    public static void main(String[] args) {
        int[] a = {-2,0,1,2};
        tripletsClosest(a, 2);
    }
}

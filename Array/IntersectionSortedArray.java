package Array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSortedArray {

    static void findIntersection(int[] a1, int[] a2, List intersection){
        int i= 0;
        int j= 0;
        while(i < a1.length && j < a2.length){
            while(i < a1.length-1 && a1[i] == a1[i+1]){
                i++;
            }
            while(j < a2.length-1 && a2[j] == a2[j+1]){
                j++;
            }
            if(a1[i] < a2[j]){
                i++;
            }else if( a2[j] < a1[i]){
                j++;
            }
            else{
                intersection.add(a1[i]);
                i++;
                j++;
            }
        }
    }



    public static void main(String[] args) {
        int[] a1 = {1,2,2,3,3,3,4,6,6,7};
        int[] a2 = {2,2,4,4,5,5,6,7,7,8,8};
        List<Integer> intersection = new ArrayList<>();
        findIntersection(a1, a2, intersection);
        System.out.println(intersection);

    }
}

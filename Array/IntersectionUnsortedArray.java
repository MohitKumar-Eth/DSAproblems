package Array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionUnsortedArray {
    static void findIntersection(int[] a1, int[] a2, Set intersection){
        int i =  0;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        while(i < a1.length){
            set.add(a1[i++]);
        }
        while(j < a2.length){
            if(set.contains(a2[j])){
                intersection.add(a2[j]);
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1,5,2,7,3,1,4,9,6};
        int[] a2 = {2,8,4,4,1,5,9,7,4,8,5};

        Set<Integer> intersection = new HashSet<>();

        findIntersection(a1, a2, intersection);
        System.out.println(intersection);

    }
}

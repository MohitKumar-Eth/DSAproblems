package Array;

import java.util.HashSet;
import java.util.Set;

public class UnionUnsortedArray {
    static void findUnion(int[] a1, int[] a2, Set union){
        int i = 0;
        int j = 0;
        while(i < a1.length){
            union.add(a1[i++]);
        }
        while(j < a2.length){
            union.add(a2[j++]);
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1,5,2,7,3,1,4,9,6};
        int[] a2 = {2,8,4,4,1,5,9,7,4,8,5};
        Set<Integer> union = new HashSet<>();

        findUnion(a1, a2, union);
        System.out.println(union);

    }
}

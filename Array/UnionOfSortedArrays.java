package Array;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {

    static void findUnion(int[] a1, int[] a2, List union){
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
                union.add(a1[i]);
                i++;
            }else if(a1[i] > a2[j]){
                union.add(a2[j]);
                j++;
            }else {
                union.add(a1[i]);
                i++;
                j++;
            }
        }
        while(i < a1.length){
            if(i < a1.length-1 && a1[i] == a1[i+1]){
                i++;
            }
            union.add(a1[i++]);

        }
        while(j < a2.length){
            if(j < a2.length-1 && a2[i] == a2[i+1]){
                j++;
            }
            union.add(a2[j++]);
            
        }


    }

    public static void main(String[] args) {
        int[] a1 = {1,2,2,3,3,3,4,6,6};
        int[] a2 = {2,2,4,4,5,5,6,7,7,8,8};
        List<Integer> union = new ArrayList<>();
        findUnion(a1, a2, union);
        System.out.println(union);

    }
}

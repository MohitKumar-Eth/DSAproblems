package Array;

import java.util.ArrayList;
import java.util.*;

public class CorruptPairInOneToN {
    static List<Integer> findCorrupt(int[] a){
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < a.length){
            if(a[i] != a[a[i]-1]){
                int index = a[i] - 1;
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            } else i++;
        }

        for(int j = 0; j < a.length; j++){
            if (a[j] != j+1) {
                list.add(j+1);
                list.add(a[j]);

            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {5,4,1,3,6,4};
        System.out.println(findCorrupt(a));

    }
}

package Array;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    static int firstRepeat(int[] a){
        int first = -1;
        Set<Integer> s = new HashSet<>();
        for(int i = a.length-1; i >= 0; i--){
            if(s.contains(a[i])){
                first = a[i];
            }
            else s.add(a[i]);
        }
        return first;
    }

    public static void main(String[] args){
        int[] a = {5,2,3,4,5,4,6,3,2,1};
        System.out.println(firstRepeat(a));
    }
}

package Array;
import java.util.*;
public class SegregateEvenOdd {
    static Integer[] segregate(Integer[] a){
        int start = 0;
        int end = 0;
        while(end < a.length){
            if(a[end]%2 == 0){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                end++;
                start++;
            }
            else{
                end++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Integer [] a = {-2,2,-3,1,4,7,11};
        System.out.println(Arrays.asList(segregate(a)));
    }
}


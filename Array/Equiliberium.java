package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Equiliberium {


    public static void eq(int[] a){

        List<Integer> indices = new ArrayList<>();
        int sum = IntStream.of(a).sum();
        int sumSoFar = 0;
        for(int i =0; i < a.length ; i++){
            sum = sum - a[i];
            if(sum == sumSoFar){
                indices.add(i);
            }
            sumSoFar += a[i];
        }
        System.out.println(indices);
    }
    public static void main (String[] args) {
        int[] A = {0, -3, 5, -4, -2, 3, 1, 0};
        eq(A);
    }
}

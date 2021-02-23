package Array;

import java.util.Deque;
import java.util.LinkedList;

public class MaxOfSubarrayOfWindowK {

    static void maxSubArrayElement(int[] a, int k) {
        Deque<Integer> d = new LinkedList<>();
        int i;
        for (i = 0; i < k; i++){
            while(!d.isEmpty() && a[i] > a[d.peekLast()]){
                d.removeLast();
            }
            d.addLast(i);
        }

        for(i = k; i< a.length; i++){
            System.out.print(a[d.peek()] + " ");
            while(!d.isEmpty() && i - k >= d.peek()){
                d.removeFirst();
            }
            while (!d.isEmpty() && a[i] > a[d.peekLast()]) {
                d.removeLast();
            }
            d.addLast(i);
        }
        System.out.print(a[d.peek()]);
    }



    public static void main(String[] args) {
        int[] a = {15,8,10,9,4,1,11};
         maxSubArrayElement(a, 3);
    }
}


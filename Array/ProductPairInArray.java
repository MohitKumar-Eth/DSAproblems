package Array;

import java.util.HashSet;
import java.util.Set;

public class ProductPairInArray {

    static boolean twoProduct(int[] a, int val){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            if(val%a[i] == 0 && set.contains(val/a[i])){
                return true;
            }else {
                set.add(a[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {3, 5, 7, 8, 3, 9};
        System.out.println(twoProduct(a, 63));
    }
}

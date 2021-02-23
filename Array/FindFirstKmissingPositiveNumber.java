package Array;
import java.util.*;
public class FindFirstKmissingPositiveNumber {
    static List<Integer> firstKmissing(int[] a, int k){
        List<Integer>  missing = new ArrayList<>();
        Set<Integer> other = new HashSet<>();
        int i = 0;
        while(i < a.length){
            if(a[i] > 0 && a[i] <= a.length && a[i] != a[a[i]-1]){
                int index = a[i]-1;
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
            else i++;
        }
        for(i = 0; i < a.length; i++ ){
            if(a[i] != i+1){
                missing.add(i+1);
                other.add(a[i]);
            }
        }
        for(int j = i; missing.size() < k; j++){
            if(!other.contains(j+1)){
                missing.add(j+1);
            }
        }
        return missing;
    }


    public static void main(String[] args) {
        int[] a = {-2,2,-3,1,4,7,11};
        System.out.println(firstKmissing(a, 5));
    }
}

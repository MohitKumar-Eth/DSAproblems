package Array;
import java.util.*;


public class QuadrupleSum {

    static List<List<Integer>> quadruple(int[] a, int target){
        List<List<Integer>> quad = new ArrayList<>();
        Arrays.sort(a);
        for(int i = 0; i < a.length-3; i++){
            for(int j = i+1; j < a.length-2; j++){
                int sum = target - (a[i] + a[j]);

                int start = j+1;
                int end = a.length-1;
                while (start < end){
                    int t = a[start] + a[end];
                    if(t == sum){
                        quad.add(Arrays.asList(a[i], a[j], a[start], a[end]));
                        start++;
                        end--;
                    }else if(t < sum){
                        start++;
                    }else end--;
                }

            }
        }
        return quad;
    }



    public static void main(String[] args) {
        int[] a = {1,2,4,3,5,6,0};
        // 1,1,2,2,4,5
        System.out.println(quadruple(a, 9));
    }
}

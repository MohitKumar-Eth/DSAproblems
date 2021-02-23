package Array;

public class MaximumSumSubArray {
    static int maxSumSubArray(int[] a){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            max = Math.max(max, a[i]);
        }
        if(max < 0) return max;

        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if( sum < 0){
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {5,8,-13,9,4,1,3};
        //int[] a = {-3,-1,-2,-4,-6,-8};
        System.out.println( maxSumSubArray(a));
    }
}

package Array;

public class MaxSumSubarrayWindowOfK {

    static int maxSumWindow(int[] a, int k){
        if(a.length < k || k < 1 || k > a.length){
            return -1;
        }
        int max = 0;
        int i;
        int windowSum = 0;
        for( i = 0; i < k; i++){
            windowSum += a[i];
        }
        int start = 0;
        for(int j = i; j < a.length; j++){
            windowSum = windowSum + a[j] - a[start++];
            max = Math.max(windowSum, max);
        }
        return max;


    }
    public static void main(String[] args){
        int[] a = {3,-1,6,8,9,3,-1,2,3,5,-3};
        System.out.println(maxSumWindow(a, 3));
    }
}

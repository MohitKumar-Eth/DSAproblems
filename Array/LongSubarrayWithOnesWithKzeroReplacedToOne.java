package Array;

public class LongSubarrayWithOnesWithKzeroReplacedToOne {

    static int maxSubarrayOnes(int[] a, int k){
        int start = 0;
        int end = 0;
        int Zero = 0;
        int maxLength = 0;
        while (end < a.length){
            if(a[end] == 0){
                Zero++;
            }
            if(Zero > k){
                if(a[start] == 0){
                    Zero--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, end-start+1);
            end++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] a = {0,1,0,0,0,1,1,1,1,0,1,0};
        System.out.println(maxSubarrayOnes(a, 3));
    }
}

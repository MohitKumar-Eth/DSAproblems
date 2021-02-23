package Array;

public class TripletSumSmallerTarget {

    static int tripletsSmaller(int[] a, int target){
        int count = 0;
        for(int i = 0; i < a.length-2; i++){
            int start = i + 1;
            int end = a.length-1;
            while (start < end){
                int t = a[i] + a[start] + a[end];
                if(t < target){
                    count = count + end - start;
                    start++;
                }else end--;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] a = {1,2,-3,4,-2};
        System.out.println(tripletsSmaller(a, 1));
    }
}

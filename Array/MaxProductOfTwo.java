package Array;

public class MaxProductOfTwo {
    static int maxProduct(int[] a){
        int min1 = a[0];
        int min2 = Integer.MAX_VALUE;
        int max1 = a[0];
        int max2 = Integer.MIN_VALUE;

        for(int i = 1; i < a.length; i++){
            if(a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i] > max2){
                max2 = a[i];
            }
            else if(a[i] < min1){
                min2 = min1;
                min1 = a[i];
            }
            else if(a[i] < min2){
                min2 = a[i];
            }
        }
        return Math.max(min1*min2 , max1*max2);
    }

    public static void main(String[] args) {
        int[] a = {3, 5, -8, -9, 7, 3, 9};
        System.out.println(maxProduct(a));
    }
}

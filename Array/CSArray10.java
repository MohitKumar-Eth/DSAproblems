package Array;

public class CSArray10 {
    public static int largeSumSubarray(int[] a){
        int maxHere = a[0];
        int maxSoFar = a[0];

        for(int i = 1 ; i < a.length; i++){
            maxHere = Math.max(maxHere+ a[i], a[i]);
            maxSoFar = Math.max(maxSoFar, maxHere);
        }
        return maxSoFar;
    }
    public static void main(String[] args){
        int[] a = {-2, -3, 4, -1, -1, 3, -1, 5, -4};
        int res = largeSumSubarray(a);
        System.out.println("largest sum: "+ res);
    }

}

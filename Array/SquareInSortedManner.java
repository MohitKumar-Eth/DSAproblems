package Array;

public class SquareInSortedManner {
    static void sortSquare(int[] a){
        int[] arr = new int[a.length];
        int i = a.length-1;

        int start= 0;
        int end = a.length-1;
        while(start <= end){
            if(a[start]*a[start] > a[end]*a[end]){
                arr[i--] = a[start]*a[start];
                start++;
            }else {
                arr[i--] = a[end]*a[end];
                end--;
            }
        }
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {-7,-6,-4,-3,1,3,4,5,6};
        sortSquare(a);
    }
}

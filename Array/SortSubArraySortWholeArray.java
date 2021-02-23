package Array;

public class SortSubArraySortWholeArray {
    static void sortSubarray(int[] a){
        int start = 0;
        int end = a.length-1;

        while(start < a.length-1 && a[start] < a[start+1]){
            start++;
        }
        if (start == a.length - 1) {
            System.out.println("0 length, array is already sorted.");
        }
        while(end >0 && a[end] > a[end-1]){
            end--;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = start; i <= end; i++){
            if(a[i]< min){
                min = a[i];
            }else if(a[i] > max){
                max = a[i];
            }
        }

        while(start >= 0 && a[start] > min ){

            start --;
        }
        while(end < a.length && a[end] < max){

            end++;
        }

        System.out.println("length : " + (end-start-1));
    }

    public static void main(String[] args) {
        int[] a = {1,3,2,4,0,5,7,6,8,9};
        sortSubarray(a);
    }
}

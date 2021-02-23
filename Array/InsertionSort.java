package Array;

public class InsertionSort {
    public void sort(int[] arr) {
        if(arr.length <= 1) {
            return ;
        }

        for(int i = 1 ; i < arr.length; i++) {

            int j;
            int temp = arr[i];
            for( j = i-1; j >= 0 && arr[j]> temp ; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1]= temp;
        }
    }
    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        InsertionSort s = new InsertionSort();
        int[] a = {5,8,2,9,4,1,3};
        s.sort(a);
        s.print(a);
    }
}

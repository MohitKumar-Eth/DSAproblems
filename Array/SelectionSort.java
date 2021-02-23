package Array;

public class SelectionSort {

    public void sort(int[] a) {
        for(int i = 0; i < a.length-1; i++){
            if(a.length== 1) return;
            int min = i;

            for( int j = i+1; j < a.length; j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            if(min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }

    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main (String[] args) {
        SelectionSort s = new SelectionSort();
        int[] a = {3,5,2,9,2,4,1};
        s.print(a);
        s.sort(a);
        s.print(a);


    }

}

package Array;

public class QuickSort {

    public int partition(int[] a, int low, int high){
        int i = low;
        int pivot = a[high];
        for(int j = low; j< high; j++){
            if(a[j] < pivot){

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
            }
        }
        int temp = a[i];
        a[i] = a[high];
        a[high] = temp;

        return i;
    }



    public void sort(int[] a, int low, int high){
        if(low< high){
            int pi = partition(a, low, high);

            sort(a, low, pi-1);
            sort(a, pi+1, high);
        }

    }


    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QuickSort s = new QuickSort();
        int[] a = {3,5,24,9,2,4,1};
        s.print(a);
        s.sort(a, 0, a.length-1);
        s.print(a);

    }
}

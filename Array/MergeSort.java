package Array;

public class MergeSort {

    public void mergeSort(int[] a, int start, int end){
        if(start != end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    public void merge(int[] a, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int k = 0;

        int[] temp = new int[end - start + 1];

        while(i <= mid && j <= end){
            if (a[j] < a[i]){
                temp[k++] = a[j++];
            }
            else temp[k++] = a[i++];
        }
        while(i <= mid){
            temp[k++] = a[i++];
        }
        while(j <= end){
            temp[k++] = a[j++];
        }
        for( i = start; i <= end; i++){
            a[i] = temp[i-start];
        }
    }

    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MergeSort s = new MergeSort();
        int[] a = {3,5,24,9,2,4,1};
        s.print(a);
        s.mergeSort(a, 0, a.length-1);
        s.print(a);

    }
}

package Array;

public class BubbleSort {
    public int[] sort(int[] arr){
        if(arr.length <= 1) return arr;
        for(int i = 0 ; i < arr.length-1; i++ ){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;

    }

    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        BubbleSort b = new BubbleSort();
        int[] a = {4,8,2,-9,-4, -1, 9,4,7,1};
        b.print(a);
        b.sort(a);
        b.print(a);
    }

}

package Array;

public class array1 {
    static int count;
    static void deleteByValue(int[] arr, int val){
        int i;

        for(i = 0; i <= count-1; i++){
            if(arr[i] == val) {
                break;
            }
        }
        if (i == count){
            System.out.println("No such element");
            return;
        }

        for(int j = i; j < count-1; j++){
            arr[j] = arr[j+1];
        }
        arr[count-1] = 0;
        count--;
    }

    static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }



   public static void main(String[] args) {
        int a[] = new int[4];
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        a[3] = 6;

        count = a.length;



       printArray(a);
       deleteByValue(a, 3 );
       printArray(a);
       deleteByValue(a, 2 );
       printArray(a);
       deleteByValue(a, 7);
       printArray(a);
   }


}

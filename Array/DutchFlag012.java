package Array;

public class DutchFlag012 {

    static void threeWayPartition(int A[], int end)
    {
        int start = 0, mid = 0;
        int pivot = 1;

        while (mid <= end)
        {
            if (A[mid] < pivot)        // current element is 0
            {
                swap(A, start, mid);
                ++start; ++mid;
            }
            else if (A[mid] > pivot)    // current element is 2
            {
                swap(A, mid, end);
                --end;
            }
            else                        // current element is 1
            {
                ++mid;
            }
        }
    }

    public static void  dutchFlag(int[] a){
        int low = 0;
        int mid = 0;
        int high = a.length-1;
       while(mid <= high){
           switch (a[mid]) {
               case 0 -> {
                   if (a[mid] != a[low]) {
                       int temp = a[low];
                       a[low] = a[mid];
                       a[mid] = temp;
                   }
                   low++;
                   mid++;
               }
               case 1 -> mid++;
               case 2 -> {
                   if (a[mid] != a[high]) {
                       int temp = a[high];
                       a[high] = a[mid];
                       a[mid] = temp;
                   }
                   high--;
               }
           }
       }

    }

    public static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }



    public static void main (String[] args) {
        int[] a = {0,1,2,0,1,0,1,1,0,2,1,2,1,2};

        Array.QuickSort p = new Array.QuickSort();
        dutchFlag(a);
        //threeWayPartition(a, a.length-1);
        p.print(a);

    }
}

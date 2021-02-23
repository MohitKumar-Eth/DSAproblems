package Array;

public class arraySearch {

    public int binarySearchIterative(int[] arr, int x, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                low = mid+1;
            }
            else high = mid-1;
        }
        return -1;

    }

    public int binarySearchRecursion(int[] arr, int x, int low, int high){
        if(high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                return binarySearchRecursion(arr, x, mid + 1, high);
            } else return binarySearchRecursion(arr, x, low, mid -1 );
        }
        return -1;
    }

    public static void main (String[] args){
        int[] a = {0, 2, 4, 8, 17, 28, 34};
        arraySearch o = new arraySearch();

        //int res = o.binarySearchIterative(a, 0, 0, a.length-1);
        int res = o.binarySearchRecursion(a, 4, 0, a.length-1);
        if(res == -1){
            System.out.println("no such element");
        }else{

            System.out.println("found at index " + res );
        }
    }

}

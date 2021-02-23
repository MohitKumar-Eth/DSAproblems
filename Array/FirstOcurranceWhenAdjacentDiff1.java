package Array;

public class FirstOcurranceWhenAdjacentDiff1 {

    public static int firstOccur(int[] a, int target){
        int start = 0;
        int end = a.length-1;
        while(start <= end) {
            if (a[start] == target) {
                return start;
            }
            int diff = Math.abs(a[start] - target);
            start = start + diff;
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] a = {7,6,5,6,4,5,6,5,4,3,2,3,4,2,3};
        int index = firstOccur(a, 2);
        if(index == -1){
            System.out.println("no such element");
        } else System.out.println("index: " + index);
    }
}



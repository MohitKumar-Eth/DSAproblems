package Array;

public class MissingNumberInOneToNplusOne {

    static int findMissing(int[] a){
        int i = 0;
        while(i < a.length){
            if(a[i] <= a.length && a[i] != i+1){
                int index = a[i] - 1;
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
            else i++;
        }
        for(int j = 0; j < a.length; j++){
            if(a[j] != j+1){
                return j+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5,4,1,9,6,2};
        System.out.println(findMissing(a));

    }
}


package Array;

public class CyclicSrort {

    static void cycleSort(int[] a){
        int i = 0;
        while(i < a.length){
            if (a[i] != i + 1) {
                int index = a[i] - 1;
                int temp = a[i];
                a[i] = a[index];
                a[index]= temp;
            }
            else i++;
        }
    }

    public static void main(String[] args) {
        int[] a = {5,4,1,3,2};
        cycleSort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}

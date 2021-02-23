package Array;

public class RemoveDuplicateSortedArray {
    static void removeDuplicate(int[] a){
      int start = 1;
      for(int i = 1; i < a.length; i++){
          if(a[i] != a[i-1]){
              a[start++] = a[i];
          }
      }
        System.out.println(start);
        for(int i =0; i < a.length; i++){
            System.out.print(a[i] +" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,4,4,4,5,6,6,7,8,9};
        removeDuplicate(a);
    }
}

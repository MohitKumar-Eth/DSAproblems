package Array;

public class CycleInCircularArray {

    private static int getNextIndex(int[] a, int index, boolean forward){
        boolean direction = a[index] > 0;

        if(direction != forward){
            return -1;
        }
        int nextIndex = (index + a[index])%a.length;

        if(nextIndex < 0) {
            nextIndex = nextIndex + a.length;
        }

        if(nextIndex == index){
            return -1;
        }

        return nextIndex;
    }




    static boolean checkCycle(int[] a){
        for(int i = 0; i < a.length; i++){
            int slow, fast;
            slow=fast=i;
            boolean ifForward = a[i] > 0;

            while(true){
                slow = getNextIndex(a, slow, ifForward);
                if(slow == -1){
                    break;
                }

                fast = getNextIndex(a, fast , ifForward);
                if(fast == -1){
                    break;
                }

                fast = getNextIndex(a, fast, ifForward);
                if(fast == -1){
                    break;
                }

                if(slow == fast){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {1,1,2,1,2};
        System.out.println(checkCycle(a));
    }
}

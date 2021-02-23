package Array;

import java.util.*;

public class SortArrayFrequencyAndIndex {

    static void sort(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++ ){
            map.put(list.get(i) , map.getOrDefault(list.get(i), 0)+ 1);
        }

        Collections.sort(list, (k1, k2) ->{
            int freq1 = map.get(k1);
            int freq2 = map.get(k2);
            if(freq1 != freq2){
                return freq2-freq1;
            }
            return list.indexOf(k1) - list.indexOf(k2);
        });


        System.out.println(list);

    }


    public static void main(String[] args) {
        Integer[] a = {15,8,8,8,10,9,4,1,1,11};
        List<Integer> list = Arrays.asList(a);
        sort(list);
    }
}

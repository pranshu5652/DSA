// unique Element find...

import java.util.HashMap;
public class findUniqueEelementTwoNumberGreter {
    static int unique(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr={1,1,1,2,2,3,3,5,4,4};
        int ans=unique(arr);
        System.out.println(ans);
    }
}

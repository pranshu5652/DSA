import java.util.*;
public class majorityElementthree {
    static void majorty(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
            for(int key:map.keySet()){

                if(map.get(key)>(n/3)){
                    System.out.println(key);
                }
            }


    }
   public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1};
        majorty(arr);



    }
}

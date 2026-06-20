// find first repeating element of an given array
import java.util.HashMap;
public class findFirstRepetingE {
    static int repeat(int[] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int i: arr){
            // map me jis bhi key ke frequency 1 se greter ho vahi hmara ans hai...
            if(map.get(i)>1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,3,2,3,5,2};
        int ans=repeat(arr);
        System.out.println(ans);

    }
}

import java.util.HashMap;
public class maxFEandminFE {
    static int[] maxminE(int[] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int maxfreq=Integer.MIN_VALUE;
        int maxferqkey=-1;
        for(int key:map.keySet()){
            int currentfreq=key;
            int currentfreqkey=map.get(key);
            if(currentfreqkey>maxfreq){
                maxfreq=currentfreqkey;
                maxferqkey=currentfreq;
            }
        }
        int minfreq=Integer.MAX_VALUE;
        int minferqkey=-1;
        for(int key:map.keySet()){
            int currentfreq=key;
            int currentfreqkey=map.get(key);
            if(currentfreqkey<minfreq){
                minfreq=currentfreqkey;
                minferqkey=currentfreq;
            }
        }
        int[] ans={maxferqkey,minferqkey};
        return ans;

//        for (int i: map.keySet()){
//            System.out.println(i+"-->"+map.get(i));
//        }

    }
   public static void main(String[] args) {
       int[] arr={2,3,2,4,5,6,3,4,2,5,4,3,2};
      int[] ans= maxminE(arr);
       System.out.println("max freqency element is--->"+ans[0]);
       System.out.println("min freqency element is--->"+ans[1]);
    }
}

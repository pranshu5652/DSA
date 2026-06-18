// find mode of array means which element which frequency is max...

import java.util.HashMap;
// mode= highest frequency element is called mode...
public class modeofarray {
    static int mode(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxfreq=-1;
        int maxfreqkey=-1;
        for(int key:map.keySet()){
            int currentkey=key;
            int currentkeyfreq=map.get(key);
            if (currentkeyfreq > maxfreq) {

                maxfreq=currentkeyfreq;
                maxfreqkey=currentkey;
            }
        }
        //  if check the key and valuse of hashmap
//        for(int i: map.keySet()){
//            System.out.println(i+"-->"+map.get(i));
//        }
        return maxfreqkey;
    }


    public static void main(String[] args) {
        int[] arr = {1,1, 2, 2, 2, 3, 3, 4, 4};
        int ans= mode(arr);
        System.out.println(ans);
    }
}

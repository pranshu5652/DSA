//find the max element in an array...

import org.w3c.dom.ls.LSOutput;

public class big_element {
    static int beg(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
   public static void main(String[] args) {
        int[] arr={76,55,45,33,12,78 ,100};
        int ans=beg(arr);
       System.out.println(ans);


    }
}

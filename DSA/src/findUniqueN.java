public class findUniqueN {
    static int UniqueE(int[] arr){
        int xorsum=0;
        for(int num:arr){
            xorsum^=num;
        }
        return xorsum;
    }
   public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4};
        int ans=UniqueE(arr);
       System.out.println(ans);
    }
}

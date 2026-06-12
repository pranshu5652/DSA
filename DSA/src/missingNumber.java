public class missingNumber {
    static int misse(int[] arr){
        int xorsum=0;
        for(int n: arr){
            xorsum=xorsum^n;
        }
        int n=arr.length;
        for(int i=0;i<=n;i++){
            xorsum=xorsum^i;
        }
        return xorsum;
    }
   public static void main(String[] args) {
        int[] arr={0,1,2,5,4};
        int ans=misse(arr);
       System.out.println(ans);

    }
}

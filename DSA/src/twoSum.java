public class twoSum {
    static int[] twosume(int[] arr){
        int n=arr.length;
        int target=9;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    int[] ans={i,j};
                    return ans;
                }
            }
        }
        int[] ans={};
        return ans;
    }
   public static void main(String[] args) {
        int[] arr={1,2,6,3,5};
        int[] ans=twosume(arr);
       System.out.println(ans[0]+" "+ans[1]);

    }
}

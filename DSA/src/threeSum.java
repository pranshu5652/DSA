  //three sum...
public class threeSum {
    static int[] threesume(int[] arr){
        int n=arr.length;
        int target=9;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        int[] ans={i,j,k};
                        return ans;
                    }
                }
            }

        }
        int[] ans={};
        return ans;
    }
   public static void main(String[] args) {
       int[] arr={0,2,6,3,5};
       int[] ans=threesume(arr);
       if(ans.length == 0){
           System.out.println("No triplet found");
       }
       else{
           System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
       }
    }
}

// most conjugative ones ...
public class mostConjugativeOnes {
    // kadans Algo using...
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        mostConjugativeOnes obj=new mostConjugativeOnes();
        int[] arr={1,1,0,0,1,1,1,0};
        int ans=obj.findMaxConsecutiveOnes(arr);
        System.out.println(ans);

    }
}

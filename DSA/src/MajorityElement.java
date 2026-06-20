// Leetcode 169 Majority Element...

public class MajorityElement {
    public int majorityElement1(int[] nums) {
        int count=0;
        int ele=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                ele=nums[i];
            }
            else if(nums[i]==ele){
                count++;
            }
            else {
                count--;
            }
        }

        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                count1++;
            }
            if(count1>(nums.length/2)){
                return ele;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4,2,2,5,6,2,2};
        MajorityElement obj=new MajorityElement();
        int ans=obj.majorityElement1(arr);
        System.out.println(ans);
    }
}

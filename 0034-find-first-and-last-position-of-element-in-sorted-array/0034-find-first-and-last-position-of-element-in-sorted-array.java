class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int first=-1;
        int last=-1;
    
        //first
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
               first=mid;
                  end=mid-1;
            }
            else if(nums[mid]<target){
                         start=mid+1;   
            }
            else{
               end=mid-1;
               
            }
           
        }
        // last 
        start=0;
        end=n-1;
         while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
               last=mid;
               start=mid+1; 
            }
             else if(nums[mid]>target){
                   
                     end=mid-1;
            }
            else{
               
              start=mid+1; 
            }
        }
        int[] ans={first,last};
        return ans;

    }
}
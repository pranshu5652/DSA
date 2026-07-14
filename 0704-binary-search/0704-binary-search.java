class Solution {
    public int search(int[] nums, int target) {
      int n=nums.length;
      // three pointer start,end, mid... 
      int s=0,e=n-1;
      // kab tak chale ga loop...
      while(s<=e){
        // find mid formula....
       int mid=s+(e-s)/2;
       if(nums[mid]==target){
        return mid;
       }
        if(nums[mid]<target){
        // update start pointer...    
       s=mid+1;
        }
       else{
        // update end pointer...
        e=mid-1;
       }
      }
      // when target is not present in array
      return -1;  
    }
}
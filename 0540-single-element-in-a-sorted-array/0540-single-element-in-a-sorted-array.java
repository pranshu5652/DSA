class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int xs=0;
        for(int i=0;i<n;i++){
            xs^=nums[i];
        }
        return xs;
    }
}
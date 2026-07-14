class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2; // pehle 2 elements already valid hain
        
        // Edge case: agar array 2 ya kam elements ka hai
        if (nums.length <= 2) return nums.length;
        
        for (int i = 2; i < nums.length; i++) {
            // Current element ko 2 position pehle se compare karo
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i]; // Valid hai, likh do
                k++;
            }
            // Warna skip!
        }
        
        return k;
    }
}
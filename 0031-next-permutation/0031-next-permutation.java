class Solution {
    public void nextPermutation(int[] nums) {
            int n = nums.length;
        int pivot = -1;

        // Step 1: Pivot dhundho (end se)
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;  // pehla milte hi ruko
            }
        }

        // Step 2: Agar pivot mila to swap karo
        if (pivot != -1) {
            for (int j = n - 1; j > pivot; j--) {
                if (nums[j] > nums[pivot]) {
                    // swap
                    int temp = nums[pivot];
                    nums[pivot] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }

        // Step 3: Pivot ke baad reverse karo
        int left = (pivot == -1) ? 0 : pivot + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
    }
}
}

  
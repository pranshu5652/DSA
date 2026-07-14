class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
   int n = arr.length;
        
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: First element must be 1
        arr[0] = 1;
        
        // Step 3: Each element = min(arr[i], arr[i-1] + 1)
        for (int i = 1; i < n; i++) {
            arr[i] = Math.min(arr[i], arr[i-1] + 1);
        }
        
        // Step 4: Last element is the maximum
        return arr[n-1];
    }
}
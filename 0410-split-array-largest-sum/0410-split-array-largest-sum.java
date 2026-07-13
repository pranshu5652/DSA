

class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt(); // largest element (min possible answer)
        int high = Arrays.stream(nums).sum();            // sum of all elements (max possible answer)

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int partitions = countPartitions(nums, mid);

            if (partitions > k) {
                low = mid + 1;  // too many partitions -> increase maxSum
            } else {
                high = mid - 1; // valid, try smaller maxSum
            }
        }
        return low;
    }

    // Counts how many subarrays (partitions) are needed if each subarray's sum <= maxSum
    private int countPartitions(int[] a, int maxSum) {
        int partitions = 1;
        long subarraySum = 0;

        for (int num : a) {
            if (subarraySum + num <= maxSum) {
                subarraySum += num;
            } else {
                partitions++;
                subarraySum = num;
            }
        }
        return partitions;
    }
}

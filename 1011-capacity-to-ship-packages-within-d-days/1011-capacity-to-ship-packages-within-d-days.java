import java.util.Arrays;

class Solution {
    public int shipWithinDays(int[] weights, int d) {
        // Minimum possible capacity = heaviest single package
        int left = Arrays.stream(weights).max().getAsInt();
        // Maximum possible capacity = sum of all weights
        int right = Arrays.stream(weights).sum();

        // Binary search on capacity
        while (left < right) {
            int mid = left + (right - left) / 2;
            int needed = daysNeeded(weights, mid);

            if (needed <= d) {
                // mid capacity works, try smaller capacity
                right = mid;
            } else {
                // mid capacity too small, need bigger capacity
                left = mid + 1;
            }
        }
        return left;
    }

    // Helper: given a ship capacity, calculate days needed
    private int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                days++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }
        return days;
    }
}
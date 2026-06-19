// Leetcode 136 Single number
public class SingleNumber {
    static int singleNumber1(int[] nums) {
        int xorsum = 0;
        for (int num : nums) {
            xorsum = xorsum ^ num;
        }
        return xorsum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1};

        int ans = singleNumber1(arr);
        System.out.println(ans);

    }
}

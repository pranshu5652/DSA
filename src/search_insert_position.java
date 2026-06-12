public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // array element jab target se jyada ya equal ho
            if (nums[i] >= target) {
                return i;
            }
        }
        // array le length geven kar do
        return nums.length;
    }

public static void main(String[] args) {
    int[] arr = {45,56,67,89,100};
    int target = 51;
    search_insert_position sc = new search_insert_position();
   int result= sc.searchInsert(arr, target);
    System.out.println(result);
}
}




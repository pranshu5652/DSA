// Linear Search in first accurance Element....
public class linearSearch {
   static int linearSearchs(int nums[], int target) {
        //Your code goes here
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] arr={1,4,5,3,6,7,8,3,4};
       int ans =linearSearchs(arr,4);
        System.out.println(ans);

    }
}

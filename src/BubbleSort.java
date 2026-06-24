public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]){


                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return  nums;
    }

    public static void main(String[] args) {
        int[] arr={5,3,4,2,1};
        BubbleSort obj=new BubbleSort();
        int[] ans=obj.bubbleSort(arr);
        for(int num:ans){
            System.out.print(num+   " ");
        }
    }
}

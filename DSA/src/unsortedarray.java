public class unsortedarray {
    static int nsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

   public static void main(String[] args) {
        int[] arr={2,3,4,6,7,1};
        int ans=nsort(arr);
        System.out.println(ans);

    }
}

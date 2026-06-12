public class sumPn {
    static int[] sumofpn(int[] arr){
        int possum=0;
        int negsum=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
                possum+=arr[i];
            }
            else{
                negsum+=arr[i];
            }
        }
        int[] ans={possum,negsum};
        return ans;
    }
    static void main() {
        int[] arr={2,3,-3,-4,6,-7,3,-6};
        int[] ans= sumofpn(arr);
        System.out.println("possitive number="+ ans[0]);
        System.out.println("negative number="+ ans[1]);


    }
}

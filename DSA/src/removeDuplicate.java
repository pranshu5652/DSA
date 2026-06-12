 // remove duplicates from sorted array and give the original array length....

public class removeDuplicate {
    static int dupl(int[] arr){
        int n=arr.length;
        int i=0;
        int j=1;
        while(j<n){
            if(arr[j]==arr[i]){
                j++;
            }
           // no match case if(arr[i] !=arr[j])
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        return i+1;
    }
   public static void main(String[] args) {
      int[] arr={1,2,3,3,4,4};
      int ans=dupl(arr);

       System.out.println(ans);
    }
}

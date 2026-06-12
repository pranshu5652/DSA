public class Revers_Array {
    static int[] revers(int[]arr){
        int n=arr.length;
        int i=0;
        int j= n-1;
        while(i < j){
            // swaping....
            int t= arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            // i ko agee bdao...
            i++;
            //j lo picha karo...
            j--;
        }
           return arr;
    }
   public  static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
      int[] ans= revers(arr);
       for(int k:ans){
           System.out.print(k+" ");
       }

    }
}

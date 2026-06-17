//print the array in alternate order...


public class alternateorder {
    static void al(int[] arr){
        int n=arr.length;
        int i=arr[0];
        int j=arr[n-1];
       while(i<=j){
            if(i==j) {
                System.out.println(i);
                return;
            }
            else{
                System.out.print(i+" ");
                i++;
                System.out.print(j+" ");
                j--;
            }
        }

    }
  public static void main(String[] args) {
      int[] arr={1,2,3,4,5};
      al(arr);

    }
}

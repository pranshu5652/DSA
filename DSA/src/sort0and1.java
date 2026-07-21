// sort 0s , 1s,


public class sort0and1 {
    static int[] sort01(int[] arr){
        int i=0;
        int j=arr.length-1;
       while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }

        }
       return arr;

    }
   public static void main(String[] args) {
       int[] arr={1,1,1,1,0,0,0,1,0,1,0,1};
    int[] ans= sort01(arr);
       for(int k: ans){
           System.out.print(k+" ");
       }


    }
}

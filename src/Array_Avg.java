public class Array_Avg {
    static double average1(int[] arr){
        int size=arr.length;
        double sum=0;
        for(int i=0;i<size;i++){
             sum+=arr[i];
        }
        double average=  sum/size;
        return average;
    }

    public static void main(String[] args) {
               int[] arr={ 45,54,36,45,53};
        System.out.println(average1(arr));


    }
}

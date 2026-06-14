// print the sum of each row in 2D array...
// time complexity-->  O(m*n)
import java.util.ArrayList;
import java.util.List;
public class sumOfEachRowIn2DArray {
    static List<Integer>  rowsum(int[][] arr){
        List<Integer> result= new ArrayList<>();
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            result.add(sum);
        }
        return result;
    }

   public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
       List<Integer> ans = rowsum(arr);

       System.out.println(ans);


    }
}

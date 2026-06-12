import java.util.Scanner;
public class array_basic {
    static void main(){
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }

        for(int j: arr){
            System.out.println(j);
        }

    }
}

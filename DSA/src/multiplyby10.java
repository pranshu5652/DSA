public class multiplyby10 {
    static int[] mul10(int[] arr){
        int size=arr.length;
        int[] newarray=new int[size];
        for(int i=0;i<size;i++){
            int element=arr[i];
            int number=element * 10;
            newarray[i]=number;
        }
        return newarray;
    }
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] ans=mul10(arr);
        for(int i: ans){
            System.out.print(i + " ");
        }

    }
}

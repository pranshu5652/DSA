public class find_element {
    static boolean finde(int[] arr,int target){
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target){
                return true;
            }

        }
        return false;
    }
    static void main() {
        int[] arr={45,67,88,98,34,56,100};
        boolean ans=finde(arr,100);
        System.out.println(ans);

    }
}

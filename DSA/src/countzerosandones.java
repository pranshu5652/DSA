public class countzerosandones {
    static int[] countnum(int[] arr) {
        int zeronum = 0;
        int onenum = 0;
        for(int i=0;i<arr.length;i++){

        if (arr[i] == 0) {
            zeronum++;
        } else {
            onenum++;
        }
    }
    int[] ans = {zeronum, onenum};
        return ans;
        }
    static void main() {
        int[] arr={1,1,0,1,0,0,1,0,0,0,0,0,0,0,1,1,1,};
        int[] ans=countnum(arr);
        System.out.println("zero numbers are :"+ ans[0]);
        System.out.println("one numbers are:"+ ans[1]);
    }
}

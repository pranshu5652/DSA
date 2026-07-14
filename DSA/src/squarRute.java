//Find square root of a number
//Hints
//Company
//Given a positive integer n. Find and return its square root. If n is not a perfect square, then return the floor value of sqrt(n).
//
//
//Example 1
//
//Input: n = 36
//
//Output: 6
//
//Explanation: 6 is the square root of 36.
//
//Example 2
//
//Input: n = 28
//
//Output: 5
//
//Explanation: The square root of 28 is approximately 5.292. So, the floor value will be 5.



public class squarRute {
    public static int floorSqrt(int n) {
            int start=1;
            int end=n;
            int ans=1;
            while(start<=end){
                int mid=start+(end-start)/2;
                long squar=(long) mid*mid;
                if(squar<=n){
                    ans=mid;
                    start=mid+1;
                }
                else end=mid-1;

            }

            return ans;
        }

     public static void main(String[] args) {
        int n=36;
        int ans=floorSqrt(n);
         System.out.println(ans);

    }

}

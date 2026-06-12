public class sum_todigit {
   public static void main(String[] args) {
       int a=3;
       int b=5;
       while(b!=0){
           int sum=a ^ b;
           int carry=(a&b) << 1;
           a=sum;
           b=carry;
       }
       System.out.println(a);
    }
}

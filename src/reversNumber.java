// Reverse the given digit...

public class reversNumber {
    public int reverse(int x) {
        int renum=0;
        while(x!=0){
            // find last digit...
            int lastd=x%10;
            // after find last digit find remaning digit...
            x=x/10;
            //if reverse is large and smollest...
            if (renum > Integer.MAX_VALUE / 10 || renum < Integer.MIN_VALUE / 10) {
                return 0;
            }
            //all last digit add ...
            renum=renum*10+lastd;
        }
        return renum;
    }

   public static void main(String[] args) {
        int n=6754;
        reversNumber obj=new reversNumber();
        int ans=obj.reverse(n);
       System.out.println(ans);



    }
}

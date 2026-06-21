public class numberPalendrom {
    private boolean isPalindrom(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int xcopy = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return reverse == xcopy;
    }
    public static void main(String[] args) {
        int x=121;
        numberPalendrom obj=new numberPalendrom();
        boolean ans=obj.isPalindrom(x);
        System.out.println(ans);
    }
    }


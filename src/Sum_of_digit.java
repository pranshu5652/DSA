import java.util.Scanner;
public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number to be add:");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            // % remender nikal ke digit ko dega...
            int digit = num % 10;
            //sum ko update kare ge....
            sum += digit;
            // nwe number maintain kare ge remender htane ke bad ....
            num = num / 10;
        }
        System.out.println("sum of digits is :" + sum);
    }
}




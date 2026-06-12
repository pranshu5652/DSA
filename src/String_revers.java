import java.util.Scanner;
public class String_revers {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your name:");
       // String type ka input lene ke liya
       String n= sc.nextLine();
       for(int i=n.length()-1;i>=0;i--){
           // sabhi charecters ko print krane ke liya
           System.out.print(n.charAt(i));

       }

    }
}

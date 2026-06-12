import java.sql.SQLOutput;
import java.util.ArrayList;

public class sum_of_arraylist {
  public  static void main(String[] args) {
      ArrayList<Integer> l=new ArrayList<>();
      for(int i=1;i<=10;i++){
          l.add(i);
      }
      int sum=0;
      for(int num: l){
          if(num % 2==0){
              sum+=num;
          }
      }
      System.out.println("the sum :" + sum);

    }
}

public class Recursion {
    int count=0;
  void print() {
      // this is a base condition...
        if (count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        print();
    }
   public static void main(String[] args) {
        Recursion r=new Recursion();
        r.print();

    }
    }


import java.util.ArrayList;
public class arraylist {
   public static void main(String[] args) {
       ArrayList<Integer>a=new ArrayList<>();
       //add() method
       a.add(23);
       a.add(56);
       System.out.println(a);
       a.add(12);
       System.out.println(a);
       // remove() method
       a.remove(1);
       a.add(74);
       a.add(100);
       System.out.println(a);
       // size() method check length
       System.out.println(a.size());
       System.out.println("get");
       // get() method check index method
       System.out.println(a.get(0));
       // set() method set the element in perticuler index
       System.out.println(a.set(1,200));
       //toArray() convert list into array
       Object[] arr=a.toArray();
       for(Object obj: arr){
           System.out.print(obj + " ");
       }
       System.out.println();
       // contains() method check the element is present or not
       System.out.println(a.contains(100));


    }
}

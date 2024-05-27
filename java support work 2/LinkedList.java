import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;        

public class LinkedList {
   public static void main(String args[]) {
   
    
      LinkedList<String> l_list = new LinkedList<String>();
      
      l_list.add("11");
      l_list.add("22");
      l_list.add("33");
      l_list.add("44");
      System.out.println("Linked List Content: " +l_list);
   
     
      l_list.add(0, "55");
      l_list.add(5, "66");
      l_list.add(3, "99");
      System.out.println(l_list);
      
      l_list.removeFirst();
      l_list.removeLast();
      System.out.println(l_list);
      
      l_list.remove(1);
      System.out.println("deletion of 2nd position " +l_list);
       
      
      ListIterator<String> itrator = l_list.listIterator();
      System.out.println("List displayed using iterator:");
      while (itrator.hasNext()) {
         System.out.println(itrator.next());
      
      }
   }
}
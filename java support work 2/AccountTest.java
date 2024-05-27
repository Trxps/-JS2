
public class AccountTest
{
   public static void main(String[] args)
   {
      Account m = new Account(20);
      m.addToBalance(5);
     
      System.out.println(m.getBalance());
   }
}
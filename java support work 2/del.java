public class Account
{

   private double balance;

   public Account(double amount)
   {
      balance = amount;
   }

   public void addToBalance(double percent)
   {
      balance = balance * percent;
   }
  
   public void addToBalance (double amount)
   {
      balance = balance + amount;
   }
  

   public double getBalance()
   {
      return balance;
   }

}
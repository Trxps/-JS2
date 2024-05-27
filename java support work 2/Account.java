public class Account
{
   private double balance;

   public Account(double balanceIn)
   {
      balance = balanceIn;
   }

   public void addToBalance()
   {
      balance = balance + 10;
   }
  
   public void addToBalance(double amount)
   {
      balance = balance + amount;
   }

   public double getBalance()
   {
      return balance;
   }
}

 
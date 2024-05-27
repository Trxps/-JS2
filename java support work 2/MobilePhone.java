// class representing a mobile phone
import java.util.ArrayList;
public class MobilePhone
{
   // instance variables
   private String title;
   private ArrayList <String> actor;
   private double call;
   private double text;
   private double balance;
   
   public MobilePhone()
   {
      balance = 0;
      call = 0.20;
      text = 0.10;
   }
   
   public MobilePhone(double callIn, double textIn)
   {
      balance = 0;
      if(callIn < 0)
         call = 0.20;
      else
         call = callIn;
      if(textIn < 0)
         text = 0.20;
      else
         text = textIn;
   }
   
   public double getBalance()
   {
      return balance;
   } 

   public void topUp(double amountIn)
   {
      balance += amountIn;
   }
   
   public double getCall()
   {
      return call;
   } 
   
   public double getText()
   {
      return text;
   } 
   
   public void makeCall()
   {
      if(balance >= call)
         balance = balance - call;
   }
   
   public void sendText()
   {
      if(balance >= text)
         balance = balance - text;
   }
   
   public String toString()
   {
      //String s = "";
     // s += "Balance: " +balance +", cost of calls " +call +", cost of text " +text;
      return "Balance: " +balance +", cost of calls " +call +", cost of text " +text;
   }
   
   public boolean equals(MobilePhone other)
   {
      return balance == other.balance && call == other.call && text == other.text;
   }
   
}
// Practical MobilePhoneTester
// Shane Mc Ateer
// 21/04/2021
// Program To use a phone
import java.util.Scanner;
public class MobilePhoneTester{
   public static void main(String[] args)
   {
      Scanner keyIn = new Scanner(System.in);
   //Create an insyance of type MobilePhone
      MobilePhone phone = new MobilePhone();
      int option;
      double r;
      
   
      System.out.println("*****Mobile Phone Menu*****");
      System.out.println("1: Make a call");
      System.out.println("2: Send a text");
      System.out.println("3: Top Up");
      System.out.println("4: Check balance");
      System.out.println("5: Check cost of text");
      System.out.println("6: Check cost of call");
      System.out.println("0: Quit");
      do{
         System.out.println("Select an option: ");
         option = keyIn.nextInt();
         switch(option){
            case 1:
               phone.makeCall();
               break;
            case 2:
               phone.sendText();
               break;
            case 3:
               System.out.println("Enter how much you want to top up"); 
               r = keyIn.nextDouble();   
               phone.topUp(r);
               break;
            case 4:
               System.out.println("Balance of Mobile Phone: " + phone.getBalance());     
               break;
            case 5:
               System.out.println("Cost of sending a text: " + phone.getText());    
               break;
            case 6:
               System.out.println("Cost of making a call: " + phone.getCall());  
               break;
            case 0:
               System.out.println("Thank you");  
               break;
            default:
               System.out.println("Invalid Entry");
               break;
         }
      
      //Use methods to retreive values of instances varibles
      }while(option != 0);
   
   }//end main method
}
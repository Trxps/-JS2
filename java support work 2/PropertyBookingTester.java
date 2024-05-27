import java.util.*;

public class PropertyBookingTester {

   public static void main (String args[]) {
   
   PropertyBooking pb1 = new PropertyBooking (4, "15 main st. Longford Town", 3, 80.50, "House", true);
   PropertyBooking pb2 = new PropertyBooking (7, "Apartment 16A. Wharf Complex 'A' , Dublin", 5, 100);
   System.out.println("Testing first booking: \n" + "Nightly Cost: " + pb1.getnightlyCost());
   
   System.out.println("Property Type:" + pb1.getPropertyType());
   
   System.out.println("Are Pets Allowed? " + pb1.getPetsAllowed());
   
   System.out.println("total booking price: " + pb1.getTotalBookingPrice());
   
   System.out.println("Cost Per Occupant: " + pb1.getCostPerOccupant());
   
   pb1.displayCreditCardNumber();
   
   pb1.setCostPerNight(50);
   
   System.out.println("Testing first booking: \n" + "Nightly Cost: " + pb1.getnightlyCost());

   pb1.setCreditCardNumber("1234");   
   pb1.setCreditCardNumber("1234453434424324444242424423242");   
   pb1.setCreditCardNumber("1234567891234567");   

   pb1.displayCreditCardNumber();
   
   
   
   System.out.println("---------------------------------------" + pb2.getPetsAllowed());
   
   System.out.println("total booking price: " + pb2.getTotalBookingPrice());
   
   System.out.println("Property Type:" + pb2.getPropertyType());
   
   System.out.println("Cost Per Occupant: " + pb2.getCostPerOccupant());
   
   pb2.displayCreditCardNumber();
   
   pb2.setCostPerNight(200);
   
   System.out.println("Testing first booking: \n" + "Nightly Cost: " + pb2.getnightlyCost());

   pb2.setCreditCardNumber("8888");   
   pb2.setCreditCardNumber("8888888888888888888888888888888888");   
   pb2.setCreditCardNumber("9876543217654321");   

   pb2.displayCreditCardNumber();

   
   
   }
  
 }
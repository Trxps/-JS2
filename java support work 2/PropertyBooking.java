// Name of our Class
public class PropertyBooking
{
   //instance variables
   private int numberOfNights;                // number of nights booked
   private String address;                    // house address
   private int numOccupants;                  // number of occupants
   private double nightlyCost;                // nightly cost
   private String propertyType;               // nightly cost
   private boolean petsAllowed;               // are pets allowed?
   private String creditCardNumber;           // credit card number
   //private static int nxtAccNum = 1000000;  // use this to create sequential number
   
   // Constructor A 
   public PropertyBooking (int numNite, String addrs, int numOcc, double niteCost, String propTyp, boolean petsOK)
   {
      numberOfNights = numNite;
      address = addrs;
      numOccupants = numOcc;
      nightlyCost = niteCost;
      propertyType = propTyp;
      petsAllowed = petsOK;
      creditCardNumber = "0000000000000000";
   }
   
   // Constructor B 
   public PropertyBooking (int numNite, String addrs, int numOcc, double niteCost)
   {
      numberOfNights = numNite;
      address = addrs;
      numOccupants = numOcc;
      nightlyCost = niteCost;
      propertyType = "Apartment";
      petsAllowed = false;
      creditCardNumber = "0000000000000000";
   }
   

   
   // Getters & Setters
   //--------------------------------------------
   public double getNightlyCost()
   {
      return nightlyCost;   
   }
   
   public String getAddress()
   {
      return address;
   }
   
   public boolean getPetsAllowed()
   {
      return petsAllowed;   
   }
   
   public double getTotalBookingPrice()
   {
      return numberOfNights * nightlyCost;   
   }
   
   public double getCostPerOccupant()
   {
      return (numberOfNights * nightlyCost) / numOccupants;   
   }
   
   public String getPropertyType()
   {
      return propertyType;
   }
   
   public String displayCreditCardNumber()
   {
      String lastFourChars = creditCardNumber.substring(creditCardNumber.length()-4);
      return ("************" + lastFourChars);
   }
   
   //--------------------------------------------
   
   public void setCostPerNight(double c)
   {
      nightlyCost = c;   
   }
   
   public void setCreditCardnumber(String ccn)
   {
      if(ccn.length() == 16)
      {
         creditCardNumber = ccn;      
      }
      else
      {
         System.out.println("**ERROR** Incorrect format of Credit Card Number");
      }  
   }
   

   
   public String toString()
   {
      
      String s = "------------------------------------------\n";
      s =  s +   "Address:                    " + address;
      s =  s +   "\nProperty Type:              " + propertyType;
      s =  s +   "\nNumber of nights:           " +numberOfNights;
      s =  s +   "\nNumber of Occupants:        " +numOccupants;
      s =  s +   "\nNightly Cost:               " +nightlyCost;
      s =  s +   "\nPets Allowed:               " +(petsAllowed ? "YES" :"NO");
      s =  s +   "\n------------------------------------------\n\n";
      s =  s +   "\nTotal Cost:                 " + getTotalBookingPrice();
      s =  s +   "\nCost per Occupant:          " + getCostPerOccupant() +"\n";
      s =  s +   "\nCredit Card Number:         " + displayCreditCardNumber();
      s =  s +   "\n------------------------------------------\n";
      return s;
      

      
      
      
      
      
   }
   
   
   
}
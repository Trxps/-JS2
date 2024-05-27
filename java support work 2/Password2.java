import java.util.Random;
import java.util.Scanner;

public class Password2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        boolean strong_password=false;
        String[] common = new String[]{"Spot", "Spike","password","12345678","qwertyuiop","asdfghjkl","zxcvbnm","abcdefgh","Tom",
                "87654321","123123123","password1","00000000","11111111","picture1","iloveyou","computer","123321123","passpass",
                "password123"};     
        String pass="";
        System.out.print("1)\tEnter a strong Password\n2)\tGenerate a strong Password\nChoose:\t");
        int choice = sc.nextInt();      
        if(choice==1)
        {
            while (!strong_password)               {
                System.out.print("Please enter a Strong Password:\n");
                pass = sc.nextLine();
                if(pass.length()<6)
                {
                    System.out.println("Password must be of minimum 6 Characters"); 
                    continue;                   }
                if(pass.contains(" "))
                {
                    System.out.println("White spaces in password not allowed"); 
                    continue;
                }
                boolean common_pass=false;
                for (String s : common) {       
                    if (pass.equalsIgnoreCase(s)) {
                        System.out.println("Password too common");     
                        common_pass = true;
                        break;
                    }
                }
                if (common_pass)
                    continue;
                boolean contains_letter = false;
                boolean contains_digit = false;
                for(int i=0;i<pass.length();i++)
                {
                    if(pass.charAt(i)>=65&&pass.charAt(i)<=90 || pass.charAt(i)>=97&&pass.charAt(i)<=122)
                        contains_letter=true;      
                    else if(pass.charAt(i)>=48&&pass.charAt(i)<=57)
                    {
                        contains_digit =true;      
                    }
                    if(contains_letter&&contains_digit)
                        break;
                }
                if(!contains_letter||!contains_digit)   
                {
                    System.out.println("Password must contain atleast one letter and one digit");
                    continue;
                }
                strong_password =true;
            }
            System.out.println("Your Strong password is:\t"+pass);  
        }
        else if(choice==2)
        {
            Random rand =new Random();      
            String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    + "abcdefghijklmnopqrstuvxyz";
            String num = "0123456789";
            String random_pass="";
            for(int i=0;i<6;i++)        
            {
                if(rand.nextBoolean())  
                {
                    int index = (int) (alpha.length()*Math.random());   
                    random_pass += alpha.charAt(index);    
                }
                else
                {
                    int index = (int) (num.length()*Math.random());     
                    random_pass += num.charAt(index);       
                }

            }
            System.out.println("Your Randomly Generated Strong Password is:\t"+random_pass);    
        }
        else
        {
            System.out.println("Wrong Choice. Please try again");
        }
    }
}

// Totally didn't use this same code for my digital forensics password checker
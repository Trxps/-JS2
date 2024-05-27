import java.util.ArrayList;

public class AllEmployees
{
   public static void main(String [] args)
   {
  
  
   ArrayList <Employee> department = new ArrayList <Employee>();
  
   department.add(new Employee("Larry", 25000));
   department.add(new Employee("Moe", 9500));
   department.add(new Employee("Curly", 12000));
   department.add(new Employee("Bob", 23000));
  
   for(Employee e: department)
   {
      if(e.getSalary() < 10000)
      {
         department.remove(e);
         break;
      }
   }
  
   }
}
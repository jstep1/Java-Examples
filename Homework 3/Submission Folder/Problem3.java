import java.util.Scanner;

public class Problem3
{

   public static void main(String[] args)
   
   {
   
   Scanner kbd = new Scanner(System.in);
   
   double y;
   
   double z;
   
   System.out.print("Employee Name: ");
   
   String x = kbd.nextLine();
   
   System.out.print("Enter hours worked: ");
   
   y = kbd.nextDouble();
   
   System.out.print("Enter pay rate: ");
   
   z = kbd.nextDouble();
   
   System.out.println("");
   
   System.out.println(x);

     if (y <= 40.0)
   
     {
     
     System.out.print("Regular Pay: " + (y * z));
     
     }
     
     else
     
     {
     
     System.out.println("Regular pay: " + (z * 40));
     
     System.out.println("Overtime pay: " + ((y - 40) * (z * 1.5)));
     
     System.out.println("Total pay: " + ((z * 40) + ((y - 40) * (z * 1.5))));
   

}
}   
}   
   
   
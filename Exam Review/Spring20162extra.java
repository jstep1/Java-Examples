import java.util.Scanner;

public class Spring20162extra

{

   public static void main(String[] args)
   
   {
      
      Scanner kbd = new Scanner(System.in);
   
      int a, b, c;
      
      System.out.print("Enter a: ");
      
      a = kbd.nextInt();
      
      System.out.print("Enter b: ");
      
      b = kbd.nextInt();
      
      System.out.print("Enter c: ");
      
      c = kbd.nextInt();
      
      int compare = Math.max((Math.max(a,b)), c);
      
      int count = 0;
      
      int arr[] = {a, b, c};
      
      for(int i = 0; i < 3; i++)
      
      {
      
         if(arr[i] == compare)
         
         {
         
            count++;
            
         }
         
      }
      
      System.out.println("");
      
      if(count == 1)
      
      {
      
      System.out.print("The largest integer " + compare + " was entered once.");
      
      }
      
      if(count == 2)
      
      {
      
      System.out.print("The largest integer " + compare + " was entered twice.");
      
      }
      
      if(count == 3)
      
      {
      
      System.out.print("The largest integer " + compare + " was entered three times.");
      
      }
         
   }
}
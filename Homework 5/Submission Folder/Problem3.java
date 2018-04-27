import java.util.Scanner;

public class Problem3

{

   public static void main(String[] args)
   
   {
   
   Scanner kbd = new Scanner(System.in);
   
   int x;
   
   int sum = 0;
   
   do
   
      {
   
      System.out.print("Enter an integer: ");
   
      x = kbd.nextInt();
      
      sum += x;
      
      }while (sum >= 1 && sum <= 50);
   
   System.out.println(sum);
   
   }
   
   }


   
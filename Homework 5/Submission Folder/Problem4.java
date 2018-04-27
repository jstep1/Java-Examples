import java.util.Scanner;

public class Problem4

{

   public static void main(String[] args)
   
   {
   
   int n;
   
   int abs;
   
   int sum = 0;
   
   Scanner kbd = new Scanner(System.in);
   
   System.out.print("Enter integer n: ");
   
   n = kbd.nextInt();
   
   abs = Math.abs(n);
   
   while (abs > 0)
   
   {
   
      sum = sum + abs % 10;
      
      abs = abs / 10;
      
   }
   
   System.out.println("");
   
   System.out.print("The sum of all digits of " + n + " is: " + sum);
   
   }
   
   }
   
   
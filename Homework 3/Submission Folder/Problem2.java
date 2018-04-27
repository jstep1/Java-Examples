import java.util.Scanner;

public class Problem2
{

   public static void main(String[] args)
   
   {
   
   Scanner kbd = new Scanner(System.in);
   
   int a;
   
   int b;
   
   System.out.print("Enter first integer: ");
   
   a = kbd.nextInt();
   
   System.out.print("Enter second integer: ");
   
   b = kbd.nextInt();
   
   System.out.println("");
   
   if (a % b == 0)
   
   {
   
   System.out.print(a + " is a multiple of " + b);
   
   }
   
   else
   
   {
   
   System.out.print(a + " is not a multiple of " + b);
   
   }
   
   }
   
   }   
   
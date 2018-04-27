import java.util.Scanner;

public class Problem1

{

   public static void main(String[] args)
   
   {
   
   Scanner kbd = new Scanner(System.in);
   
   int lower;
   
   int upper;
   
   System.out.print("Enter an integer for lower: ");
   
   lower = kbd.nextInt();
   
   System.out.print("Enter another integer for upper (greater than lower): ");
   
   upper = kbd.nextInt();
   
   System.out.print(getRandomNumber(lower, upper));
   
   }
   
   public static int getRandomNumber(int x, int y)
   
   {
   
   int howMany = y - x;
   
   int rand = (int)(Math.random() * howMany) + x;
   
   return rand;
   
   }
   
   }
  


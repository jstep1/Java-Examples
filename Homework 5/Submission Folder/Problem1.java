import java.util.Scanner;

public class Problem1

{

   public static void main(String[] args)
   
   {
   
   Scanner kbd = new Scanner(System.in);
   
   int x;
   
   int guess = 1;
   
   int rand = (int)(Math.random() * 100);
   
      System.out.println("I have a number between 1 and 100");
   
      System.out.println("");
   
   do
   
      {
     
      System.out.print("What is your guess: ");
   
      x = kbd.nextInt();
      
      if (x > rand)
   
      {
   
      System.out.println("Go lower!");
      
      guess++;
   
      }
      
      if (x < rand)
   
      {
   
      System.out.println("Go higher!");
      
      guess++;
      
      }
      
      }while (x != rand);
 
   System.out.println("You got it!");
   
   System.out.println("");
 
   if (guess != 1)
 
      {
      
         System.out.println("It took " + guess + " guesses.");
      
      }
 
   else
 
      {
   
         System.out.println("It took " + guess + "guess.");
     
      }
   
   }
   
}
   
   
   
   
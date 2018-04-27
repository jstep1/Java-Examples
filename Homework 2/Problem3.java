import java.util.Scanner;

public class Problem3

{

   public static void main(String[] args)
   
     {
     
      Scanner kbd = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      
      int i;
      
      i = kbd.nextInt();
      
      boolean i1 = i >= 20 && i <= 45;
      
      System.out.println("Number between 20 and 45? " + i1);
      
      System.out.println("");
      
      System.out.print("Enter an integer: ");
      
      int j;
      
      j = kbd.nextInt();
      
      boolean j1 = j >= 20 && j <= 45;
      
      boolean ij = (i >= 20 && i <= 45) && (j >= 20 && j <= 45);
      
      boolean ij1 = (i>= 20 && i <= 45) || (j >= 20 && j <= 45);
      
      boolean ij2 = (i>= 20 && i <= 45) ^ (j >= 20 && j <= 45);
      
      System.out.println("Number between 20 and 45? " + j1);
      
      System.out.println("");
      
      System.out.println("Both numbers between 20 and 45? " + ij);
      
      System.out.println("");
      
      System.out.println("At least one number between 20 and 45? " + ij1);
      
      System.out.println("");
     
      System.out.print("Only one number between 20 and 45? " + ij2);
     
      System.out.println("");
      
      }
      
}
      

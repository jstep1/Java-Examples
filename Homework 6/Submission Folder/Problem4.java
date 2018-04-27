import java.util.Scanner;

public class Problem4

{

   public static void main(String[] args)
   
   {
   
      Scanner kbd = new Scanner(System.in);
      
      int n, sum, tempA, tempB;
      
      do
   
      {
   
         System.out.print("Enter integer n greater than 10: ");
      
         n = kbd.nextInt();
      
      }while(n <= 10);
      
      System.out.println("");
      
      System.out.println("Before swap:");
      
      int[] arr = new int[n];
      
      for(int i = 0; i < arr.length; i++)
      
      {
      
         arr[i] = (int)(Math.random() * (75 - 2)) + 2;
         System.out.print(arr[i] + " ");
      
      }
      
      sum = arr[2] + arr[5] + arr[7] + arr[9];
      
      System.out.println("");
      System.out.println("Sum of elements at indexes 2, 5, 7 and 9 is: " + sum);
      System.out.println("");
      
      tempA = arr[2];
      arr[2] = arr[6];
      arr[6] = tempA;
      
      tempB = arr[4];
      arr[4] = arr[7];
      arr[7] = tempB;
      
      System.out.println("After swap: ");
      
      
      for(int i = 0; i < arr.length; i++)
      
      {
      
         System.out.print(arr[i] + " ");
      
      }
      
      sum = arr[2] + arr[5] + arr[7] + arr[9];
      
      System.out.println("");
      System.out.println("Sum of elements at indexes 2, 5, 7 and 9 is: " + sum);
      
   }
}

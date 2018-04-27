import java.util.Scanner;

public class Problem1

{

   public static void main(String[] args)
   
   {
   
      Scanner kbd = new Scanner(System.in);
   
      int n, max, min, last;
      double sum, avg;
   
      do
   
   {
   
         System.out.print("Enter integer n, greater than 0: ");
      
         n = kbd.nextInt();
      
   }while(n < 1);
    
    
    int[] nums = new int[n];
    
    System.out.print("Enter " + n + " integers: ");
         
    
    for(int i = 0; i < nums.length; i++)
    
      {
      
         nums[i] = kbd.nextInt();
    
      }
      
    System.out.println("");
    System.out.print("You entered: ");
    
    printArray(nums);
    
    System.out.println("");
    System.out.println("");
    
    max = nums[0];
    
    min = nums[0];
    
    for(int i = 0; i < nums.length; i++)
    
      {
      
         if (nums[i] > max)
      
         {
      
         max = nums[i];
      
         }
         
       }
    
    System.out.println("Maximum value: " + max);
    
    for(int i = 0; i < nums.length; i++)
    
      {
      
         if (nums[i] < min)
      
         {
      
         min = nums[i];
      
         }
         
       }
    
    System.out.println("Minimum value: " + min);
    
    sum = 0.0;
    
    for(int i = 0; i < nums.length; i++)
    
         {
      
         sum = sum + nums[i];
   
         }
    
    avg = sum / n;
      
    System.out.println("Average: " + avg);
    
    System.out.println("");
    
    System.out.println("Elements greater than average: ");
    
    
    for(int i = 0; i < nums.length; i++)
    
    {
      
      if(nums[i] > avg)
      
         {
      
         System.out.print(nums[i] + " ");
      
         }
      
    }
    
    System.out.println("");
    
    last = nums[n - 1];
    
    System.out.println("Elements greater than " + last +":");
    
    for(int i = 0; i < nums.length; i++)
     
    {
      
      if(nums[i] > last )
      
         {
         
         System.out.print(nums[i] + " ");
      
         }
      
    }
    
    System.out.println("");
    
    System.out.println("Array in reverse order: ");
    
    for(int i = n; i > 0; i--)
    
      {
    
      System.out.print(nums[i - 1] + " ");
      
      }
    
    System.out.println(" ");
    
   }
    
    
    
    
    public static void printArray(int[] aa)
    
    {
    
      for(int j = 0; j < aa.length; j++)
      
      {
      
         System.out.print(aa[j] + " ");
    
      }
      
    }
      
  }
      

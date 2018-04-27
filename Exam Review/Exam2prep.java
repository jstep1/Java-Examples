import java.util.Scanner;

public class Exam2prep

{

   public static void main(String[] args)
   
   {
      int[] a = {1,2,3,3,2};
      
      System.out.print(sumTwosSumThrees(a));
      
      
      
    
   }
   
   public static boolean sumTwosSumThrees(int[] arr)
{
 int sumTwos = 0;
 int sumThrees = 0;
 for(int i = 0; i < arr.length; i++)
 {
 if(arr[i] == 2)
 {
 sumTwos += 2;
 }
 if(arr[i] == 3)
 {
 sumThrees += 3;
 }
 }
 return (sumTwos > sumThrees);
}
}
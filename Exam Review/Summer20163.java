import java.util.Scanner;

public class Summer20163

{

   public static void main(String[] args)
   
   {
   
   int[] A = {2, 4, 6, 8, 23, 80};
   
   int[] B = {2, 4};
   
   System.out.print(howManyInCommon(A, B));
   
   }
   
   public static int howManyInCommon(int[] A, int[] B)
   
   {
   
   int common = 0;
   
   for(int i = 0; i < A.length; i++)
   
   {
   
      for(int j = 0; j < B.length; j++)
      
      {
      
         if (A[i] == B[j])
         
         {
         
         common++;
         
         }
         
      }
      
   }
   
   return common;
   
}

}
      
         
   
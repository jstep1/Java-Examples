public class Problem3

{

   public static void main(String[] args)
   
   {
   
   int arr[][] =  {{8, 9, 31}, 
                  {7, 23, 73, 24}, 
                  {13, 19}};
   
   linearize(arr);
   
   }
   
   public static int[][] linearize(int[][] arr)
   
   {
   
      int n = 0;
      
      int[][] oneD = new int[n][1];
   
      for(int row = 0; row < arr.length; row++)
      
      {
      
         for(int col = 0; col < arr[row].length; col++)
         
         {
         
            oneD[col] = arr[col];
            n++;
            
         }
         
         }
         
         return oneD;
         }
         }
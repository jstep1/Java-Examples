public class Problem4

{

   public static void main(String[] args)
   
   {
   
   int[][] x = {{8, 9, 31, 4, 29, 12},
               {7, 23, 73, 12, 6, 30},
               {13, 42, 42, 18, 5, 15},
               {4, 7, 32, 43, 15, 17}};
   
   int[][] y = {{32, 45, 67, 21, 3, 8},
               {12, 65, 23, 27, 12, 18},
               {19, 32, 14, 18, 19, 27},
               {39, 48, 29, 26, 32, 44},
               {17, 28, 37, 38, 22, 19}};
   
   mirror(x);
   mirror(y);
   
   }
   
  public static int[][] mirror(int[][] x)
  
     {
     
     int[][] mirror = x;
     
     for (int i=0; i< x.length; i++)
      
     {
     
      for (int j = 0; j < x.length / 2; j++) 
      
        {
        
        int[] temp = x[i];
        
        x[i] = x[x.length - 1 - i];
        
        x[x.length - 1 - i] = temp;
        
        }
        
       
     }
     
     for(int i = 0; i < x.length; i++)
     
     {
     
        for(int j = 0; j < x.length; j++)
     
          {
          
          System.out.print(x[i][j] + " ");
      
          }
          
          System.out.println("");
     
      }
      
     return mirror;

}

}


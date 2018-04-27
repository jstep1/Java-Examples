import java.util.Scanner;

public class Problem2

{

   public static void main(String[] args)
   
   {
   
      Scanner kbd = new Scanner(System.in);
      
      int n;
      
      do
      
      {
      
         System.out.print("Enter an odd integer that is greater than or equal to 5: ");
         
         n = kbd.nextInt();
         
      }while(n < 5 || n % 2 == 0);
      
   System.out.println("");
   
   boxWithMinorDiagonal(n);
   
   System.out.println("");
   
   rightTriangle(n);
   
   System.out.println("");
   
   printNLetter(n);
   
   System.out.println("");
   
   fancySquare(n);
   
   System.out.println("");
   
   plusInSquare(n);
   
      
   }
   
   
   
   public static void boxWithMinorDiagonal(int n)
   
   {
   
      for(int row = 1; row <= n; row++)
      
      {
   
         for(int col = 1; col <= n; col++)
      
         {
      
            if(col == 1 || col == n || row == 1 || row == n)
         
               System.out.print("*");
               
            else if((n - row + 1) == col)
            
               System.out.print("+");
      
            else
         
               System.out.print(" ");
            
         }
         
         System.out.println();
         
      }
   }
   
   
   
   public static void rightTriangle(int n)
   
   {
   
      for(int row = 1; row <= n; row++)
      
      {
      
         for(int col = 1; col <= n; col++)
         
         {
         
            if(col == 1 || row == n || row == col)
            
               System.out.print("*");
               
            else
            
               System.out.print(" ");
               
         }
      
      System.out.println("");
   
   }
  
  }
  
  
  
   public static void printNLetter(int n)
   
   {
   
      for(int row = 1; row <= n; row++)
      
         {
         
          for(int col = 1; col <= n; col++)
         
            {
            
            if(col == 1 || col == n || row == col)
            
               System.out.print("*");
               
            else
            
               System.out.print(" ");
               
            }
      
      System.out.println("");
   
   }
  
  }
  
  
  
  public static void fancySquare(int n)
  
  {
   
      for(int row = 1; row <= n; row++)
      
      {
   
         for(int col = 1; col <= n; col++)
      
         {
      
            if((col == 1 || col == n || row == n || row == 1 || (row == 1 && col != 1) || (row == 1 && col != n) || (row == n && col != 1) || (row == n && col != n))) 
         
               System.out.print("*");
               
            else if((n - row + 1) == col || (col == row) || col/2 +1 != row/2 + 1)
            
               System.out.print("+");
            
            else if((n - (col/2) + 1 ==  n - (row/2) + 1) && row == col)
            
               System.out.print("@");
      
            else
         
               System.out.print(" ");
            
         }
         
         System.out.println();
         
      }
  
  }    
  
  
   public static void plusInSquare(int n)
  
   {
   
      for(int row = 1; row <= n; row++)
      
      {
      
         for(int col = 1; col <= n; col++)
         
         {
         
            if(col == 1 || col == n || row == 1 || row == n)
         
               System.out.print("X");
               
            else if(row == n/2 + 1 || col == n/2 + 1)
            
               System.out.print("+");
      
            else
         
               System.out.print(".");
               
         }
      
      System.out.println("");
   
   }
  
  } 
  }
import java.util.Scanner;

public class Problem1

{

   public static void main(String[] args)
   
   {
   
      Scanner kbd = new Scanner(System.in);
      
      int n;
      
      do
      
         {
         
            System.out.print("Enter an integer n greater than 0: ");
            
            n = kbd.nextInt();
            
          }while(n <= 2);
     
      for(int i=0; i <= n; i++)
      
         {
         
            for(int j=0; j <= n; j++)
            
            {
            
               System.out.print("(" + i + "," + j + ")");
          
            }
            
               System.out.println("");
          
          }
          
          }
          
          }
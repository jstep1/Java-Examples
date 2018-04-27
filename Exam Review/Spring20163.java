import java.util.Scanner;

public class Spring20163

{

   public static void main(String[] args)
   
   {
   
   char[] x = {'e', 'a', 's', 'y'};
   
   doubleVowels(x);
   
   for(int i = 0; i < x.length; i++)
   
   {
   
      System.out.print(x[i] + " ");
 
   }
   
   }
   
   public static char[] doubleVowels(char[] x)
   
   {
   
      int n = x.length;
   
      for(int i = 0; i < x.length; i++)
      
      {
      
         if (x[i] == 'a')
         
         {
         
            n++;
            
         }
         
         if (x[i] == 'e')
         
         {
         
            n++;
            
         }
         
         if (x[i] == 'i')
         
         {
         
            n++;
            
         }
         
         if (x[i] == 'o')
         
         {
         
            n++;
            
         }
         
         if (x[i] == 'u')
         
         {
         
            n++;
            
         }
         
      }
      
      
      char[] y = new char[n];
      
      for(int i = 0; i < y.length; i++)
      
      {
      
         for(int j = 0; j < x.length; j++)
         
         {
      
         if (x[j] == 'a')
         
         {
         
            y[i + 1] = x[j];
            i++; 
            
         }
         
         if (x[j] == 'e')
         
         {
         
            y[i + 1] = x[j];
            i++; 
            
         }
         
         if (x[j] == 'i')
         
         {
         
            y[i + 1] = x[j];
            i++; 
            
         }
         
         if (x[j] == 'o')
         
         {
         
            y[i + 1] = x[j];
            i++; 
            
         }
         
         if (x[j] == 'u')
         
         {
         
            y[i + 1] = x[j];
            i++; 
            
         }
         
         }
      
      }
      
     
      return y;  
          
      }
      
      }
      
     
            
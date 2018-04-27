public class Problem1

{

   public static void main(String[] args)
   
   {
     
      
      char[][] answers = {{'A', 'D', 'B', 'A', 'B', 'E', 'A', 'D', 'E', 'B'},
                          {'B', 'C', 'E', 'C', 'E', 'E', 'E', 'D', 'E', 'B'},
                          {'A', 'B', 'D', 'E', 'A', 'D', 'C', 'D', 'A', 'B'},
                          {'B', 'B', 'D', 'E', 'B', 'E', 'C', 'C', 'A', 'D'},
                          {'A', 'B', 'D', 'E', 'C', 'A', 'B', 'D', 'E', 'C'},
                          {'A', 'B', 'D', 'E', 'D', 'C', 'E', 'B', 'C', 'E'},
                          {'B', 'D', 'E', 'C', 'A', 'D', 'B', 'E', 'B', 'B'},
                          {'C', 'D', 'D', 'C', 'B', 'E', 'A', 'D', 'E', 'B'},
                          {'B', 'D', 'E', 'A', 'B', 'D', 'E', 'A', 'C', 'D'},
                          {'B', 'E', 'E', 'A', 'A', 'E', 'A', 'B', 'E', 'B'},
                          {'B', 'D', 'E', 'A', 'B', 'D', 'E', 'D', 'E', 'B'},
                          {'B', 'D', 'E', 'C', 'B', 'E', 'B', 'D', 'C', 'E'}};
                          
      char[] key = {'B', 'D', 'E', 'A', 'B', 'E', 'E', 'D', 'E', 'B'};
      
      
      numberOfStudentsPassed(answers, key);
      
                
      
   }
   
   public static char[][] numberOfStudentsPassed(char[][] answers, char[] key)   
   
   {
      
      int passed = 0;
      
      for(int row = 0; row < answers.length; row++)
      
      {
         
         int correct = 0;
      
         for(int col = 0; col < key.length; col++)
         
         {
         
            if(answers[row][col] == key[col])
            
            {
               
               correct++;
               
            }
            
         }
         
         if(correct >= 6)
      
            {
      
               passed++;
               
            }
            
      }     
       
     System.out.print(passed);
     
     return answers; 

   }
   
}         
   
   
   
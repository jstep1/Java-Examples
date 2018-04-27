public class Problem3

{

   public static void main(String[] args)
   
   {
      
      int [] arr;
      int temp;
      
      arr = new int[10];
      
      arr[0] = 2;
      arr[1] = 3;
      arr[2] = 9;
      arr[3] = 17;
      arr[4] = 32;
      arr[5] = 40;
      arr[6] = 73;
      arr[7] = 40;
      arr[8] = 21;
      arr[9] = 10;
      
      
      System.out.println("Before shifting: ");
      
      for(int i = 0; i < arr.length; i++)
      
      {
      
         System.out.print(arr[i] + " ");
         
      }
      
      System.out.println(" ");
      System.out.println(" ");
      
      System.out.println("After shifting: ");
      
      temp = arr[0];
      
      for(int i=0; i<arr.length-1; i++)
      
         { 
      
         arr[i] = arr[i+1];
         System.out.print(arr[i] + " ");
      
         }
      
      System.out.println(temp);
      
   }
}
      
   


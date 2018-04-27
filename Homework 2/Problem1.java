import java.util.Scanner;

public class Problem1

{

   public static void main(String[] args)
   
     {
     
      Scanner kbd = new Scanner(System.in);
      
      int length;
      
      int width;
      
      System.out.print("Enter the length: ");
      
      length = kbd.nextInt();
      
      System.out.print("Enter the width: ");
      
      width = kbd.nextInt();
      
      int perimeter = (2 * length) + (2 * width);
      
      int area = length * width;
      
      System.out.println("The perimeter is: " + perimeter);
      
      System.out.print("The area is: " + area);
      
      
      }
      
}
import java.util.Scanner;

public class Problem1

{

   public static void main (String[] args)
   
   {
   
   Scanner kbd = new Scanner(System.in);
   
   int x;
   
   int y;
   
   int z;
   
   boolean u = false;
   
   if(u == false)
   
      {
      
      System.out.println("Something");
      
      }
      
      else
      
      {
      
      System.out.println("Everything");
      }
   
   x = kbd.nextInt();
   
   System.out.print("Enter y: ");
   
   y = kbd.nextInt();
   
   System.out.print("Enter z: ");
   
   z = kbd.nextInt();
   
   
   if (x > y && x > z && y > z)
   
   {
   
   System.out.println("Largest number: " + x);
   
   System.out.println("Middle number: " + y);
   
   System.out.println("Smallest number: " + z);
  
   
   if (y + z > x)
   
   {
   
   System.out.println("");
   
   System.out.println("Triangle");
   
   
   
   if ((y*y) + (z*z) == (x*x))
   
   { 
   
   System.out.println("Also, it's a right triangle");
   
   }
   
   }
   
   else
   
   {
   
   System.out.println("");
   
   System.out.println("Can't construct a triangle");
   
   }
   
   }
      
   
   if (x > z && x > y && z > y)
   
   {
   
   System.out.println("Largest number: " + x);
   
   System.out.println("Middle number: " + z);
   
   System.out.println("Smallest number: " + y);
   

   if (z + y > x)
   
   {
   
   System.out.println("");
   
   System.out.println("Triangle");
   
   
   
   if ((z*z) + (y*y) == (x*x))
   
   {
   
   System.out.println("Also, it's a right triangle");

   }
   
   }
   
   else 
   
   {
   
   System.out.println("");
   
   System.out.println("Can't construct a triangle");
   
   }
   
   }

   
   if (y > x && y > z && x > z)
   
   {
   
   System.out.println("Largest number: " + y);
   
   System.out.println("Middle number: " + x);
   
   System.out.println("Smallest number: " + z);
   

   if (x + z > y)
   
   {
   
   System.out.println("");
   
   System.out.println("Triangle");
   
   
   
   if ((x*x) + (z*z) == (y*y))
   
   {
   
   System.out.println("Also, it's a right triangle");

   }
   
   }
   
   else
   
   {
   
   System.out.println("");
   
   System.out.println("Can't construct a triangle");
   
   }
   
   }
   
   
   if (y > z && y > x && z > x)
   
   {
   
   System.out.println("Largest number: " + y);
   
   System.out.println("Middle number: " + z);
   
   System.out.println("Smallest number: " + x);
   

   if (z + x > y)
   
   {
   
   System.out.println("");
   
   System.out.println("Triangle");
   
   
   if ((z*z) + (x*x) == (y*y))
   
   {
   
   System.out.println("Also, it's a right triangle");

   }
   
   }
   
   else
   
   {
   
   System.out.println("");
   
   System.out.println("Can't construct a triangle");
   
   }
   
   }
   
   
   if (z > y && z > x && y > x)
   
   {
   
   System.out.println("Largest number: " + z);
   
   System.out.println("Middle number: " + y);
   
   System.out.println("Smallest number: " + x);


   if (y + x > z)
   
   {
   
   System.out.println("");
   
   System.out.println("Triangle");
   
   
   if ((y*y) + (x*x) == (z*z))
   
   {
   
   System.out.println("Also, it's a right triangle");

   }
   
   }
   
   else
   
   {
   
   System.out.println("");
   
   System.out.println("Can't construct a triangle");
   
   }
   
   }
   
   
   if (z > x && z > y && x > y)
   
   {
   
   System.out.println("Largest number: " + z);
   
   System.out.println("Middle number: " + x);
   
   System.out.println("Smallest number: " + y);
   

   if (x + y > z)
   
   {
   
   System.out.println("");
   
   System.out.println("Triangle");
   
   
   if ((x*x) + (y*y) == (z*z))
   
   {
   
   System.out.println("Also, it's a right triangle");
   
   }
   
   }
   
   else
   
   {
   
   System.out.println("");
   
   System.out.println("Can't construct a triangle");
   
   }

}

}

}

public class Problem2
{
 public static double methodA(double a, double b)
 {
 a *= 2;
 b += 0;
 return 3 * a + b / 2;
 }
 public static int methodB(int a, int b)
 {
 int r;
 System.out.println("Method practice!");
 if(12 > a)
 {
 r = 3;
 System.out.println("What's the purpose of methodC?");
 }
 else if(a % 2 == 0)
 {
 r = 222;
 }
 else
 {
 r = 3 * a;
 }
 return r;
 }
 public static void methodC()
 {
 System.out.println("I print Hi");
 }
 public static void methodD()
 {
 System.out.println("I print Bye");
 }
 public static void main(String[] args)
 {
 int x = 22, y = 8, k = 29;
 double z = 7;
 System.out.print("METHODS ");
 System.out.println(methodB(y, k));
 methodC();
 System.out.println(methodA(10, 25));
 System.out.println(methodA(x, z));
 System.out.println(methodB(x, (int)4.5));
 methodD();
 }
}
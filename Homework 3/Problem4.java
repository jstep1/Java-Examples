public class Problem4
{
 public static void main(String[] args)
 {
 int a, b, c = 3;
 double x;
 x = 15;
 a = 17;
 b = 30;
 if ( a + b * 2 > 47 )
 {
 System.out.print(a + b);
 System.out.println(" equals 47");
 }
 else
 {
 System.out.print("47 < " + a + "+" + b + "!!!");
 System.out.println(a + b * 10);
 c = 3 + 4 * 10 - 2;
 }
 System.out.println(c);
 System.out.println(30 / 7);
 System.out.println( (double)30/8 );
 System.out.println( 30 % 7 );
 System.out.println( 7 / 30 );
 System.out.println( 7 % 30 );
 a = 100 + 20 / 2 * 5;
 System.out.println(a);
 if(a < 100)
 {
 System.out.println( "a is " + a );
 }
 else if(a > 100)
 {
 System.out.println( "b is " + b );
 System.out.println( "Bye!" );
 }
 else if(a == 150)
 {
 System.out.println( x / 4 );
 }
 }
}
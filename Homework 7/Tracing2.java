public class Tracing2
{
 public static void main(String[] args)
 {
 int k = 109;
 do
 {
 for(int i = 3; i < 9; i = i * 2)
 {
 if(k % i == 3)
 k = k / 3;
 else
 k = k / 2;
 }
 System.out.println(k);
 }while(k > 0);

 for(int i = 0; i < 2; i++)
 {
 for(int j = 0; j < 2; j++)
 {
 for(int m = 0; m < i * 2; m++)
 {
 if(m == j && m == i)
 {
 System.out.println("i: " + i);
 System.out.println("j: " + j);
 System.out.println("m: " + m);
 }
 }
 }
 }
 }
}
public class Problem2
{
 public static void main(String [] args)
 {
 int [][] scores = {{5, 7, 3, 4, 1},
 {12, 8, 73, 23, 6}};

 int [][] data = {{5, 7, 3, 4, 1},
 {12, 8, 73, 23, 6},
{436, 94, 99, 17, 70}};
 whatsTheOutputA(scores);
 whatsTheOutputB(data);
 whatsTheOutputA(scores);
 System.out.println("Done!!!");
 }
 public static void whatsTheOutputA(int[][] a)
 {
 int i, j;

 for(i = 0; i <= a.length - a.length; i++)
 {
 for(j = i; j < a[i].length - 1; j++)
 {
 a[i][a[i].length - 1] = a[i][j] + a[i][a[i].length - 1];
 System.out.print(a[i][a[i].length - 1] + " ");
 }
 System.out.println();
 }
 }
 public static void whatsTheOutputB(int[][] a)
 {
 for(int i = 0; i < a.length; i++)
 {
 for(int j = 0; j < a[i].length; j++)
 {
 if(i == j)
 {
 System.out.print(a[i][j] + " ");
 }
 }
 }
 System.out.println();
 }
}
import java.util.*;
public class Factorial 
{
  public static void main(String[] args) 
  {
   int n,i;
   int fact = 1;
   Scanner in = new Scanner(System.in);
   System.out.println("Ente a number:");
   n = in.nextInt();
   for (i = 1; i <= n; i++) 
   {
      result = result * i;
   }
    System.out.println("The factorial of" +n+ "is: " + result);
  }
}

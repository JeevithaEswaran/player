import java.util.*;
class ReverseString
{
  public static void main(String args[])
  {
    String s1, s2 = "";
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string to reverse");
    s1 = in.nextLine();
    int length = s1.length();
    for ( int i = length - 1 ; i >= 0 ; i-- )
    s2 = s2 + s1(i);
    System.out.println("Reverse of entered string is: "+s2);
   }
}

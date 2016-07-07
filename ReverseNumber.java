import java.io.*;
import java.util.Scanner;

class ReverseNumber
{
public static void main(String args[])
{
int n,rev=0,rem=0,n1;
System.out.println("Enter a number :");
Scanner in=new Scanner(System.in);
n=in.nextInt();
n1=n;
while(n!=0)
{
rem=n%10;
rev=rev+rem*10;
n=n/10;
}
System.out.println("The reversed number of" +n1+ "is:" +rev);
}
} 

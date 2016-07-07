#include<stdio.h>
#include<conio.h>
void main()
{
int n1,n2,count,i,j,rem=0;
clrscr();
printf("\nEnter first and last number : ");
scanf("\n%d\t%d",&n1,&n2);
printf("\nThe prime numbers between %d and %d:",n1,n2);
for(j=n1;j<=n2;j++)
{
count=0;
for(i=2;i<=j/2;i++)
{
  rem=j%i;
  if(rem==0)
    {
    count++;
    break;
    }
}
if(count==0&&j!=1)
  printf("\n%d",j);
}
getch();
}

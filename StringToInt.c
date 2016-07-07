#include<stdio.h>
#include<conio.h>
int stringToInt(char[]);
void main()
{
    char str[10];
    int n;
    clrscr();
    printf("Enter any integer as a string: ");
    scanf("%s",str);
    n=stringToInt(str);
    printf("Equivalent integer value: %d",n);
    getch();
}
int stringToInt(char str[])
{
    int i=0,sum=0;
    while(str[i]!='\0')
    {
	 if(str[i]< 48 || str[i] > 57)
	 {
	     printf("Unable to convert it into integer.\n");
	     return 0;
	 }
	 else
	 {
	     sum = sum*10 + (str[i] - 48);
	     i++;
	 }
    }
    return sum;
}

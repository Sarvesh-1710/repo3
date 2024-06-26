import java.util.*;
class Maxielement
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int i,temp;
System.out.println("Enter the array");
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
int max=a[0];
for(i=0;i<5;i++)
{
if(a[i]>max)
{
temp=max;
max=a[i];
a[i]=max;
}
}
System.out.println("Largest number is "+max);
}
}
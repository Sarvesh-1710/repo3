import java.util.*;
class F5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of month");
int m=sc.nextInt();
System.out.println("Enter the year");
int year=sc.nextInt();
if(m==2)
{
	if(year%4==0)
	{
		System.out.println("28 days");
	}
	else
	{
		System.out.println("29 days");
	}
}
if(m%2==0 && m!=2)
{
	System.out.println("30 days");
}
if(m%2!=0 && m!=2)
{
	System.out.println("31 days");
}
}
}


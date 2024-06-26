import java.util.*;
class Alphabate
{
public static void main(String args[])
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the Character");
	char c=sc.next().charAt(0);
	if(c>='A' && c<='Z' || c>='a' && c<='z')
	{
		System.out.println("Alphabate");
	}
	else
	{
		System.out .println("Not a Alphabate");
	}
}
}
	
	
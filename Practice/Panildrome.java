import java.util.*;
class Panildrome
{
public static void main(String args[])
	{
	int n,r,sum=0,temp;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the Number");
	n=sc.nextInt();
	temp=n;
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("Panildrome Number");
	}
	else
	{
		System.out.println("Not Panildrome Number");
	}
	
}
}
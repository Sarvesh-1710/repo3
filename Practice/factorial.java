import java.util.*;
class factorial
{
public static void main(String  args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the any no");
	int n=sc.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("The factorial "+n+" is "+fact);
	}
}

import java.util.*;
class Numpattern1
{
public static void main(String args[])
	{
	int i,j,n,number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of rows");
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
	number=n;
	for(j=0;j<=i;j++)
{

System.out.print(number+" ");
number--;
}
System.out.println("");
}
}
}

	
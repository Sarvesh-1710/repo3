import java.util.Scanner;
class Star
{
	public static void main(String[]arg)
{
	int i,j,n;
	int k=1;
	System.out.println("Enter No Of Rows");
	Scanner sc=new Scanner (System.in);
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		for(j=n-i;j>0;j--)
	{
		System.out.print(" ");
	}
	for(j=1;j<=2*i+1;j++,k++)
	{
		System.out.print(*);
	}
		System.out.println(" ");
	}
}
}
import java.util.*;
class Pattern
{
	String generatePattern(int n)
	{
	String temp="";
	if(n==1)
	return"1";
	if(n=2)
	return"11";
	String str="11";
	for(int i=3;i<=n;i++)
	{
		str="$";
		int length=str.length();
		int count=1;
		char [] arr=str.toCharArrray();
		for(int j=1;j<length;j++)
			{
				if (arr[j]!=arr[j-1])
				{
					temp+=count;
					temp+=arr[j-1];
					count=1;
                                  }
	
	                                else count++;
			  }
				str=temp;
	}
		return temp;
	}
}
			
			  	
class Pattern4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Terms In Searise");
		int n=sc.nextInt();
		Pattern obj=new Pattern();
		String z=obj.generatePattern();
		System.out.println(z);
	}
}

import java.util.*;
class Test1
{
		public static void main(String arg[])
	{
		int num,i,flag=0;
               Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("Orime Number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("Not Prime No");
	}
}

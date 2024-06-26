
import java.util.Scanner;
class array
{
	public static void main(String args[])
{
	int a[]=new int [5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	int ele;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Element");
	ele=sc.nextInt();
	int i;
	for(i=0;i<5;i++)
	{
		if(a[i]==ele)
		{
			System.out.println("Element is found at position "+(i) );
break;
}
}
}
}

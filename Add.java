import  java.util.Scanner;
class addition
{	
	void sum()

       {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First No");
		x=sc.nextInt();
		System.out.println("Enter Second No");
		y=sc.nextInt();
		z=x+y;
		System.out.println("Sum="+z);
}
}
// Execution
	class Add
	{
		public static void main(String arg[])
	{
		addition obj=new addition();
		obj.sum();
	}
} 
abstract class Employee
{
	abstract void show();
}
class Rahul extends Employee
{
	void show()
	{
		System.out.println("Employee Name:Rahul");
	}
}
class Neha extends Employee
{
	void show()
	{
		System.out.println("Employee Name:Neha");
	}
}
class Abstraction2
{
	public static void main(String args[])
	{
		Rahul R=new Rahul();
		Neha N=new Neha();
		R.show();
		N.show();
	}
}
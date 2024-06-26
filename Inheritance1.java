import java.util.*;
class Salary
{
void show()
{
	System.out.println("Employee Salary is 40000");
	System.out.println("Bonus:10000");
}
}
class bonus extends salary
{
	
}
class Q1
{
	public static void main(String args[])
	{
	bonus obj=new bonus();
	obj.show();
	}
}
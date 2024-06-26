interface Sample
{
	public int x=10;
	public int y=20;
	public void show();
	public void display();

}
class Myclass implement Sample
{
public  void show()
	{
	System.out.println("First method implemented");
	}
	public void display()
	{
	System.out.println("Second method implemented");
	}
	
}
class interface
{
public static void main(String args[])
{
	Myclass obj=new Myclass();
	System.out.println(obj.x);
	System.out.println(obj.y);
	obj.show();
	obj.display();
}
}
	
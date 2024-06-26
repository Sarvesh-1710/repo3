
class Sample
{
	void display()
	{
		System.out.println("This Is Encapsulated Method.....");
	}
	void getDisplay()
	{
		display();
	}
}

class encapsulation2
{ 
	public static void main(String args[])
	{
		Sample obj=new Sample();
		obj.getDisplay();
	}
}
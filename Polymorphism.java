class Animal
{
	void show()
	{
		System.out.println("Im an Animal");
	}
}
class Tiger extends Animal
{
	void show ()
	{
		System.out.println("My name is Tiger");
	}
}
class Elephant extends Animal
{
	void show()
	{
		System.out.println("My name is Elephant");
	}
}
class Polymorphism
{
	public static void main(String args[])
	{
		Tiger obj1=new Tiger();
		obj1.show();
		Elephant obj2=new Elephant();
		obj2.show();
	}
}
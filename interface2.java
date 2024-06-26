interface Vehicle 
{
public void price();
}
interface Car extends Vehicle
{
}
class HondaCity implements Car
{
	public void price ()
	{
	System.out.println("Price:Rs 10 Lakh");
	}
}
class interface2
{
public static void main(String args[])
{
	HondaCity obj=new HondaCity();
	obj.price();
}
}

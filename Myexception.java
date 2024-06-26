class MyException extends Exception
{
}
class Myexception
{	
	public static void main(String args[])
	{
	try
	{
		throw new MyException();
	}
catch(MyException e)
	{
	System.out.println(e);
	}
}
}
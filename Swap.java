class Swap
{	
	public static void main(String arg[])
	{
		int x=9;
		int y=8;
		y=x+y-(x=y);
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
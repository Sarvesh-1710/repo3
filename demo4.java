class Thread1 extends Thread
{
}
class demo4
{
	public static void main(String args[])
	{
	Thread t1=new Thread1();
	t1.setName("First_Thread");
	System.out.println(t1.getName());
	}
}
	
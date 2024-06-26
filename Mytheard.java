class Thread1 extend Thread
{
	public void run()
	{
	System.out.println("First Thread Started..");
	}
}
class Thread2 extend Thread
{
	public void run()
	{
	System.out.println("Second Thread Started..");
	}
}
class Multithread
{
	public static void main(String args[])
	{
		Thread t1=new Thread();
		t1.start();
		Thread t2=new Thread();
		t2.start();
	
	}
}
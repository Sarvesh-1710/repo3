class Thread1 extends Thread
{
	public void run()
	{
	System.out.println("First Thread Started..");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
	System.out.println("Second Thread Started..");
	}
}
class Mythread
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
	
	}
}
class Thread1 implements Runnable
{
	public void run()
	{
	System.out.println("Thread Started Successfully ");
	}
}
class thread4
{
	public static void main(String args[])
	{
	Thread t1=new Thread1();
	Thread t2=new Thread(t1,"Second_Thread");
	t2.start();
	System.out.println(t2.getName());
	}
}
	
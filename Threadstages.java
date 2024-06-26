class Thread1 extends Thread
{
public void run()
	{
	System.out.println("First Thread ");
	}
}
class Threadstages
{
	public static void main(String args[])throws InterruptException
	{
	Thread t1=new Thread();
	System.out.println("Thread State:"+t1.getState());
	t1.start();
	System.out.println("Thread State:"+t1.getState());
	t1.sleep(10000);
	System.out.println("Thread State:"+t1.getState());


	
	}
}
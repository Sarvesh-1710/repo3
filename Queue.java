import java.util.*;
class Queue
{
	public static void main(String args[])
	{
	PriorityQueue q=new PriorityQueue();
	q.add(10);
	q.add(20);
	q.add(30);
	q.add(40);
	System.out.println(q);
	q.remove(q);
	q.remove(q);
	System.out.println(q);
	}
}
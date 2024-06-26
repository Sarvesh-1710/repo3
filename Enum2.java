import java.util.*;
enum Level
{
	LOW,
	HIGH,
	MEDIUM;
}
class Enum2
{
public static void main(String args[])
{	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Input");
	String z=sc.next();
	Level k=Level.HIGH;
	switch(k)
	{
	case LOW:
	System.out.println("This Is Low Input");
	break;
	case HIGH:
	System.out.println("This Is High Input");
	break;
	case MEDIUM:
	System.out.println("This Is Medium Input");
	break;
	}
	
	}
}
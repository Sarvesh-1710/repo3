enum Level
{
	LOW,
	HIGH,
	MEDIUM;
}
class Enum1
{
public static void main(String args[])
{	
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
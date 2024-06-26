import java.util.*;
class Removevowels
{
	public static void main(String args[])
	{
	String z="WELCOME";
	String regex="[a,e,i,o,u,A,E,I,O,U]";
	String k=z.replaceAll(regex," ");
	System.out.print(k);
	}
}
	
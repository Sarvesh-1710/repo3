import java.util.*;
class p1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char c=s.charAt(0);
		System.out.println("Enter the Character");
		char z=sc.next().charAt(0);
		String k=Character.toString(z);
		System.out.println("Character : "+c);
		System.out.println("String : "+k);
	}
}

class p2
{
public static void main(String args[])
{
String C="123454321";
C=C.toLowerCase();
String rev="";
for(int i=C.length()-1;i>=0;i--)
{
rev=rev+C.charAt(i);
}
if(C.equals(rev))
{
System.out.println("Palindrome String ");
}
else
{
System.out.println("not palindrome String");
}
}
}
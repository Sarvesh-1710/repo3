class Reverse 
{
	public static void main(String args[])
	{
	String Z="Welcome In java";
        String Z1[]=Z.split(" ");
	int n=Z1.length;
	for(int i=n-1;i>=0;i--)
	{
		System.out.print(Z1[i]+" ");
	}
}
}
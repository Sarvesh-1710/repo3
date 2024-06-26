class Pattern7
{
	public static void main(String args[])
	{
	String z="HELLO";
	char[] arr=z.toCharArray();
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<=i;j++)
	{
	System.out.print(arr[j]+" ");
	}
	System.out.println(" ");
	}
	}
}
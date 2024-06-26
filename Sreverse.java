class Sreverse
{
	public static void main(String[]args)
	{
		String A="Welcome in Java";
		int n=A.length();
		char[]arr=A.toCharArray();
		int start=0;
		int end=n-1;
		char temp;
		while(start<end)
		{
			temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
	
		System.out.println(arr);
	}
}

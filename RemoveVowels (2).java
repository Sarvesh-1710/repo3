class RemoveVowels
{
	public static void main(String args[])
	{
		String Z="Java Language Is Easy To Learn";
		String regex="[a,e,i,o,u,A,E,I,O,U]";
		String k=Z.replaceAll(regex," ");
		System.out.print(k);
	}
}

		
	
class Nonrepeting
{
public static void main(String args[])
{
	String c="Happiness";
	int count;
	char word[]=c.toCharArray();
	System.out.println("Repeating Character");
	for(int i=0;i<word.length;i++)
	{
	count=1;
	for(int j=i+1;j<word.length;j++)
	{
	if(word[i]==word[j])
	{
		count++;
		word[j]=0;
	}
	}
	if (count>1 && word [i]!=0)
	System.out.println(word[i]);
	}
}
}
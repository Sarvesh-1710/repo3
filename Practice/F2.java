import java.io.*;
class F2
{
public static void main(String ags[])throws FileNotFoundException,IOException
{
	FileInoutStream f1=new FileInputStream("xyz.txt");
	int k=0;
	if(k==0)
	{
		while(k!=-1)
		{
			k=f1.read();
			System.out.println((char)k);
		}
		System.out.println();
		System.out.println("Readable");
		}
		else
		{
			System.out.println("Not Readable");
		}
	}
}


import java.io.*;
class Filereader
{
	public static void main(String[]arg)throws
	FileNotFoundException,IOException
	{
		int k=0;	
		FileInputStream fin=new FileInputStream("File.txt");
		while(k!=-1)
		{
			k=fin.read();
			System.out.print((char)k);
		}
	}
}

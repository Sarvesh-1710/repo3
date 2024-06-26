import java.io.*;
class filereader1
{
public static void main(String args[])throws
FileNotFoundException,IOException
{
int k=0;
FileInputStream fin=new FileInputStream("txt2.txt");
while(k!=-1)
{
k=fin.read();
System.out.print((char)k);
}
}
}
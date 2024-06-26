import java.io.*;
class transfer3
{
public static void main(String args[])throws IOException
{
FileReader fread=new FileReader("ac.txt");
FileWriter fout=new FileReader("ad.txt");
int k=0;
while(k!=-1)
{
k=fread.read();
fout.write((char)k);
}
System.out.print((char)k);
}
}
}
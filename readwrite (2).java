import java.io.*;
class readwrite
{
public static void main(String args[])throws FileNotFoundException,IOException
{
int k=0;
FileInputStream fin=new FileInputStream("pqr.txt");
FileOutputStream fout=new FileOutputStream("lmn.txt");
while(k!=-1)
{
k=fin.read();
fout.write((char)k);
}
fout.close();
}
}

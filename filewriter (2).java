import java.io.*;
class filewriter
{
public static void main(String args[])throws
FileNotFoundException,IOException
{
FileOutputStream obj=new FileOutputStream("file1.txt");
byte b[]={'H','e','l','l','o'};
obj.write(b);
obj.close();
}
}
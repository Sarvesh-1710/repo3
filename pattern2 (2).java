import java.util.*;
class pattern2
{
public static void main(String args[])
{
int i,j,n;
int k=1;
System.out.println("Enter no.of rows");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=n-i;j>0;j--)
{
System.out.print(" ");
}
for(j=0;j<2*i+1;j++,k++)
{
System.out.print(k);
}
System.out.println(" ");
}
}
}


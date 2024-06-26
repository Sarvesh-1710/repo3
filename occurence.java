import java.util.*;
class occurence
{
public static void main(String args[])
{
int arr[]={1,2,3,2,3,5,4,3,4,5};
int n=arr.length;
int c=0;
int k;
Scanner sc= new Scanner(System.in);
System.out.println("Enter to find key");
k=sc.nextInt();
for(int i=0;i<n;i++)
{
if(k==arr[i])
{
c++;
}
}
System.out.println(c);
}
}

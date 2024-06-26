class revesearray
{
public static void main(String args[])
{
int arr[]={10,20,30,40,50,60};
int n=arr.length;
int start=0;
int end=n-1;
int temp;
while(start<end)
{
temp=arr[end];
arr[end]=arr[start];
arr[start]=temp;
start++;
end--;
}
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
}
}
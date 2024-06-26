import java.util.Scanner;
class F4
{
  public static void main(String[] args) 
{
   
    int year;
	year=2020;
    String x,y,z;
x=(year%400==0)?"leap year":"Not a leap year";
y=(year%4==0)?"leap year":"Not a leap year";
z=(year%100==0)?x:y;
System.out.println(z);
}
}                
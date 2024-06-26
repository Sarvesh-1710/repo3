class Student
{
	int rollno;
	String name;
	Student (int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
}
class constructor1
{
	public static void main(String args [])
	{
		Student obj1=new Student(101,"Aditya");
		Student obj2=new Student(102,"Pratik");
		Student obj3=new Student(103,"Sarvesh");
		System.out.println(obj1.rollno);
		System.out.println(obj1.name);
		System.out.println(obj2.rollno);
		System.out.println(obj2.name);
		System.out.println(obj3.rollno);
		System.out.println(obj3.name);
		
		}
}
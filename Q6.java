import java.io.*;
import java.util.*;
abstract class Info{
	abstract void show();
}
class Show extends Info{
	void show(){
		System.out.println("Name: Avinash");
		System.out.println("Age: 68");
		System.out.println("Salary: 222.22");
	}
}

class Q6{
	public static void main(String args[]){
	Show s = new Show();
	s.show();
	}
}
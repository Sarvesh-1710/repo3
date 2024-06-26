import java.io.*;
import java.util.*;
interface Detail{
	public void getName(String name);
}
class Show implements Detail{
	public void getName(String name){
		System.out.println("Name: "+name);
	}
}
class Q4{
	public static void main(String args[]){
		Show s = new Show();
		String name = "Sarvesh";
		s.getName(name);
	}
}
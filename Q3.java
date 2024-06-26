class Shapes{
	void rect(){
		System.out.println("Rectangle");
	}
	void cir(){
		System.out.println("Circle");
	}
	void tri(){
		System.out.println("Traingle");
	}
}
class Show extends Shapes{
	void rect(){
		System.out.println("Drawing Rectangle");
	}
	void cir(){
		System.out.println(" Drawing Circle");
	}
	void tri(){
		System.out.println(" Drawing Traingle");
	}
}
class Q3{
	public static void main(String args[]){
		Show s = new Show();
		s.rect();
		s.cir();
		s.tri();
	}
}
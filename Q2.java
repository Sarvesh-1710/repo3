class Animal{
	void cat(){
		System.out.println("Cat");
	}
	void dog(){
		System.out.println("Dog");
	}
}
class Sound extends Animal{
	void cat(){
		System.out.println("Cat sound: Mau Mau");
	}
	void dog(){
		System.out.println("Dog sound: bhau bhau");
	}
}
class Q2{
	public static void main(String args[]){
		Sound s = new Sound();
		s.cat();
		s.dog();
	}
}
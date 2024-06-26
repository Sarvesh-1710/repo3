class Info{
	 private String name = "Rakib";
	 private int rn = 14;
}
class Show extends Info{
	void show(){
		try{
			System.out.println("Name: "+name);
			System.out.println("Roll no: "+rn);
		}catch(Exception e){
			System.out.println("Don't access value because private Access modifie");
		}
	}
}
class Q7{
	public static void main(String args[]){
		Show s = new Show();
		s.show();
	}
}
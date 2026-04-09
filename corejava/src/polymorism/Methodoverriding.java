package polymorism;

class Father{
	int a=9;
	void drink() {
		System.out.println("tea");
		}

}
class son extends Father{
	@Override 
	void drink() {
		System.out.println("old monk");
	}
}
public class Methodoverriding{
	public static void main(String[] args) {
		son s=new son();
		s.drink();
		
	}
}
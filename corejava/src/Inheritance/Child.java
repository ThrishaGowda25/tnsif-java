package Inheritance;

public class Child extends Father{
String cycle="pink";
void read() {
	System.out.println("java");
}

public static void main(String[] args) {
	Child c=new Child();
	System.out.println(c.money);
	c.drink();
	System.out.println(c.car);
}
}
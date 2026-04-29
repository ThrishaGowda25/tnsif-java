package abstraction;
// demo for abstraction

abstract class Demo{
	public void calling() { // Concrete method
		System.out.println("calling");
	}
	public abstract void AllIntegration(); //abstract method
	public abstract void Satelitedemo();
	public abstract void healthmonitoring();	
}

 class Test1 extends Demo{
	@Override
	public void AllIntegration() {
		System.out.println("welcome");		
	}
	@Override
	public void Satelitedemo() {
		System.out.println("welcome to python");	
	}
	@Override
	public void healthmonitoring() {
		System.out.println("welcome to ai");		
	}
}
public class Abstraction_Demo {
	public static void main(String[] args) {
	Test1 t=new Test1();
	t.AllIntegration();
	t.healthmonitoring();
	t.Satelitedemo();	
	}	
}
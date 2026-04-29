package interfacedemo;

interface Smartdevice {
  void turnOn();
  void turnOff();
  void getStatus();
}

class Smartlight implements Smartdevice{

	@Override
	public void turnOn() {
		System.out.println("light on");
	}

	@Override
	public void turnOff() {
		System.out.println("light off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("study mode on");
		
	}
	
}
public class Interfacedemo{
	public static void main(String[] args) {
		Smartlight s=new Smartlight();
		s.turnOn();
		s.turnOff();
		s.getStatus();
	}
}
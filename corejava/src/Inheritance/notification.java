package Inheritance;

public class notification {
String mess="default notify";

class pushnotification extends notification{
	String mess="push notificaton";
	void disc() {
		System.out.println("child"+mess);
		System.out.println("parent"+super.mess);
	}

		public static void main(String[] args) {
			pushnotification p=new pushnotification();
			p.disc();
	}
		}
}

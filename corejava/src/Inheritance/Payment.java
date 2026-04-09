package Inheritance;

public class Payment {
void process() {
	System.out.println("processing the payment");
}

class Gpay extends Payment() {
	void process() {
		System.out.println("Processing via gpay");
	}
	void dis() {
		super.process();
		process();
	}
	
}

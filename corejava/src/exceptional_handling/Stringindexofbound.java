package exceptional_handling;

public class Stringindexofbound {
public static void main(String[] args) {
	String str="atria college";
	try {
		char ch=str.charAt(20);
	}
	catch(StringIndexOutOfBoundsException r) {
		System.out.println("exception caught");
	}
}
}

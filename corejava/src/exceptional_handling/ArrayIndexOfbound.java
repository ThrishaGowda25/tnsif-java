package exceptional_handling;

public class ArrayIndexOfbound {
public static void main(String[] args) {
	int[] a = {1,2,3,4};
	try {
		System.out.println(a[5]);
	}
	catch(Exception h) {
		System.out.println(h);
		
	}
}
}

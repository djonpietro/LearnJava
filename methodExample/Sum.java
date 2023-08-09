package methodExample;

public class Sum {
	public static void main (String[] args) {
		int a = 10, b = 30, s;
		
		s = sum(a, b);
		
		System.out.println("s = " + s);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}

}

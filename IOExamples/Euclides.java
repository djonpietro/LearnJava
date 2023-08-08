package IOExamples;

public class Euclides {

	public static void main(String[] args) {
		int dividendo, divisor, resto;
		
		dividendo = 50;
		divisor = 45;
		resto = dividendo % divisor;
		
		while (resto != 0) {
			dividendo = divisor; divisor = resto;
			resto = dividendo % divisor;
		}
		
		System.out.println("MDC = " + divisor);
	}
}

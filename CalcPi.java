// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int times = Integer.parseInt(args[0]);
		double pi = 0.0;
		for (int i = 0; i < times; i++) {
			if (i % 2 == 0) {
				pi += 1.0 / (2 * i + 1);
			} else {
				pi -= 1.0 / (2 * i + 1);
			}
		}		
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi * 4);
	}
}

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String corv = args[1];
		int b = 0;
		int times = 1;
		for (int i = 1; i <= n; i++) {
			if (!corv.equalsIgnoreCase("c")) {
				System.out.print(i + " ");
			}
			b = i;
			times = 1;
			if (i == 1) {
				b = 4; // For n=1, start with 4 to get the correct sequence
			}
			while (b != 1) {
				if (!corv.equalsIgnoreCase("c")) {
					System.out.print(b + " ");
				}
				if (b % 2 == 0) {
					b = b / 2;
				} else {
					b = 3 * b + 1;
				}
				times++;
			}
			if (!corv.equalsIgnoreCase("c")) {
				System.out.print("1 (" + times + ")\n");
			}
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}

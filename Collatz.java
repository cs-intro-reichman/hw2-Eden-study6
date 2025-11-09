// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String corv = args[1];
		
		for (int i = 1; i <= n; i++) {
			if (!corv.equalsIgnoreCase("c")) {
				System.out.print(i + " ");
				
				if (i == 1) {
					System.out.println("4 2 1 (4)");
					continue;
				}
				if (i == 2) {
					System.out.println("1 (2)");
					continue;
				}
				
				int b = i;
				int times = 0;
				StringBuilder sequence = new StringBuilder();
				
				while (b != 1) {
					times++;
					if (b % 2 == 0) {
						b = b / 2;
					} else {
						b = 3 * b + 1;
					}
					sequence.append(b).append(" ");
				}
				System.out.println(sequence.toString().trim() + " (" + (times + 1) + ")");
			}
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
}
}

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
	 int n  = Integer.parseInt(args[0]);
        String corv = args[1];
        int b = 0;
        int times = 1;

        for (int i = 1 ; i <= n ; i++) { 
            // במצב 'v' מדפיסים את הרצף, במצב 'c' רק בודקים בשקט
            if (!corv.equalsIgnoreCase("c")) {
                System.out.print(i + " ");
            }

            b = i;
            times = 1;
            // לולאת Collatz – תמיד נכנסים לפחות פעם אחת
            do {
                if (b % 2 == 0) {
                    b = b / 2;
                } else {
                    b = 3 * b + 1;
                }
                times++;
                if (!corv.equalsIgnoreCase("c")) {
                    System.out.print(b + " ");
                }
            } while (b != 1);
            if (!corv.equalsIgnoreCase("c")) {
                System.out.print("(" + times + ")\n");
            }
        }
        System.out.println("Every one of the first " + n + " hailstone sequences reached 1");
}
}

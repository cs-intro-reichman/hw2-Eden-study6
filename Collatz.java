// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int n  = Integer.parseInt(args[0]);
		String corv = args[1];
		int b = 0 ;
		int times = 1 ; 
		for (int i = 1 ; i <= n ; i ++)
		 { 
			if (!corv.equalsIgnoreCase("c") ) { System.out.print(i + " "); }
		 b=i;
		 if (b == 1)
		 { b= b + 2;}
		 times = 1 ;
			while (b!=1)
			{ 
				times++;
			if(b% 2 == 0 )
			{
				b= b/2;
			}
				else {
				b = 3*b + 1;
			}
			if (!corv.equalsIgnoreCase("c")) {System.out.print(b + " "); }
			} 
			if (!corv.equalsIgnoreCase("c")) { System.out.print("(" + times + ")\n");}
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1");
	}
}

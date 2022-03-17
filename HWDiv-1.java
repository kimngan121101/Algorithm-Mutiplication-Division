
import java.util.*;
import java.lang.*;
import java.io.*;

public class HWDiv {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hardware Dvision - N. Hoang\n");
		System.out.print("Dividend? ");
		long dividend = scan.nextLong();
		System.out.print("Divisor? ");
		long divisor = scan.nextLong();
		System.out.println();
		
		long[] results = HWDivision(dividend,divisor);
		
		System.out.println("Algo: " + dividend + " / " + divisor + " = " + results[0] + ", remainder = " + results[1]);
		System.out.println("Java: " + dividend + " / " + divisor + " = " + (long) dividend / (long) divisor + ", remainder = " + (long) dividend % (long) divisor);
		
	}
	public static long[] HWDivision(long d1, long d2) {
		if (d1 == 1 << 63 && d2 == -1)
			return new long[] { (1 << 63) - 1, (1 << 63) - 1};
		
		long D1 = Math.abs(d1), D2 = Math.abs(d2), n = 0, x = 0;
		
		while (D1 - D2 >= 0) {
			for (x = 0; D1 - (D2 << x << 1) >= 0; x++);
			n += 1 << x;
			D1 -= D2 << x;
		}
		return (d1 > 0) == (d2 > 0) ? new long[] {n,D1} : new long[] {-n,D1};
	}

}


import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class HWMult {

	public static void main(String[] args) {
		int multiplier, multiplicant;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hardware Multiply - N. Hoang\n");
		System.out.print("Multiplier? ");
		multiplier = scan.nextInt();
		System.out.print("Multiplicant? ");
		multiplicant = scan.nextInt();
		System.out.println();
		
		HWMultiplication(multiplier, multiplicant);
		
		System.out.println("Java: " + multiplier + " x " + multiplicant + " = " + (long) multiplier * (long) multiplicant);

	}
	
	public static void HWMultiplication(int multiplier, int multiplicant) {
		long result = 0;
		long t1 = multiplier, t2 = multiplicant;
		int n = 0;
		
		while (n < 32) {
			long msb = t1 & 0x1;
			if (msb == 1)
				result += t2;
			t2 = t2 << 1;
			t1 = t1 >> 1;
			n ++;
		}
		
		System.out.println ("Algo: " + multiplier + " x " + multiplicant + " = " + result);
	}

}

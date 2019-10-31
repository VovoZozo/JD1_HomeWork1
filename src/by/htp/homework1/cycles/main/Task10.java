package by.htp.homework1.cycles.main;

import java.math.BigInteger;

public class Task10 {
	//10. Составить программу нахождения произведения квадратов первых двухсот чисел.
	public static void main(String[] args) {
		System.out.println("Task10");
		proc();
	}
	public static void proc() {
		BigInteger pe = new BigInteger("1");
		BigInteger ep = new BigInteger("1");
		long d = 1;
		for (int i = 1;i<=200;i++) {
			d = i*i;
			ep = BigInteger.valueOf(d);
			pe = pe.multiply(ep);
		}
		System.out.println("Gроизведение квадратов первых двухсот чисел: " + pe);
	}
}

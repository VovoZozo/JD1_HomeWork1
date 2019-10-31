package by.htp.homework1.cycles.main;

import java.math.BigInteger;
import java.util.Scanner;

public class Task25 {
	//25. Требуется определить факториал числа, которое ввел пользователь.
	public static void main(String[] args) {
		System.out.println("Task25");
		int a = scan();
		proc( a);
	}
	public static void proc(int a) {
		BigInteger pe = new BigInteger("1");
		BigInteger ep = new BigInteger("1");
		for (int i=1;i<=a;i++) {
			ep = BigInteger.valueOf(i);
			pe = pe.multiply(ep);
		}
		System.out.println("факториал числа " + a + " = " + pe);
	}
	public static int scan() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите любое натуральное число: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите любое натуральное число: ");
		}
		int a = Math.abs(sc.nextInt());
		return a;
	}
}

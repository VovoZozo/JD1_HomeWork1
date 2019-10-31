package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task14 {
	//14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
	public static void main(String[] args) {
		System.out.println("Task14");
		int n = random(1000);
		print("n = ", n);
		proc( n);
	}
	public static void proc(int n) {
		double sum = 1.0;
		for (int i = 2; i<=n; i++) {
			sum += 1.0*1/i;
		}
		System.out.println("1 + 1/2 + 1/3 + 1/4 + ... + 1/n = " + sum);
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
}

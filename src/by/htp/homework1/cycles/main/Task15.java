package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task15 {
	//15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
	public static void main(String[] args) {
		System.out.println("Task15");
		int n = random(100);
		print("n = ", n);
		proc( n);
	}
	public static void proc(int n) {
		double sum = 1;
		for (int i = 2; i<=n; i = i*2) {
			sum += Math.pow(i, 10);
		}
		System.out.println("1+2+4+8+...+ n в 10 степени = " + sum);
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

package by.htp.homework1.branch.main;

import java.util.Random;

public class Task30 {
	/*
	30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их
	абсолютными значениями, если это не так.
	*/
	public static void main(String[] args) {
		System.out.println("task30");
		double a = random(10);
		double b = random(10);
		double c = random(10);
		print("Число а -- ", a);
		print("Число b -- ", b);
		print("Число c -- ", c);
		proc( a,  b,  c);
	}
	public static void proc(double a, double b, double c) {
		if (a>b&&b>c) {
			System.out.println("а > b > с");
			a=a*2;
			b=b*2;
			c=c*2;
		} else {
			a=Math.abs(a);
			b=Math.abs(b);
			c=Math.abs(c);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static double random(double a) {
		Random rand = new Random();
		double x = Math.pow(-rand.nextDouble()*a,rand.nextInt(6));
		return x;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

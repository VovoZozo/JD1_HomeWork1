package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task17 {
	//17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
	public static void main(String[] args) {
		System.out.println("Task17");
		int n = randomInt(100);
		double a = randomDouble(100);
		printInt("n = ", n);
		printDouble("a = ", a);
		proc( a,  n);
	}
	public static void proc(double a, int n) {
		double pr = a;
		for (int i = 1; i<n; i++) {
			pr = pr*(a+i);
		}
		System.out.println("a(a+1)...(a+n-1) = " + pr);
	}
	public static void printInt(String s, int a) {
		System.out.println(s + a);
	}
	public static void printDouble(String s, double a) {
		System.out.println(s + a);
	}
	public static int randomInt(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
	public static double randomDouble(int a) {
		Random rand = new Random();
		double x = rand.nextDouble()*a;
		return x;
	}
}

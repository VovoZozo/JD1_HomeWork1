package by.htp.homework1.branch.main;

import java.util.Random;

public class Task18 {
	//18. Подсчитать количество отрицательных среди чисел а, b, с.
	public static void main(String[] args) {
		System.out.println("task18");
		double a = random(100);
		double b = -random(100);
		double c = random(100);
		print("Число 1 -- ", a);
		print("Число 2 -- ", b);
		print("Число 3 -- ", c);
		print("Количество отрицательных чисел ", proc( a,  b,  c));
	}
	public static int proc(double a, double b, double c) {
		int count = 0;
		if (a<0) {
			count++;
		}
		if (b<0) {
			count++;
		}
		if (c<0) {
			count++;
		}
		return count;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static double random(int a) {
		Random rand = new Random();
		double x = Math.pow(-rand.nextDouble()*a, rand.nextInt(10));
		return x;
	}
}

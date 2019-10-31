package by.htp.homework1.branch.main;

import java.util.Random;

public class Task20 {
	//20. Определить, делителем каких чисел а, b, с является число k.
	public static void main(String[] args) {
		System.out.println("task20");
		int a = random(100);
		int b = random(100);
		int c = random(100);
		int k = random(10)+1;
		print("Число а -- ", a);
		print("Число b -- ", b);
		print("Число c -- ", c);
		print("Число k -- ", k);
		proc( a,  b,  c,  k);
	}
	public static void proc(int a, int b, int c, int k) {
		
		if (a%k==0) {
			System.out.println("k делитель числа "  + a);
		}
		if (b%k==0) {
			System.out.println("k делитель числа "  + b);
		}
		if (c%k==0) {
			System.out.println("k делитель числа "  + c);
		}
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

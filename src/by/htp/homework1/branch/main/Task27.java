package by.htp.homework1.branch.main;

import java.util.Random;

public class Task27 {
	//27. Найти max{min(a, b), min(c, d)}.
	public static void main(String[] args) {
		System.out.println("task27");
		int a = random(100);
		int b = random(100);
		int c = random(100);
		int d = random(100);
		print("Число а -- ", a);
		print("Число b -- ", b);
		print("Число c -- ", c);
		print("Число d -- ", d);
		proc( a,  b,  c,  d);
	}
	public static void proc(int a, int b, int c, int d) {
		int max;
		int min1;
		int min2;
		if (a<b) {
			min1=a;
		} else min1=b;
		if (c<d) {
			min2=c;
		} else min2=d;
		if (min1>=min2) {
			max=min1;
		} else max=min2;
		print("max{min(a, b), min(c, d)} = ", max);
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

package by.htp.homework1.branch.main;

import java.util.Random;

public class Task28 {
	/*
	28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то
	найти max(d — a, d — b, d —c).
	*/
	public static void main(String[] args) {
		System.out.println("task28");
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
		if (a==d||b==d||c==d) {
			if (a==d) {
				System.out.println("a=d");
			}
			if (b==d) {
				System.out.println("b=d");
			}
			if (c==d) {
				System.out.println("c=d");
			}
		}
		else {
			if (a<d) {
				System.out.println("max(d-a)= " + d);
			}
			else {
				System.out.println("max(d-a)= " + a);
			}
			if (b<d) {
				System.out.println("max(d-b)= " + d);
			}
			else {
				System.out.println("max(d-b)= " + b);
			}
			if (c<d) {
				System.out.println("max(d-c)= " + d);
			}
			else {
				System.out.println("max(d-c)= " + c);
			}
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

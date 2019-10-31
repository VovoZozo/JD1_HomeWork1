package by.htp.homework1.branch.main;

import java.util.Random;

public class Task02 {
	/*
	 * 2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран
	 * 	слово «yes», в противном случае – слово «no»
	 */
	public static void main(String[] args) {
		System.out.println("task02");
		int a = random(1000);
		int b = random(1000);
		print("Число а -- ", a);
		print("Число b -- ", b);
		proc( a,  b);
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
	public static void printString(String s) {
		System.out.println(s);
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
	public static void proc(int a, int b) {
		if (a<b) {
			printString("a<b Yes");
		} else {
			printString("a<b NO");
		}
	}
}

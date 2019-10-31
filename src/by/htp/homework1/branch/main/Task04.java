package by.htp.homework1.branch.main;

import java.util.Random;

public class Task04 {
	//4. Составить программу: равны ли два числа а и b?
	public static void main(String[] args) {
		System.out.println("task04");
		int a = random(10);
		int b = random(10);
		print("Число а -- ", a);
		print("Число b -- ", b);
		proc( a,  b);
	}
	public static void proc(int a, int b) {
		if (a==b) {
			printString("a=b Yes");
		} else {
			printString("a=b NO");
		}
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
}

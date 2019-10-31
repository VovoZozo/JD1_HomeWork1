package by.htp.homework1.branch.main;

import java.util.Random;

public class Task08 {
	//8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
	public static void main(String[] args) {
		System.out.println("task08");
		int a = random(10);
		int b = random(10);
		print("Число а -- ", a);
		print("Число b -- ", b);
		proc( a, b);
	}
	public static void proc(int a,int b) {
		if (a*a!=b*b) {
			if (a*a<b*b) {
				printString("Меньше квадрат числа a");
			} else {
				printString("Меньше квадрат числа b");
			}
		} else {
			printString("a и b равны");
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

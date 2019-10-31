package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task33 {
	//33. Найдите наибольшую цифру данного натурального числа.
	public static void main(String[] args) {
		System.out.println("Task33");
		int a = randomInt(1000000000);
		printInt("Дано число а = ",  a);
		proc( a);
	}
	public static void proc(int a) {
		int max = 0;
		for (int i = 10; a>0;) {
			if (a%10>max) {
				max =  a%10;
			}
			a = a/i;
		}
		System.out.println("Наибольшая цифра числа а: " + max);
	}
	public static int randomInt(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
	public static void printInt(String s, int a) {
		System.out.println(s + a);
	}
}

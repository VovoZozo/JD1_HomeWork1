package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task35 {
	//35. Найдите количество четных цифр данного натурального числа.
	public static void main(String[] args) {
		System.out.println("Task35");
		int a = randomInt(1000000000);
		printInt("Дано число а = ",  a);
		proc( a);
	}
	public static void proc(int a) {
		int count = 0;
		for (int i = 10; a>0;) {
			int b = a%10;
			if (b%2==0) {
				count++;
			}
			a = a/i;
		}
		printInt("Количество четных цифр заданного числа: ", count);
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

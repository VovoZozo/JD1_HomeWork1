package by.htp.homework1.branch.main;

import java.util.Random;

public class Task03 {
	/*
	3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово
	«yes», если число а меньше 3; если больше, то вывести слово «no».
	*/
	public static void main(String[] args) {
		System.out.println("task03");
		int a = random(10);
		int b = 3;
		print("Число а -- ", a);
		print("Число b -- ", b);
		proc( a,  b);
	}
	public static void proc(int a, int b) {
		if (a<b) {
			printString("a<b Yes");
		} else {
			printString("a<b NO");
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

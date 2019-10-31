package by.htp.homework1.branch.main;

import java.util.Random;

public class Task01 {
	/*
	1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран
	цифру 7, в противном случае – цифру 8.
	*/
	public static void main(String[] args) {
		System.out.println("task01");
		int a = random(1000);
		int b = random(1000);
		print("Число а -- ", a);
		print("Число b -- ", b);
		proc(a,b);
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
	public static void proc(int a, int b) {
		if (a<b) {
			print("a<b ", 7);
		} else {
			print("a>=b ", 8);
		}
	}
}

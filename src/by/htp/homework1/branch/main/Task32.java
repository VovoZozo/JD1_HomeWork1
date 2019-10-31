package by.htp.homework1.branch.main;

import java.util.Random;

public class Task32 {
	/*
	32. Написать программу, которая по заданным трем числам определяет, является ли сумма
	каких-либо двух из них положительной.
	*/
	public static void main(String[] args) {
		System.out.println("task32");
		int a = random(100);
		int b = random(100);
		int c = random(100);
		print("Число а -- ", a);
		print("Число b -- ", b);
		print("Число c -- ", c);
		proc( a,  b,  c);
	}
	public static void proc(int a, int b, int c) {
		int sum1 = a+b;
		int sum2 = a+c;
		int sum3 = b+c;
		if (sum1>0||sum2>0||sum3>0) {
			System.out.println("Положительная сумма возможна");
		} else {
			System.out.println("Положительная сумма НЕ возможна");
		}
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
	public static int random(int a) {
		Random rand = new Random();
		double x = Math.pow(-rand.nextInt(a), rand.nextInt(5));
		return (int) x;
	}
}

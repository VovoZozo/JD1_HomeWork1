package by.htp.homework1.branch.main;

import java.util.Scanner;

public class Task23 {
	/*
	23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц —
			от 1 до 12). Если введены некорректные данные, то сообщить об этом.
	*/
	public static void main(String[] args) {
		System.out.println("task23");
		int a = check(1, 31, "число");
		int b = check(1, 12, "месяц");
		System.out.println("Введенные данные корректны");
		System.out.println(b + "-й месяц, " + a + "-ое число");
	}
	public static int check(int a, int b, String s) {
		int c = 0;
		while (c<a||c>b) {
			c = scan(a,b, s);
			if (c<a||c>b) {
				System.out.println("Введенно некоректное значение.");
			}
		}
		return c;
	}
	public static int scan(int a, int b, String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите " + s + " — от " + a + " до " + b);
		while (!sc.hasNextInt()) {
			System.out.println("Введите число — от " + a + " до " + b);
			sc.next();
		}
		int c = sc.nextInt();
		return c;
	}
}

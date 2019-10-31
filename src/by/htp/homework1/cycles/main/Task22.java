package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task22 {
	/*
	22. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом
	h. Результат представить в виде таблицы, первый столбец которой – значения аргумента,
	второй - соответствующие значения функции:
	F(x) = x − sin^2( x)
	*/
	public static void main(String[] args) {
		System.out.println("Task22");
		int a = randomInt(100);
		int b = randomInt(1000);
		int h = randomInt(10);
		printInt("a = ", a);
		printInt("b = ", b);
		printInt("h = ", h);
		proc( a,  b,  h);
	}
	public static void proc(int a, int b, int h) {
		for (int i=a;i<=b;i=i+h) {
			double f = Math.pow(Math.sin(i),2);
			System.out.println(i + " " + f);
		}
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

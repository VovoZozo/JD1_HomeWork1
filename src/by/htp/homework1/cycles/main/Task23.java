package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task23 {
	/*
	23. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом
	h. Результат представить в виде таблицы, первый столбец которой – значения аргумента,
	второй - соответствующие значения функции:
	*/
	public static void main(String[] args) {
		System.out.println("Task23");
		double a = randomDouble()/100;
		double b = randomDouble();
		double h = randomDouble()/10;
		printDouble("a = ", a);
		printDouble("b = ", b);
		printDouble("h = ", h);
		proc( a,  b,  h);
	}
	public static void proc(double a, double b, double h) {
		for (double i=a;i<=b;i=i+h) {
			double f = 1.0/Math.tan(i/3)+0.5*Math.asin(i);
			System.out.println(i + " " + f);
		}
	}
	public static double randomDouble() {
		Random rand = new Random();
		double x = rand.nextDouble();
		return x;
	}
	public static void printDouble(String s, double a) {
		System.out.println(s + a);
	}
}

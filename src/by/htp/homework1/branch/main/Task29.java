package by.htp.homework1.branch.main;

import java.util.Random;

public class Task29 {
	/*
	29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на
	одной прямой.
	*/
	public static void main(String[] args) {
		System.out.println("task29");
		int x1 = random(100);
		int y1 = random(100);
		int x2 = random(100);
		int y2 = random(100);
		int x3 = random(100);
		int y3 = random(100);
		print("A x1 -- ", x1);
		print("A y1 -- ", y1);
		print("B x2 -- ", x2);
		print("B y2 -- ", y2);
		print("C x3 -- ", x3);
		print("C y3 -- ", y3);
		task29( x1,  y1,  x2,  y2,  x3,  y3);
	}
	public static void task29(int x1, int y1, int x2, int y2, int x3, int y3) {
		if (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки НЕ лежат на одной прямой");
		}
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
}

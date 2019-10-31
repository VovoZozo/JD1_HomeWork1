package by.htp.homework1.branch.main;

import java.util.Random;

public class Task13 {
	/*
	13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из
	точек находится ближе к началу координат.
	*/
	public static void main(String[] args) {
		System.out.println("task13");
		int x1 = random(10)+1;
		int y1 = random(10)+1;
		int x2 = random(10)+1;
		int y2 = random(10)+1;
		print("Точка 1 x -- ", x1);
		print("Точка 1 y -- ", y1);
		print("Точка 2 x -- ", x2);
		print("Точка 2 y -- ", y2);
		findCoord( x1,  y1,  x2,  y2);
	}
	public static void findCoord(int x1, int y1, int x2, int y2) {
		if (Math.sqrt(x1*x1+y1*y1)<Math.sqrt(x2*x2+y2*y2)) {
			System.out.println("Точка 1 ближе к началу координат");
		} else {
			System.out.println("Точка 2 ближе к началу координат");
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

package by.htp.homework1.branch.main;

import java.util.Random;

public class Task22 {
	/*
	22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих
	значений, а в y - меньшее.
	*/
	public static void main(String[] args) {
		System.out.println("task22");
		int x = random(100);
		int y = random(100);
		print("Переменная x -- ", x);
		print("Переменная y -- ", y);
		int t = 0;
		if (x<y) {
			t=x;
			x=y;
			y=t;
		}
		System.out.println("Перераспределенное значение переменных");
		print("Переменная x -- ", x);
		print("Переменная y -- ", y);
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

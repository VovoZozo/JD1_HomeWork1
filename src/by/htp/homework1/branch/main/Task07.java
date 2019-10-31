package by.htp.homework1.branch.main;

import java.util.Random;

public class Task07 {
	/*
	7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
	значениях a, b, c и х
	*/
	public static void main(String[] args) {
		System.out.println("task07");
		int a = random(10);
		int b = random(10);
		print("Число а -- ", a);
		print("Число b -- ", b);
		int c = random(10);
		int x = random(10);
		print("Число c -- ", c);
		print("Число x -- ", x);
		int d  = function( a,  b,  c,  x);
		prod(d);
	}
	public static void prod(int d) {
		if (d<0) {
			print("Модуль || выражения a*x*x + b*x + c === ", (-d));
		} else {
			print("Модуль || выражения a*x*x + b*x + c === ", d);
		}
	}
	public static int function(int a, int b, int c, int x) {
		int d = a*x*x+b*x+c;
		return d;
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

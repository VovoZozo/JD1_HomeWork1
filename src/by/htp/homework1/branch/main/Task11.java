package by.htp.homework1.branch.main;

import java.util.Random;

public class Task11 {
	//11. Составить программу, которая определит площадь какого треугольника больше.
	public static void main(String[] args) {
		System.out.println("task11");
		double a = random(100);
		double b = random(100);
		print("Площадь первого треугольника -- ", a);
		print("Площадь второго треугольника b -- ", b);
		if (a!=b) {
			if (a>b) {
				printString("Больше площадь первого треугольника");
			} else {
				printString("Больше площадь второго треугольника");
			}
		} else {
			printString("Площади треугольников равны");
		}
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static void printString(String s) {
		System.out.println(s);
	}
	public static double random(int a) {
		Random rand = new Random();
		double x = rand.nextDouble()*a;
		return x;
	}
}

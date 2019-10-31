package by.htp.homework1.branch.main;

import java.util.Random;

public class Task10 {
	//10. Составить программу, которая определит площадь какого круга меньше.
	public static void main(String[] args) {
		System.out.println("task10");
		double a = random(100);
		double b = random(100);
		print("Площадь первого круга -- ", a);
		print("Площадь второго круга b -- ", b);
		if (a!=b) {
			if (a<b) {
				printString("Меньше площадь первого круга");
			} else {
				printString("Меньше площадь второго круга");
			}
		} else {
			printString("Площади кругов равны");
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

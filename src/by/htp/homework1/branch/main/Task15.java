package by.htp.homework1.branch.main;

import java.util.Random;

public class Task15 {
	/*
	15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел
	заменить половиной их суммы, а большее — их удвоенным произведением.
	*/
	public static void main(String[] args) {
		System.out.println("task15");
		double a = random(100);
		double b = random(100);
		print("Число 1 -- ", a);
		print("Число 2 -- ", b);
		proc( a,  b);
	}
	public static void proc(double x, double y) {
		if (x<y) {
			System.out.println("Число 1 меньше Числа 2");
			print("x=", (x+y)/2);
			print("y=", x*y*2);
		} else {
			System.out.println("Число 2 меньше Числа 1");
			print("x=", x*y*2);
			print("y=", (x+y)/2);
		}
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static double random(int a) {
		Random rand = new Random();
		double x = rand.nextDouble()*a;
		return x;
	}
}

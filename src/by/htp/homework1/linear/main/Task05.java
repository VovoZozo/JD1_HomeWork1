package by.htp.homework1.linear.main;

import java.util.Random;

public class Task05 {
	//5. Составить алгоритм нахождения среднего арифметического двух чисел
	public static void main(String[] args) {
		System.out.println("task05");
		double x = random();
		double y = random();
		print("x: ",x);
		print("y: ",y);
		print("Cреднее арифметическое двух чисел = ",average(x,y));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*1000;
		return x;
	}
	public static double average(double x, double y) {
		double average = (x+y)/2;
		return average;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

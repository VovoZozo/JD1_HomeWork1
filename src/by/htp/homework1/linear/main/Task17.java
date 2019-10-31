package by.htp.homework1.linear.main;

import java.util.Random;

public class Task17 {
	/*
	17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
	геометрическое модулей этих чисел.
	*/
	public static void main(String[] args) {
		System.out.println("task17");
		double number1 = random();
		print("Число 1: ", number1);
		double number2 = random();
		print("Число 2: ", number2);
		print("Среднее арифметическое кубов: ", ar(number1,number2));
		print("Среднее геометрическое: ", gem(number1,number2));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*100;
		return x;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static double ar(double a, double b) {
		double ar = (Math.pow(a, 3)+Math.pow(b, 3))/2;
		return ar;
	}
	public static double gem(double a, double b) {
		double gem = Math.sqrt(Math.abs(a)*Math.abs(b));
		return gem;
	}
}

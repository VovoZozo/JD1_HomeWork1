package by.htp.homework1.branch.main;

import java.util.Random;

public class Task12 {
	/*
	12. Даны три действительных числа. Возвести в квадрат те из них, значения которых
	неотрицательны, и в четвертую степень — отрицательные.
	*/
	public static void main(String[] args) {
		System.out.println("task12");
		double a = random(100);
		double b = -random(100);
		double c = random(100);
		print("Число 1 -- ", a);
		print("Число 2 -- ", b);
		print("Число 3 -- ", c);
		proc(a);
		proc(b);
		proc(c);
	}
	public static void proc(double a) {
		if (a>0) {
			System.out.println("Число " +  a  + " неотрицательное . Возводим в квадрат = " + pow2( a));
		} else {
			System.out.println("Число " +  a  + " отрицательное. Возводим в четвертую степень = " + pow4( a));
		}
	}
	public static double pow2(double a) {
		return Math.pow(a, 2);
	}
	public static double pow4(double a) {
		return Math.pow(a, 4);
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

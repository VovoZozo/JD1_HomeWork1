package by.htp.homework1.branch.main;

import java.util.Random;

public class Task14 {
	/*
	14. Даны два угла треугольника (в градусах). Определить, существует ли такой
	треугольник, и если да, то будет ли он прямоугольным.
	*/
	public static void main(String[] args) {
		System.out.println("task14");
		double a = random(100);
		double b = random(100);
		print("Угол 1 -- ", a);
		print("Угол 2 -- ", b);
		proc( a,  b);
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static double random(int a) {
		Random rand = new Random();
		double x = rand.nextDouble()*a;
		return x;
	}
	public static void proc(double a, double b) {
		if ((a+b)<180) {
			System.out.println("Треугольник существует");
			if ((180-(a+b))==90) {
				System.out.println("Треугольник прямоугольный");
			} else {
				System.out.println("Треугольник не прямоугольный");
			}
		} else {
			System.out.println("Треугольник существует");
		}
	}
}

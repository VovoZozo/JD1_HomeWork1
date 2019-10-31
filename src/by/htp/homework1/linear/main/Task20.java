package by.htp.homework1.linear.main;

import java.util.Random;

public class Task20 {
	//20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
	public static void main(String[] args) {
		System.out.println("task20");
		double a = random();
		print("Длинна окружности: ", a);
		print("Площадь круга: ", area(a));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*100;
		return x;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static double area(double a) {
		double p = (a*a)/(4*Math.PI);
		return p;
	}
}

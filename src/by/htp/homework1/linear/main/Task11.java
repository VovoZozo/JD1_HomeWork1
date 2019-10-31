package by.htp.homework1.linear.main;

import java.util.Random;

public class Task11 {
	/*
	11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
	катетов.
	*/
	public static void main(String[] args) {
		System.out.println("task11");
		double x = random();
		double y = random();
		double c = cat3(x,y);
		double perimetr = perimetr(x, y, c);
		double area = area(x,y,c, perimetr);
		print("x: ",x);
		print("y: ",y);
		print("Периметр треугольника: ", perimetr);
		print("Площадь треугольника: ", area);
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*1000;
		return x;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static double cat3(double a, double b) {
		double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		return c;
	}
	public static double perimetr(double a, double b, double c) {
		double perimetr = a+b+c;
		return perimetr;
	}
	public static double area(double a, double b, double c, double perimetr) {
		double p = perimetr/2;
		double area = Math.sqrt(p*((p-a)*(p-b)*(p-c)));
		return area;
	}
}

package by.htp.homework1.linear.main;

import java.util.Random;

public class Task07 {
	/*
	 * 7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь
	 * 	прямоугольника
	*/
	public static void main(String[] args) {
		System.out.println("task07");
		double length = random();
		double width = length/2;
		double area = area(length,width);
		printdouble("Длинна прямоугольника: ",length);
		printdouble("Ширина прямоугольника: ",width);
		printdouble("Площадь прямоугольника: ",area);
	}
	public static double area(double a, double b) {
		double area = a*b;
		return area;
	}
	public static double random() {
		Random rand = new Random();
		double x = Math.abs((rand.nextDouble()+1)*100);
		return x;
	}
	public static void printdouble(String s, double a) {
		System.out.println(s + a);
	}
}

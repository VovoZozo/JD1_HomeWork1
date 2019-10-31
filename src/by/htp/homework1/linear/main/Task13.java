package by.htp.homework1.linear.main;

import java.util.Random;

public class Task13 {
	/*
	13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его
	периметр и площадь.
	*/
	public static void main(String[] args) {
		System.out.println("task13");
		double x1 = random();
		double y1 = random();
		print("x1: ",x1);
		print("y1: ",y1);
		double x2 = random();
		double y2 = random();
		print("x2: ",x2);
		print("y2: ",y2);
		double x3 = random();
		double y3 = random();
		print("x3: ",x3);
		print("y3: ",y3);
		double a = findA( x1,  y1,  x2,  y2);
		double b = findB( x2,  y2, x3,  y3);
		double c = findC( x1,  y1,  x3,  y3);
		double perimetr =  perimetr( a,  b,  c);
		double area =  area( a,  b,  c,  perimetr);
		print("Периметр треугольника: ", perimetr);
		print("Площадь треугольника: ", area);
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*100;
		return x;
	}
	public static double findA(double x1, double y1, double x2, double y2) {
		double a = Math.abs(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		return a;
	}
	public static double findB(double x2, double y2,double x3, double y3) {
		double b = Math.abs(Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2)));
		return b;
	}
	public static double findC(double x1, double y1, double x3, double y3) {
		double c = Math.abs(Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2)));
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
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

package by.htp.homework1.linear.main;

import java.util.Random;

public class Task19 {
	/*
	19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его
	высоту, радиусы вписанной и описанной окружностей.
	*/
	public static void main(String[] args) {
		System.out.println("task19");
		double a = random();
		print("Сторона равностороннего треугольника: ", a);
		print("Площадь", area(a));
		print("Высота ", hight(a));
		print("Радиус вписанной окружности ", rIn(a));
		print("Радиус описанной окружности ", rOut(a));
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
		double area = (Math.pow(a,2)*Math.sqrt(3))/4;
		return area;
	}
	public static double hight(double a) {
		double hight = (a*Math.sqrt(3))/2;
		return hight;
	}
	public static double rIn(double a) {
		double rIn = (a*Math.sqrt(3))/3;
		return rIn;
	}
	public static double rOut(double a) {
		double rOut = ((a*Math.sqrt(3))/3)/2;
		return rOut;
	}
}

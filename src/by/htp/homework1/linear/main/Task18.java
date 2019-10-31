package by.htp.homework1.linear.main;

import java.util.Random;

public class Task18 {
	/*
	18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем
	этого куба.
	*/
	public static void main(String[] args) {
		System.out.println("task18");
		double number1 = random();
		print("Длинна ребра куба: ", number1);
		print("Площадь грани ", areaG(number1));
		print("Общая площадь ", areaF(number1));
		print("Объем ", vol(number1));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*100;
		return x;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static double areaG(double a) {
		double pl = Math.pow(a, 2);
		return pl;
	}
	public static double areaF(double a) {
		double pO = Math.pow(a, 2)*6;
		return pO;
	}
	public static double vol(double a) {
		double ful = Math.pow(a, 3);
		return ful;
	}
}

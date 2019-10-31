package by.htp.homework1.linear.main;

import java.util.Random;

public class Task01 {
	/* 1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и
		частное.
	 */
	public static void main(String[] args) {
		System.out.println("task01");
		double x = random();
		double y = random();
		print("x: ",x);
		print("y: ",y);
		print("sum: ",sum(x,y));
		print("substract: ",substract(x,y));
		print("composition: ",composition(x,y));
		print("quotient: ",quotient(x,y));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*1000;
		return x;
	}
	public static double sum(double x, double y) {
		double sum = x+y;
		return sum;
	}
	public static double substract(double x, double y) {
		double substract = x-y;
		return substract;
	}
	public static double composition(double x, double y) {
		double composition = x*y;
		return composition;
	}
	public static double quotient(double x, double y) {
		double quotient = x/y;
		return quotient;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

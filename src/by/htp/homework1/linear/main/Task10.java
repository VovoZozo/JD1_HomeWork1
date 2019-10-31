package by.htp.homework1.linear.main;

import java.util.Random;

public class Task10 {
	/*
	 * 10. Вычислить значение выражения по формуле (все переменные принимают
	 * 	действительные значения): 
	 */
	public static void main(String[] args) {
		System.out.println("task10");
		double x = random();
		double y = random();
		print("x: ",x);
		print("y: ",y);
		print("Значение функции: ", rez(x,y));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*1000;
		return x;
	}
	public static double rez(double x, double y) {
		double rez = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)+Math.sin(y)))*Math.tan(x*y);
		return rez;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

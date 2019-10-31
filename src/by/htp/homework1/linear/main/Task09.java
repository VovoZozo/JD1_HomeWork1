package by.htp.homework1.linear.main;

import java.util.Random;

public class Task09 {
	/*
	 * 9. Вычислить значение выражения по формуле (все переменные принимают
	 * 	действительные значения): 
	 */
	public static void main(String[] args) {
		System.out.println("task09");
		double a = random();
		double b = random();
		double c = random();
		double d = random();
		print("a: ",a);
		print("b: ",b);
		print("c: ",c);
		print("d: ",d);
		print("Значение функции: ", rez(a,b,c,d));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*1000;
		return x;
	}
	public static double rez(double a, double b, double c, double d) {
		double rez = ((a/c)*(b/d))-((a*b-c)/(c*d));
		return rez;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

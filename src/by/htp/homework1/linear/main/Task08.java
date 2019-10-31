package by.htp.homework1.linear.main;

import java.util.Random;

public class Task08 {
	/*
	 * 8. Вычислить значение выражения по формуле (все переменные принимают
	 * 	действительные значения): 
	 */
	public static void main(String[] args) {
		System.out.println("task08");
		double a = random();
		double b = random();
		double c = random();
		print("a: ",a);
		print("b: ",b);
		print("c: ",c);
		print("Значение функции: ", rez(a,b,c));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*1000;
		return x;
	}
	public static double rez(double a, double b, double c) {
		double rez = (b+Math.sqrt((Math.pow(b,2)+4*a*c)))/(2*a)-(Math.pow(a, 3)*c)+(Math.pow(b, (-2)));
		return rez;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

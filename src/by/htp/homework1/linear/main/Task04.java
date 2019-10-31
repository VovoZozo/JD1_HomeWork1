package by.htp.homework1.linear.main;

import java.util.Random;

public class Task04 {
	//4. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
	public static void main(String[] args) {
		System.out.println("task04");
		double a = random();
		double b = random();
		double c = random();
		print("a: ",a);
		print("b: ",b);
		print("c: ",c);
		print("z = ( (a � 3 ) * b / 2) + c = ",function(a,b,c));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*1000;
		return x;
	}
	public static double function(double a, double b, double c) {
		double function = ( (a - 3 ) * b / 2) + c;
		return function;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

package by.htp.homework1.linear.main;

import java.util.Random;

public class Task03 {
	//3. Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.
	public static void main(String[] args) {
		System.out.println("task03");
		double x = random();
		double y = random();
		print("x: ",x);
		print("y: ",y);
		print("z = 2 * x + ( y � 2 ) * 5 = ",function(x,y));
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*1000;
		return x;
	}
	public static double function(double x, double y) {
		double function = 2*x+(y-2)*5;
		return function;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

package by.htp.homework1.branch.main;

import java.util.Random;

public class Task39 {
	//39. Вычислить значение функции:
	public static void main(String[] args) {
		System.out.println("task39");
		double x = random(1000);
		print("X = ", x);
		double rez = proc(x);
		print("Результат функции: ", rez);
	}
	public static double proc(double x) {
		double rez;
		if (x>=8) {
			rez=-x*x+x-9;
		} else {
			rez=1/(x*x*x*x-6);
		}
		return rez;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static double random(int a) {
		Random rand = new Random();
		double x = rand.nextDouble()*a;
		return x;
	}
}

package by.htp.homework1.branch.main;

import java.util.Random;

public class Task38 {
	//38. Вычислить значение функции:
	public static void main(String[] args) {
		System.out.println("task38");
		double x = random(1000);
		print("X = ", x);
		double rez = proc(x);
		print("Результат функции: ", rez);
	}
	public static double proc(double x) {
		double rez;
		if (x<=3&&x>=0) {
			rez=x*x;
		} else {
			rez=4;
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

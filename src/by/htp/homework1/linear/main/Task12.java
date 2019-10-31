package by.htp.homework1.linear.main;

import java.util.Random;

public class Task12 {
	//12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
	public static void main(String[] args) {
		System.out.println("task12");
		double x1 = random();
		double y1 = random();
		print("x1: ",x1);
		print("y1: ",y1);
		double x2 = random();
		double y2 = random();
		print("x2: ",x2);
		print("y2: ",y2);
		double length = task12rez(x1,y1,x2,y2);
		print("Расстояние между точками: ", length);
	}
	public static double task12rez(double x1, double y1, double x2, double y2) {
		double rez = Math.abs(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		return rez;
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*100;
		return x;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
}

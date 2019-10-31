package by.htp.homework1.linear.main;

import java.util.Random;

public class Task14 {
	//14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
	public static void main(String[] args) {
		System.out.println("task14");
		double rad = random();
		print("Радиус: ",rad);
		double leng =  leng( rad);
		double ares = area( rad);
		print("Длинна окружности�: ",leng);
		print("Площадь круга: ",ares);
	}
	public static double random() {
		Random rand = new Random();
		double x = rand.nextDouble()*100;
		return x;
	}
	public static void print(String s, double a) {
		System.out.println(s + a);
	}
	public static double leng(double rad) {
		double leng = 2*Math.PI*rad;
		return leng;
	}
	public static double area(double rad) {
		double area = Math.round(Math.PI * Math.pow(rad, 2));
		return area;
	}
}

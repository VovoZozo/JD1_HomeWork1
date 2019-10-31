package by.htp.homework1.branch.main;

import java.util.Random;

public class Task16 {
	/*
	16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена
	(на какой оси или в каком координатном угле).
	*/
	public static void main(String[] args) {
		System.out.println("task16");
		double a = random(100);
		double b = random(100);
		print("Координата х точки А -- ", a);
		print("Координата y точки А -- ", b);
		System.out.print("Точка А находится в ");
		proc( a,  b);
	}
	public static void proc(double x, double y) {
		if (x>0&&y>0) {
			System.out.println("первой четверти");
		} 
		else if (x<0&&y>0) {
			System.out.println("второй четверти");
		}
		else if (x<0&&y<0) {
			System.out.println("третьей четверти");
		}
		else if (x>0&&y<0) {
			System.out.println("четвертой четверти");
		}
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

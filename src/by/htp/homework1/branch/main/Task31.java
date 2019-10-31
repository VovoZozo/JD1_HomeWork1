package by.htp.homework1.branch.main;

import java.util.Random;

public class Task31 {
	/*
	31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
	пройдет ли кирпич через отверстие.
	*/
	public static void main(String[] args) {
		System.out.println("task31");
		int a = random(100);
		int b = random(100);
		int x = random(100);
		int y = random(100);
		int z = random(100);
		System.out.println("Размеры отверстия");
		print("A -- ", a);
		print("B -- ", b);
		System.out.println("Размеры кирпича");
		print("X -- ", x);
		print("Y -- ", y);
		print("Z -- ", z);
		int sAB = area(a,b);
		int minAB = minAB( a,  b);
		int minXYZ = minXYZ( x,  y, z);
		int minareaXYZ = minXYZ( area(x,y),  area(x,z), area(y,z));
		proc(minXYZ,minareaXYZ,minAB,sAB);
		
	}
	public static void proc(int a, int b, int c, int z) {
		if (a<=c&&b<=z) {
			System.out.println("Кирпич пройдет в отверстие");
		} else {
			System.out.println("Кирпич НЕ пройдет в отверстие");
		}
	}
	public static int minAB(int a, int b) {
		int min = 0;
		if (a<b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}
	public static int minXYZ(int a, int b, int c) {
		int min = 0;
		if (a<b) {
			if (a<c) {
				min=a;
			} else {
				min=c;
			}
		} else {
			if (b<c) {
				min=b;
			} else {
				min=c;
			}
		}
		return min;
	}
	public static int area(int a, int b) {
		int s = a*b;
		return s;
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
}

package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task08 {
	//8. Вычислить значения функции на отрезке [а,b] c шагом h:
	public static void main(String[] args) {
		System.out.println("Task07");
		int a = random(100);
		int b = random(100);
		int h = random(100);
		int c = random(100);
		print("A  -- ", a);
		print("B  -- ", b);
		print("H  -- ", h);
		print("C  -- ", h);
		System.out.println("Результат функции на отрезке [" + a + " - " + b + "] с шагом " + h + " равен: ");
		proc( a,  b,  h , c);
	}
	public static void proc(int a, int b, int h, int c) {
		for (int i = a;i<=b;i=i+h) {
			if (a==15) {
				int y = (i+c)*2;
				System.out.print(y + " ");
			} else {
				int y = (i-c)+6;
				System.out.print(y + " ");
			}
		}
		System.out.println();
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

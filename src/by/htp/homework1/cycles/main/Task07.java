package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task07 {
	//7. Вычислить значения функции на отрезке [а,b] c шагом h:
	public static void main(String[] args) {
		System.out.println("Task07");
		int a = random(1000);
		int b = random(1000);
		int h = random(100);
		print("A  -- ", a);
		print("B  -- ", b);
		print("H  -- ", h);
		System.out.println("Результат функции на отрезке [" + a + " - " + b + "] с шагом " + h + " равен: ");
		proc( a,  b,  h);
	}
	public static void proc(int a, int b, int h) {
		for (int i = a;i<=b;i=i+h) {
			if (a>2) {
				int y = i;
				System.out.print(y + " ");
			} else {
				int y = -i;
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

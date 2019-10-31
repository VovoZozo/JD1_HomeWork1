package by.htp.homework1.linear.main;

import java.util.Random;

public class Task02 {
	//2. Найдите значение функции: с = 3 + а.
	public static void main(String[] args) {
		System.out.println("task02");
		int a = random();
		print("a = ",a);
		print("� = 3 + � = ",function(a));
	}
	public static int function(int a) {
		int c = 3+a;
		return c;
	}
	public static int random() {
		Random rand = new Random();
		int x = rand.nextInt();
		return x;
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
}

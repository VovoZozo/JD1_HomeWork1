package by.htp.homework1.branch.main;

import java.util.Random;

public class Task17 {
	/*
	17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем
	же числом, равным большему из исходных, а если равны, то заменить числа нулями.
	*/
	public static void main(String[] args) {
		System.out.println("task17");
		int a = random(10);
		int b = random(10);
		print("Число а -- ", a);
		print("Число b -- ", b);
		if (a!=b) {
			if (a<b) {
				a=b;
			} else {
				b=a;
			}
		} else {
			a=0;
			b=0;
		}
		System.out.println("После проверки условия:");
		print("Число а -- ", a);
		print("Число b -- ", b);
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

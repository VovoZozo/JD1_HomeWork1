package by.htp.homework1.linear.main;

import java.util.Random;

public class Task16 {
	//16. Найти произведение цифр заданного четырехзначного числа.
	public static void main(String[] args) {
		System.out.println("task16");
		int number = random();
		print("Заданное число: ", number);
		print("Произведение цифр заданного числа: ", findqOfnumbers(number));
	}
	public static int findqOfnumbers(int a) {
		int b = a%10;
		int c = (a/10)%10;
		int d = (a/100)%10;
		int f = (a/1000)%10;
		int g = b*c*d*f;
		return g;
	}
	public static int random() {
		Random rand = new Random();
		int x = rand.nextInt(8999)+1000;
		return x;
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
}

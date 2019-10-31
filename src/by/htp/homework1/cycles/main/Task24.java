package by.htp.homework1.cycles.main;
import java.util.Scanner;

public class Task24 {
	/*
	24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
	Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по
	сравнению с введенным числом.
	*/
	public static void main(String[] args) {
		System.out.println("Task24");
		int a = scan();
		printInt("a = ", a);
		proc( a);
	}
	public static void proc(int a) {
		int sum = 0;
		int c;
		String num = "";
		for (int i=1; i<=a; i = i*10) {
			int b = a/i%10;
			if (b%2==0) {
				sum+=b;
			}
			num+=b;
		}
		c=Integer.parseInt(num);
		printInt("сумму четных цифр входящих в его состав: ", sum);
		printInt("Перевернутое число ", c);
	}
	public static int scan() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите любое натуральное число: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите любое натуральное число: ");
		}
		int a = Math.abs(sc.nextInt());
		return a;
	}
	public static void printInt(String s, int a) {
		System.out.println(s + a);
	}
}

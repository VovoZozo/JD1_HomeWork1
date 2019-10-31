package by.htp.homework1.branch.main;

import java.util.Scanner;

public class Task34 {
	/*
	34. Составить программу, реализующую эпизод применения компьютера в книжном
	магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
	если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем
	необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег
	недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
	*/
	public static void main(String[] args) {
		System.out.println("task34");
		int a = scan("Введите стоимость книг ");
		int b = scan("Введите сумму денег ");
		proc( a,  b);
	}
	public static void proc(int a, int b) {
		if (a==b) {
			System.out.println("Спасибо");
		}
		else if (a<b) {
			System.out.println("Возьмите сдачу: " + (b-a));
		}
		else {
			System.out.println("Недостаточно средств " + (a-b));
		}
	}
	public static int scan(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(s);
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println(s);
		}
		int a = sc.nextInt();
		return a;
	}
}

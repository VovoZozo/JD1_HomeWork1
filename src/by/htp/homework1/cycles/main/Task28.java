package by.htp.homework1.cycles.main;

import java.util.Scanner;

public class Task28 {
	/*
	28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /,
		*). Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный
		неверный знак операции, а также на ввод Y=0 при делении. Организовать возможность
		многократных вычислений без перезагрузки программа (т.е. построить цикл). В качестве
		символа прекращения вычислений принять ‘0’.
	*/
	public static void main(String[] args) {
		System.out.println("Task28");
		String exit = "0";
		String a = "";
		do {
			proc();
			a = scanExit();
		} while (!exit.equals(a));
	}
	public static void proc() {
		String op1 = "+";
		String op2 = "-";
		String op3 = "/";
		String op4 = "*";
		double x = scanDouble();
		double y = scanDouble();
		String operator = scanOpperand();
		double rez = 0;
		if (op1.equals(operator)) {
			rez = sum( x,  y);
		}
		if (op2.equals(operator)) {
			rez = substract( x,  y);
		}
		if (op3.equals(operator)) {
			if (y!=0) {
				rez = quotient( x,  y);
			} else {
				System.out.println("Деление на ноль невозможно!!!");
				return;
			}
		}
		if (op4.equals(operator)) {
			rez = composition( x,  y);
		}
		System.out.println(x + " " + operator + " " + y + " = " + rez);
	}
	public static double sum(double x, double y) {
		double sum = x+y;
		return sum;
	}
	public static double substract(double x, double y) {
		double substract = x-y;
		return substract;
	}
	public static double composition(double x, double y) {
		double composition = x*y;
		return composition;
	}
	public static double quotient(double x, double y) {
		double quotient = x/y;
		return quotient;
	}
	public static double scanDouble() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите любое действительное число");
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите любое действительное число");
		}
		double a = sc.nextDouble();
		return a;
	}
	@SuppressWarnings("unlikely-arg-type")
	public static String scanOpperand() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите операнд + - / * : ");
		String op1 = "+";
		String op2 = "-";
		String op3 = "/";
		String op4 = "*";
		while(op1.equals(sc.hasNext())||op2.equals(sc.hasNext())||op3.equals(sc.hasNext())||op4.equals(sc.hasNext())) {
			sc.next();
			System.out.println("Введите операнд + - / * : ");
		}
		String operator = sc.next();
		return operator;
	}
	public static String scanExit() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите любой символ для продолжения");
		System.out.println("Для выхода введите 0");
		String exit = sc.next();
		return exit;
	}
}

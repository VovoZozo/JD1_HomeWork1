package by.htp.homework1.cycles.main;

import java.util.Scanner;

public class Task06 {
	/*
	6. Напишите программу, где пользователь вводит любое целое положительное число. А
	программа суммирует все числа от 1 до введенного пользователем числа.
	*/
	public static void main(String[] args) {
		System.out.println("Task06");
		int b = scan();
		proc(b);
	}
	public static void proc(int b) {
		long sum = 0L;
		int a = 1;
		while (a<=b) {
			sum = sum + a;
			a++;
		} 
		System.out.println("Сумма чисел от 1 до " + b + " равна: " + sum);
	}
	public static int scan() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите любое целое положительное число: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите любое целое положительное число: ");
		}
		int a = sc.nextInt();
		return a;
	}
}

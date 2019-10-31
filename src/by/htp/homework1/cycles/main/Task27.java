package by.htp.homework1.cycles.main;

import java.util.Scanner;

public class Task27 {
	/*
	27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме
	единицы и самого числа. m и n вводятся с клавиатуры.
	*/
	public static void main(String[] args) {
		System.out.println("Task27");
		String scan = "Введите натуральное число: ";
		int m = scan(scan);
		scan = "Введите натуральное число больше предидущего: ";
		int n = 0;
		while (n<=m) {
			n = scan(scan);
		}
		proc( m,  n);
	}
	public static void proc(int m, int n) {
		for (int j=m;j<=n;j++) {
			System.out.print("Делитель числа " + j + ": ");
			for (int i =2; i<j; i++) {
				int del = j%i;
				if (del==0) {
					del=i;
					System.out.print(del + " ");
				}
			}
			System.out.println();
		}
	}
	public static int scan(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.print(s);
		}
		int a = Math.abs(sc.nextInt());
		return a;
	}
}

package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task20 {
	/*
	20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
	больше или равен заданному е. Общий член ряда имеет вид:
	*/
	public static void main(String[] args) {
		System.out.println("Task20");
		int n = randomInt(10);
		double e = randomDouble(10);
		printInt("n = ", n);
		printDouble("e = ", e);
		proc( e,  n);
	}
	public static void proc(double e, int n) {
		double sum = 0;
		double a;
		for (int i = 1; i<n; i++) {
			a=1.0/((3*i-2)*(3*i+1));
			if (Math.abs(a)>=e) {
				sum=sum+a;
			}
		}
		printDouble("Сумма тех членов ряда, модуль которых больше или равен заданному е : ", sum);
	}
	public static int randomInt(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
	public static double randomDouble(int a) {
		Random rand = new Random();
		double x = rand.nextDouble()/a;
		return x;
	}
	public static void printInt(String s, int a) {
		System.out.println(s + a);
	}
	public static void printDouble(String s, double a) {
		System.out.println(s + a);
	}
}

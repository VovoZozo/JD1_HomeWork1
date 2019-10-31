package by.htp.homework1.branch.main;

import java.util.Random;

public class Task26 {
	//26. Написать программу нахождения суммы большего и меньшего из трех чисел.
	public static void main(String[] args) {
		System.out.println("task26");
		int a = random(100);
		int b = random(100);
		int c = random(100);
		int sum = proc( a,  b,  c);
		print("Число а -- ", a);
		print("Число b -- ", b);
		print("Число c -- ", c);
		print("Cумма большего и меньшего -- ", sum);
	}
	public static int proc(int a, int b, int c) {
		int max = 0;
		int min = 0;
		if (a>b) {
			if (a>c) {
				max = a;
			} 
			else {
				max = c;
			}
		} 
		else if (b>c) {
			max = b;
		} 
		else {
			max=c;
		}
		if (a<b) {
			if (a<c) {
				min = a;
			} 
			else {
				min = c;
			}
		} 
		else if (b<c) {
			min = b;
		} 
		else {
			min=c;
		}
		return max+min;
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
}

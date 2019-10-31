package by.htp.homework1.branch.main;
import java.util.Random;
public class Task09 {
	/*
	9. Составить программу, которая определит по трем введенным сторонам, является ли
	данный треугольник равносторонним.
	*/
	public static void main(String[] args) {
		System.out.println("task09");
		int a = random(10)+1;
		int b = random(10)+1;
		int c = random(10)+1;
		print("Сторона треугольника а -- ", a);
		print("Сторона треугольника b -- ", b);
		print("Сторона треугольника c -- ", c);
		find( a, b,  c);
	}
	public static void find(int a,int b, int c) {
		if ((a+b)>c&&(a+c)>b&&(c+b)>a) {
			if (a==b&&b==c) {
				printString("Треугольник равносторонний");
			} else {
				printString("Треугольник не равносторонний");
			}
		} else {
			printString("Треугольник не существует");
		}
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
	public static void printString(String s) {
		System.out.println(s);
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
}

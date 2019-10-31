package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task38 {
	/*
	38. Для заданного натурального числа определить, образуют ли его цифры
	арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр. Например:
	1357, 963.
	*/
	public static void main(String[] args) {
		System.out.println("Task38");
		int a = randomInt(899999);
		printInt("Дано число а = ",  a);
		int degreeOfnumber = findDegree(a);
		int constanta = findConstant( a, degreeOfnumber);
		proc( a,  degreeOfnumber,  constanta);
	}
	public static void proc(int a, int degreeOfnumber, int constanta) {
		int count = 1;
		for (int i=0; i<degreeOfnumber-1; i++) {
			int nextconst = (a/(int) Math.pow(10,i))%10 - (a/(int) Math.pow(10,i+1))%10;
			if (nextconst==constanta) {
				count++;
			}
		}
		if (count==degreeOfnumber) {
			System.out.println("Последовательность цифр данного числа является арифметической прогрессей");
		} else {
			System.out.println("Последовательность цифр данного числа НЕ является арифметической прогрессей");
		}
	}
	public static int findDegree(int a) {
		int degree = 0;
		for (int i = 1; i<=a; i=i*10) {
			degree++;
		}
		return degree;
	}
	public static int findConstant(int a, int degreeOfnumber) {
		int d =  (a/ (int) Math.pow(10,degreeOfnumber-2)%10)-(a/ (int) Math.pow(10,degreeOfnumber-1));
		return d;
	}
	public static int randomInt(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a)+1000;
		return x;
	}
	public static void printInt(String s, int a) {
		System.out.println(s + a);
	}
}

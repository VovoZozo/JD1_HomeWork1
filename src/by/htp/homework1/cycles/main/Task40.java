package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task40 {
	/*
	40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка
	на все свои цифры.
	*/
	public static void main(String[] args) {
		System.out.println("Task40");
		int a = randomInt(10000);
		printInt("Дано число а = ",  a);
		int lengOfnumber = lengOfnumber(a);
		printInt("degreeOfnumber = ",  lengOfnumber);
		proc( a,  lengOfnumber);
	}
	public static void proc(int a, int lengOfnumber) {
		for (int j=1; j<=a; j++) {
			int count = 0;
			for (int i=1; i<=j; i = i*10) {
				int b = j/i%10;
				if (b==0) {
					break;
				}
				if (j%b==0) {
					count+=b*i;
				}
			}
			if (count==j) {
				printInt("Число делиться на все свои цифры --- ",  count);
			}
		}
	}
	public static int lengOfnumber(int a) {
		int lengOfnumber = 0;
		for (int i = 1; i<=a; i=i*10) {
			lengOfnumber++;
		}
		return lengOfnumber;
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

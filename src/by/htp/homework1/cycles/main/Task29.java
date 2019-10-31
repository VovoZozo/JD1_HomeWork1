package by.htp.homework1.cycles.main;

import java.util.Random;

public class Task29 {
	/*
	29. Даны два числа. Определить цифры, входящие в запись как первого так и второго
	числа.
	*/
	public static void main(String[] args) {
		System.out.println("Task29");
		double a = randomDouble(10);
		double b = randomDouble(10);
		printDouble("a = ", a);
		printDouble("b = ", b);
		proc( a,  b);
	}
	public static void proc(double a, double b) {
		System.out.println("Число а и b содержат следующие одинаковые цифры");
		String s = String.valueOf(a);
		String w = String.valueOf(b);
		String rez = "";
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)==','||s.charAt(i)=='E') {
				continue;
			}
			for (int j=0; j<w.length(); j++) {
				
				if(s.charAt(i)==w.charAt(j)) {
					if(w.charAt(j)=='.'||w.charAt(j)=='E') {
						continue;
					}
					if (rez.indexOf(s.charAt(i))!=-1) {
						continue;
					} else {
						rez = rez + s.charAt(i);
					}
				}
			}
		}
		System.out.println(rez);
	}
	public static void printDouble(String s, double a) {
		System.out.println(s + a);
	}
	public static double randomDouble(int a) {
		Random rand = new Random();
		double x = rand.nextDouble()*a;
		return Math.abs(x);
	}
}

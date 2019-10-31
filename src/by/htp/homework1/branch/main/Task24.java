package by.htp.homework1.branch.main;

import java.util.Random;

public class Task24 {
	/*
	24. Составить программу, определяющую результат гадания на ромашке — «любит—не
	любит», взяв за исходное данное количество лепестков п.
	*/
	public static void main(String[] args) {
		System.out.println("task24");
		int a = random(100);
		System.out.println("У ромашки " + a + " лепестков");
		proc(a);
		
	}
	public static void proc(int n) {
		if (n%2==0) {
			System.out.println("Не любит!");
		} else {
			System.out.println("Любит!");
		}
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
}

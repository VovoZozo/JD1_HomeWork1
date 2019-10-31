package by.htp.homework1.branch.main;

import java.util.Random;

public class Task25 {
	/*
	25. Написать программу — модель анализа пожарного датчика в помещении, которая
	выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60°
	С.
	*/
	public static void main(String[] args) {
		System.out.println("task25");
		int a = random(100);
		System.out.println("Температура в помещении " + a + "°C.");
		proc(a);
	}
	public static void proc(int t) {
		if (t>60) {
			System.out.println("Пожароопасная ситуация!!!");
		}
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
}

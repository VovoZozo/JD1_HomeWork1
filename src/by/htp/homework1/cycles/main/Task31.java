package by.htp.homework1.cycles.main;

import java.util.Random;
import java.util.Scanner;

public class Task31 {
	/*
	31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек
	пытается их угадать. Программа должна выводить угаданные и неугаданные числа из тех,
	что сгенерировала программа, а также ошибочные числа пользователя.
	*/
	public static void main(String[] args) {
		System.out.println("Task31");
		proc();
	}
	public static void proc() {
		int count = 0;
		int [] c1mass = new int[5];
		for (int i=0; i<c1mass.length; i++) {
			c1mass[i] = randomInt(15)+1;
		}
		String[] find = new String[5];
		for (int i=0; i<find.length; i++) {
			find[i] = "*";
		}
		boolean exit = false;
		int pol;
		do {	
			pol = scan();
			for (int i=0; i<find.length; i++) {
				if (pol==c1mass[i]) {
					find[i] = c1mass[i]+"";
				} 
				System.out.print(find[i]+" ");
			}
			System.out.println();
			for (int i=0; i<c1mass.length; i++) {
				if (find[i].equals("*")) {
					exit = true;
					break;
				}
				exit = false;
			}
			count++;
		} while (exit);
		System.out.println("Все числа разгаданы!!!");
		System.out.println("Количество операций: " + count);
	}
	public static int scan() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число от 1 до 15: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите число от 1 до 15: ");
		}
		int pol = sc.nextInt();
		return pol;
	}
	public static int randomInt(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
}

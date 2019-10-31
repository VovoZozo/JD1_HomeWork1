package by.htp.homework1.branch.main;

import java.util.Random;

public class Task35 {
	//35. Вычислить число и месяц в невисокосном году по номеру дня.
	public static void main(String[] args) {
		System.out.println("task35");
		int a = random(365);
		print("День -- ", a);
		proc( a);
	}
	public static void proc(int a) {
		if (a>334) {
			System.out.println("Месяц " + 12 + " День " + (31-(365-a)));
		}
		else if (a>304) {
			System.out.println("Месяц " + 11 + " День " + (30-(334-a)));
		}
		else if (a>273) {
			System.out.println("Месяц " + 10 + " День " + (31-(304-a)));
		}
		else if (a>243) {
			System.out.println("Месяц " + 9 + " День " + (30-(273-a)));
		}
		else if (a>212) {
			System.out.println("Месяц " + 8 + " День " + (31-(243-a)));
		}
		else if (a>181) {
			System.out.println("Месяц " + 7 + " День " + (31-(212-a)));
		}
		else if (a>151) {
			System.out.println("Месяц " + 6 + " День " + (30-(181-a)));
		}
		else if (a>120) {
			System.out.println("Месяц " + 5 + " День " + (31-(151-a)));
		}
		else if (a>90) {
			System.out.println("Месяц " + 4 + " День " + (30-(121-a)));
		}
		else if (a>59) {
			System.out.println("Месяц " + 3 + " День " + (31-(90-a)));
		}
		else if (a>31) {
			System.out.println("Месяц " + 2 + " День " + (28-(59-a)));
		}
		else if (a>0) {
			System.out.println("Месяц " + 1 + " День " + a);
		}
	}
	public static void print(String s, int a) {
		System.out.println(s + a);
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a);
		return x;
	}
}

package by.htp.homework1.branch.main;

import java.util.Random;

public class Task33 {
	/*
	33. Написать программу, которая по паролю будет определять уровень доступа сотрудника
	к секретной информации в базе данных. Доступ к базе имеют только шесть человек,
	разбитых на три группы по степени доступа. Они имеют следующие пароли: 9583, 1747 —
	доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен
	модуль базы С.
	*/
	public static void main(String[] args) {
		System.out.println("task33");
		int a = random(8999);
		proc( a);
	}
	public static void proc(int a) {
		if (a==9583||a==1747) {
			System.out.println("доступны модули баз А, В, С");
		}
		else if (a==3331||a==7922) {
			System.out.println("доступны модули баз В, С");
		}
		else if (a==9455||a==8997) {
			System.out.println("доступен модуль базы  С");
		}
		else {
			System.out.println("В доступе отказано!!!");
		}
	}
	public static int random(int a) {
		Random rand = new Random();
		int x = rand.nextInt(a)+1000;
		return x;
	}
}

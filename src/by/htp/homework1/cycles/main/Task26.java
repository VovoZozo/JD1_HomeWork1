package by.htp.homework1.cycles.main;

public class Task26 {
	/*
	26. Вывести на экран соответствий между символами и их численными обозначениями в
	памяти компьютера (Таблицу ASCII).
	*/
	public static void main(String[] args) {
		System.out.println("Task26");
		System.out.println("Таблица ASCII");
		proc();
	}
	public static void proc() {
		char a;
		for (int i=32;i<127;i++) {
			a=(char)i;
			System.out.println(i + " " + a);
		}
	}
}

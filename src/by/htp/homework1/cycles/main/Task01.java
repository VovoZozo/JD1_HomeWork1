package by.htp.homework1.cycles.main;

public class Task01 {
	//1. Необходимо вывести на экран числа от 1 до 5.
	public static void main(String[] args) {
		System.out.println("Task01");
		proc(5);
	}
	public static void proc(int a) {
		for (int i=1;i<=a;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

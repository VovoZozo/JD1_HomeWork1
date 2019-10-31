package by.htp.homework1.cycles.main;

public class Task02 {
	//2. Необходимо вывести на экран числа от 5 до 1.
	public static void main(String[] args) {
		System.out.println("Task02");
		proc(5);
	}
	public static void proc(int a) {
		for (int i=a;i>=1;i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

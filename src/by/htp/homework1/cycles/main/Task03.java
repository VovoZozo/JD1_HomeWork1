package by.htp.homework1.cycles.main;

public class Task03 {
	//3. Необходимо вывести на экран таблицу умножения на 3:
	public static void main(String[] args) {
		System.out.println("Task03");
		proc(3,10);
	}
	public static void proc(int a, int b) {
		System.out.println("  " + a);
		for (int i=1;i<b;i++) {
			System.out.println(i + " " + i*a);
		}
	}
}

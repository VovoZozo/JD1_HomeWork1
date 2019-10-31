package by.htp.homework1.cycles.main;

public class Task11 {
	//11. Составить программу нахождения разности кубов первых двухсот чисел
	public static void main(String[] args) {
		System.out.println("Task11");
		proc();
	}
	public static void proc() {
		double sub = 0;
		for (int i = 1;i<=200;i++) {
			sub = sub - Math.pow(i, 3);
		}
		System.out.println("Разность кубов первых двухсот чисел: " + sub);
	}
}

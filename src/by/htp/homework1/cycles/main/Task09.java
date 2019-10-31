package by.htp.homework1.cycles.main;

public class Task09 {
	//9. Найти сумму квадратов первых ста чисел.
	public static void main(String[] args) {
		System.out.println("Task09");
		proc();
	}
	public static void proc() {
		double sum = 0;
		for (int i = 1;i<=100;i++) {
			sum = sum + i*i;
		}
		System.out.println("Cумма квадратов первых ста чисел: " + sum);
	}
}

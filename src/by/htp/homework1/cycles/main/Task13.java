package by.htp.homework1.cycles.main;

public class Task13 {
	//13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
	public static void main(String[] args) {
		System.out.println("Task13");
		System.out.println("Таблица значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5");
		printX(-5.000,5.000,0.500);
		proc(-5.000,5.000,0.500);
	}
	public static void printX(double a, double b, double i) {
		System.out.print("x= ");
		for (double j = a; j<=b; j = j+i) {
			if (j>=0) {
				System.out.print(" ");
			}
			System.out.printf("%.3f", j);
			System.out.print(" ");
		}
		System.out.println();
	}
	public static void proc(double a, double b, double j) {
		double y;
		System.out.print("y= ");
		for (double i = a; i<=b; i = i+j) {
			y = 5-(i*i)/2;
			if (y>=0) {
				System.out.print(" ");
			}
			System.out.printf("%.3f", y);
			System.out.print(" ");
		}
		System.out.println();
	}
}

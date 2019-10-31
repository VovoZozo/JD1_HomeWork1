package by.htp.homework1.cycles.main;

public class Task34 {
	//34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
	public static void main(String[] args) {
		System.out.println("Task34");
		proc();
	}
	public static void proc() {
		int sum = 0;
		for (int i = 1000; i<10000; i++) {
			sum = i%10+i/10%10+i/100%10+i/1000%10;
			if (sum == 15) {
				System.out.println("Сумма цифр числа " + i + " равна " + sum);
			}
		}
	}
}

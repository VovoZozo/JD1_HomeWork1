package by.htp.homework1.cycles.main;

public class Task05 {
	/*
	5. С помощью оператора while напишите программу определения суммы всех нечетных
	чисел в диапазоне от 1 до 99 включительно.
	*/
	public static void main(String[] args) {
		System.out.println("Task05");
		proc(1,99);
	}
	public static void proc(int a, int b) {
		int sum = 0;
		int c= a;
		while (a<=b) {
			sum += a;
			a= a+2;
		}
		System.out.print("суммы всех нечетных в диапазоне " + c + " - " + b + " : " + sum);
	}
}

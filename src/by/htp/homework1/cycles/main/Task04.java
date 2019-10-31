package by.htp.homework1.cycles.main;

public class Task04 {
	/*
	4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
	от 2 до 100 включительно.
	*/
	public static void main(String[] args) {
		System.out.println("Task04");
		proc(2,100);
	}
	public static void proc(int a, int b) {
		while (a<=b) {
			System.out.print(a + " ");
			a= a+2;
		} 
	}
}

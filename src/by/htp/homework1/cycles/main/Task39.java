package by.htp.homework1.cycles.main;

public class Task39 {
	/*
	39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили
	на 7, то получили исходное число. Найти это число.
	*/
	public static void main(String[] args) {
		System.out.println("Task39");
		proc();
	}
	public static void proc() {
		int a;
		for (int i=100; i<1000; i++) {
			a = i%100;
			if (a*7==i) {
				System.out.println(a + " " + i);
				break;
			}
		}
	}
}
